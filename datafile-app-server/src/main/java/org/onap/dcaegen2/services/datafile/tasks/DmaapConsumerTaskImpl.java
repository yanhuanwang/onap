/*
 * ============LICENSE_START=======================================================
 * PNF-REGISTRATION-HANDLER
 * ================================================================================
 * Copyright (C) 2018 NOKIA Intellectual Property. All rights reserved.
 * ================================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END=========================================================
 */
package org.onap.dcaegen2.services.datafile.tasks;

import java.util.Optional;
import org.onap.dcaegen2.services.datafile.model.ConsumerDmaapModel;
import org.onap.dcaegen2.services.datafile.config.DmaapConsumerConfiguration;
import org.onap.dcaegen2.services.datafile.configuration.AppConfig;
import org.onap.dcaegen2.services.datafile.configuration.Config;
import org.onap.dcaegen2.services.datafile.exceptions.DmaapNotFoundException;
import org.onap.dcaegen2.services.datafile.exceptions.PrhTaskException;

import org.onap.dcaegen2.services.datafile.service.DmaapConsumerJsonParser;
import org.onap.dcaegen2.services.datafile.service.consumer.ExtendedDmaapConsumerHttpClientImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author <a href="mailto:przemyslaw.wasala@nokia.com">Przemysław Wąsala</a> on 3/23/18
 */
@Component
public class DmaapConsumerTaskImpl extends
    DmaapConsumerTask<String, ConsumerDmaapModel, DmaapConsumerConfiguration> {

    private static final Logger logger = LoggerFactory.getLogger(DmaapConsumerTaskImpl.class);
    private final Config datafileAppConfig;
    private ExtendedDmaapConsumerHttpClientImpl extendedDmaapConsumerHttpClient;
    private DmaapConsumerJsonParser dmaapConsumerJsonParser;

    @Autowired
    public DmaapConsumerTaskImpl(AppConfig datafileAppConfig) {
        this.datafileAppConfig = datafileAppConfig;
        this.dmaapConsumerJsonParser = new DmaapConsumerJsonParser();
    }

    DmaapConsumerTaskImpl(AppConfig datafileAppConfig, DmaapConsumerJsonParser dmaapConsumerJsonParser) {
        this.datafileAppConfig = datafileAppConfig;
        this.dmaapConsumerJsonParser = dmaapConsumerJsonParser;
    }

    @Override
    ConsumerDmaapModel consume(String message) throws DmaapNotFoundException {
        logger.trace("Method called with arg {}", message);
        return dmaapConsumerJsonParser.getJsonObject(message);
    }

    @Override
    public ConsumerDmaapModel execute(String object) throws PrhTaskException {
        extendedDmaapConsumerHttpClient = resolveClient();
        logger.trace("Method called with arg {}", object);
        return consume((extendedDmaapConsumerHttpClient.getHttpConsumerResponse().orElseThrow(() ->
            new PrhTaskException("DmaapConsumerTask has returned null"))));
    }

    @Override
    void initConfigs() {
        datafileAppConfig.initFileStreamReader();
    }

    @Override
    DmaapConsumerConfiguration resolveConfiguration() {
        return datafileAppConfig.getDmaapConsumerConfiguration();
    }

    @Override
    ExtendedDmaapConsumerHttpClientImpl resolveClient() {
        return Optional.ofNullable(extendedDmaapConsumerHttpClient)
            .orElseGet(() -> new ExtendedDmaapConsumerHttpClientImpl(resolveConfiguration()));
    }
}