/*-
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
package org.onap.dcaegen2.services.datafile.configuration;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.onap.dcaegen2.services.datafile.IT.junit5.mockito.MockitoExtension;

/**
 * @author <a href="mailto:przemyslaw.wasala@nokia.com">Przemysław Wąsala</a> on 4/9/18
 */
@ExtendWith({MockitoExtension.class})
class DatafileAppConfigTest {

    private static final String PRH_ENDPOINTS = "prh_endpoints.json";
    private static final String jsonString = "{\"configs\":{\"aai\":{\"aaiClientConfiguration\":{\"aaiHost\":\"localhost\",\"aaiHostPortNumber\":8080,\"aaiIgnoreSSLCertificateErrors\":true,\"aaiProtocol\":\"https\",\"aaiUserName\":\"admin\",\"aaiUserPassword\":\"admin\",\"aaiBasePath\":\"/aai/v11\",\"aaiPnfPath\":\"/network/pnfs/pnf\",\"aaiHeaders\":{\"X-FromAppId\":\"prh\",\"X-TransactionId\":\"9999\",\"Accept\":\"application/json\",\"Real-Time\":\"true\",\"Authorization\":\"Basic QUFJOkFBSQ==\"}}},\"dmaap\":{\"dmaapConsumerConfiguration\":{\"consumerGroup\":\"other\",\"consumerId\":\"1\",\"dmaapContentType\":\"application/json\",\"dmaapHostName\":\"localhost\",\"dmaapPortNumber\":2222,\"dmaapProtocol\":\"http\",\"dmaapTopicName\":\"temp\",\"dmaapUserName\":\"admin\",\"dmaapUserPassword\":\"admin\",\"messageLimit\":1000,\"timeoutMS\":1000},\"dmaapProducerConfiguration\":{\"dmaapContentType\":\"application/json\",\"dmaapHostName\":\"localhost\",\"dmaapPortNumber\":2223,\"dmaapProtocol\":\"http\",\"dmaapTopicName\":\"temp\",\"dmaapUserName\":\"admin\",\"dmaapUserPassword\":\"admin\"}}}}";
    private static final String incorrectJsonString = "{\"configs\":{\"aai\":{\"aaiClientConfiguration\":{\"aaiHost\":\"localhost\",\"aaiHostPortNumber\":8080,\"aaiIgnoreSSLCertificateErrors\":true,\"aaiProtocol\":\"https\",\"aaiUserName\":\"admin\",\"aaiUserPassword\":\"admin\",\"aaiBasePath\":\"/aai/v11\",\"aaiPnfPath\":\"/network/pnfs/pnf\",\"aaiHeaders\":{\"X-FromAppId\":\"prh\",\"X-TransactionId\":\"9999\",\"Accept\":\"application/json\",\"Real-Time\":\"true\",\"Authorization\":\"Basic QUFJOkFBSQ==\"}}},\"dmaap\":{\"dmaapConsumerConfiguration\":{\"consumerGroup\":\"other\",\"consumerId\":\"1\",\"dmaapContentType\":\"application/json\",\"dmaapHostName\":\"localhost\",\"dmaapPortNumber\":2222,\"dmaapProtocol\":\"http\",\"dmaapTopicName\":\"temp\",\"dmaapUserName\":\"admin\",\"dmaapUserPassword\":\"admin\",\"messageLimit\":1000,\"timeoutMS\":1000},\"dmaapProducerConfiguration\":{\"dmaapContentType\":\"application/json\",\"dmaapHostName\":\"localhost\",\"dmaapPortNumber\":2223,\"dmaapProtocol\":\"http\",\"dmaaptopicName\":\"temp\",\"dmaapuserName\":\"admin\",\"dmaapuserPassword\":\"admin\"}}}}";
    private static DatafileAppConfig datafileAppConfig;
    private static AppConfig appConfig;

    private static String filePath = Objects
        .requireNonNull(DatafileAppConfigTest.class.getClassLoader().getResource(PRH_ENDPOINTS)).getFile();

    @BeforeEach
    public void setUp() {
        datafileAppConfig = spy(DatafileAppConfig.class);
        appConfig = spy(new AppConfig());
    }

    @Test
    public void whenApplicationWasStarted_FilePathIsSet() {
        //
        // When
        //
        datafileAppConfig.setFilepath(filePath);
        //
        // Then
        //
        verify(datafileAppConfig, times(1)).setFilepath(anyString());
        verify(datafileAppConfig, times(0)).initFileStreamReader();
        Assertions.assertEquals(filePath, datafileAppConfig.getFilepath());
    }

    @Test
    public void whenTheConfigurationFits_GetAaiAndDmaapObjectRepresentationConfiguration()
        throws IOException {
        //
        // Given
        //
        InputStream inputStream = new ByteArrayInputStream((jsonString.getBytes(
            StandardCharsets.UTF_8)));
        //
        // When
        //
        datafileAppConfig.setFilepath(filePath);
        doReturn(inputStream).when(datafileAppConfig).getInputStream(any());
        datafileAppConfig.initFileStreamReader();
        appConfig.dmaapConsumerConfiguration = datafileAppConfig.getDmaapConsumerConfiguration();
        appConfig.dmaapPublisherConfiguration = datafileAppConfig.getDmaapPublisherConfiguration();
        appConfig.aaiClientConfiguration = datafileAppConfig.getAAIClientConfiguration();
        //
        // Then
        //
        verify(datafileAppConfig, times(1)).setFilepath(anyString());
        verify(datafileAppConfig, times(1)).initFileStreamReader();
        Assertions.assertNotNull(datafileAppConfig.getAAIClientConfiguration());
        Assertions.assertNotNull(datafileAppConfig.getDmaapConsumerConfiguration());
        Assertions.assertNotNull(datafileAppConfig.getDmaapPublisherConfiguration());
        Assertions
            .assertEquals(appConfig.getDmaapPublisherConfiguration(), datafileAppConfig.getDmaapPublisherConfiguration());
        Assertions
            .assertEquals(appConfig.getDmaapConsumerConfiguration(), datafileAppConfig.getDmaapConsumerConfiguration());
        Assertions
            .assertEquals(appConfig.getAAIClientConfiguration(), datafileAppConfig.getAAIClientConfiguration());

    }

    @Test
    public void whenFileIsNotExist_ThrowIOException() {
        //
        // Given
        //
        filePath = "/temp.json";
        datafileAppConfig.setFilepath(filePath);
        //
        // When
        //
        datafileAppConfig.initFileStreamReader();
        //
        // Then
        //
        verify(datafileAppConfig, times(1)).setFilepath(anyString());
        verify(datafileAppConfig, times(1)).initFileStreamReader();
        Assertions.assertNull(datafileAppConfig.getAAIClientConfiguration());
        Assertions.assertNull(datafileAppConfig.getDmaapConsumerConfiguration());
        Assertions.assertNull(datafileAppConfig.getDmaapPublisherConfiguration());

    }

    @Test
    public void whenFileIsExistsButJsonIsIncorrect() throws IOException {
        //
        // Given
        //
        InputStream inputStream = new ByteArrayInputStream((incorrectJsonString.getBytes(
            StandardCharsets.UTF_8)));
        //
        // When
        //
        datafileAppConfig.setFilepath(filePath);
        doReturn(inputStream).when(datafileAppConfig).getInputStream(any());
        datafileAppConfig.initFileStreamReader();

        //
        // Then
        //
        verify(datafileAppConfig, times(1)).setFilepath(anyString());
        verify(datafileAppConfig, times(1)).initFileStreamReader();
        Assertions.assertNotNull(datafileAppConfig.getAAIClientConfiguration());
        Assertions.assertNotNull(datafileAppConfig.getDmaapConsumerConfiguration());
        Assertions.assertNull(datafileAppConfig.getDmaapPublisherConfiguration());

    }


    @Test
    public void whenTheConfigurationFits_ButRootElementIsNotAJsonObject()
        throws IOException {
        // Given
        InputStream inputStream = new ByteArrayInputStream((jsonString.getBytes(
            StandardCharsets.UTF_8)));
        // When
        datafileAppConfig.setFilepath(filePath);
        doReturn(inputStream).when(datafileAppConfig).getInputStream(any());
        JsonElement jsonElement = mock(JsonElement.class);
        when(jsonElement.isJsonObject()).thenReturn(false);
        doReturn(jsonElement).when(datafileAppConfig).getJsonElement(any(JsonParser.class), any(InputStream.class));
        datafileAppConfig.initFileStreamReader();
        appConfig.dmaapConsumerConfiguration = datafileAppConfig.getDmaapConsumerConfiguration();
        appConfig.dmaapPublisherConfiguration = datafileAppConfig.getDmaapPublisherConfiguration();
        appConfig.aaiClientConfiguration = datafileAppConfig.getAAIClientConfiguration();

        // Then
        verify(datafileAppConfig, times(1)).setFilepath(anyString());
        verify(datafileAppConfig, times(1)).initFileStreamReader();
        Assertions.assertNull(datafileAppConfig.getAAIClientConfiguration());
        Assertions.assertNull(datafileAppConfig.getDmaapConsumerConfiguration());
        Assertions.assertNull(datafileAppConfig.getDmaapPublisherConfiguration());
    }
}