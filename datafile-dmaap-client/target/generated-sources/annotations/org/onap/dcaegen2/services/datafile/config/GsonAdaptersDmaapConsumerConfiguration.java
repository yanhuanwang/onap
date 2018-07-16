package org.onap.dcaegen2.services.datafile.config;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import javax.annotation.Generated;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code DmaapConsumerConfiguration}.
 * @see ImmutableDmaapConsumerConfiguration
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "org.onap.dcaegen2.services.datafile.config.DmaapConsumerConfiguration"})
public final class GsonAdaptersDmaapConsumerConfiguration implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (DmaapConsumerConfigurationTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new DmaapConsumerConfigurationTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersDmaapConsumerConfiguration(DmaapConsumerConfiguration)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class DmaapConsumerConfigurationTypeAdapter extends TypeAdapter<DmaapConsumerConfiguration> {
    public final Integer timeoutMSTypeSample = null;
    public final Integer messageLimitTypeSample = null;
    public final Integer dmaapPortNumberTypeSample = null;
    private final TypeAdapter<Integer> timeoutMSTypeAdapter;
    private final TypeAdapter<Integer> messageLimitTypeAdapter;
    private final TypeAdapter<Integer> dmaapPortNumberTypeAdapter;

    DmaapConsumerConfigurationTypeAdapter(Gson gson) {
      this.timeoutMSTypeAdapter = gson.getAdapter( Integer.class);
      this.messageLimitTypeAdapter = gson.getAdapter( Integer.class);
      this.dmaapPortNumberTypeAdapter = gson.getAdapter( Integer.class);
    } 

    static boolean adapts(TypeToken<?> type) {
      return DmaapConsumerConfiguration.class == type.getRawType()
          || ImmutableDmaapConsumerConfiguration.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, DmaapConsumerConfiguration value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeDmaapConsumerConfiguration(out, value);
      }
    }

    @Override
    public DmaapConsumerConfiguration read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readDmaapConsumerConfiguration(in);
    }

    private void writeDmaapConsumerConfiguration(JsonWriter out, DmaapConsumerConfiguration instance)
        throws IOException {
      out.beginObject();
      out.name("consumerId");
      out.value(instance.consumerId());
      out.name("consumerGroup");
      out.value(instance.consumerGroup());
      out.name("timeoutMS");
      timeoutMSTypeAdapter.write(out, instance.timeoutMS());
      out.name("messageLimit");
      messageLimitTypeAdapter.write(out, instance.messageLimit());
      out.name("dmaapHostName");
      out.value(instance.dmaapHostName());
      out.name("dmaapPortNumber");
      dmaapPortNumberTypeAdapter.write(out, instance.dmaapPortNumber());
      out.name("dmaapTopicName");
      out.value(instance.dmaapTopicName());
      out.name("dmaapProtocol");
      out.value(instance.dmaapProtocol());
      out.name("dmaapUserName");
      out.value(instance.dmaapUserName());
      out.name("dmaapUserPassword");
      out.value(instance.dmaapUserPassword());
      out.name("dmaapContentType");
      out.value(instance.dmaapContentType());
      out.endObject();
    }

    private DmaapConsumerConfiguration readDmaapConsumerConfiguration(JsonReader in)
        throws IOException {
      ImmutableDmaapConsumerConfiguration.Builder builder = new ImmutableDmaapConsumerConfiguration.Builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableDmaapConsumerConfiguration.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      switch (attributeName.charAt(0)) {
      case 'c':
        if ("consumerId".equals(attributeName)) {
          readInConsumerId(in, builder);
          return;
        }
        if ("consumerGroup".equals(attributeName)) {
          readInConsumerGroup(in, builder);
          return;
        }
        break;
      case 't':
        if ("timeoutMS".equals(attributeName)) {
          readInTimeoutMS(in, builder);
          return;
        }
        break;
      case 'm':
        if ("messageLimit".equals(attributeName)) {
          readInMessageLimit(in, builder);
          return;
        }
        break;
      case 'd':
        if ("dmaapHostName".equals(attributeName)) {
          readInDmaapHostName(in, builder);
          return;
        }
        if ("dmaapPortNumber".equals(attributeName)) {
          readInDmaapPortNumber(in, builder);
          return;
        }
        if ("dmaapTopicName".equals(attributeName)) {
          readInDmaapTopicName(in, builder);
          return;
        }
        if ("dmaapProtocol".equals(attributeName)) {
          readInDmaapProtocol(in, builder);
          return;
        }
        if ("dmaapUserName".equals(attributeName)) {
          readInDmaapUserName(in, builder);
          return;
        }
        if ("dmaapUserPassword".equals(attributeName)) {
          readInDmaapUserPassword(in, builder);
          return;
        }
        if ("dmaapContentType".equals(attributeName)) {
          readInDmaapContentType(in, builder);
          return;
        }
        break;
      default:
      }
      in.skipValue();
    }

    private void readInConsumerId(JsonReader in, ImmutableDmaapConsumerConfiguration.Builder builder)
        throws IOException {
      builder.consumerId(in.nextString());
    }

    private void readInConsumerGroup(JsonReader in, ImmutableDmaapConsumerConfiguration.Builder builder)
        throws IOException {
      builder.consumerGroup(in.nextString());
    }

    private void readInTimeoutMS(JsonReader in, ImmutableDmaapConsumerConfiguration.Builder builder)
        throws IOException {
      Integer value = timeoutMSTypeAdapter.read(in);
      builder.timeoutMS(value);
    }

    private void readInMessageLimit(JsonReader in, ImmutableDmaapConsumerConfiguration.Builder builder)
        throws IOException {
      Integer value = messageLimitTypeAdapter.read(in);
      builder.messageLimit(value);
    }

    private void readInDmaapHostName(JsonReader in, ImmutableDmaapConsumerConfiguration.Builder builder)
        throws IOException {
      builder.dmaapHostName(in.nextString());
    }

    private void readInDmaapPortNumber(JsonReader in, ImmutableDmaapConsumerConfiguration.Builder builder)
        throws IOException {
      Integer value = dmaapPortNumberTypeAdapter.read(in);
      builder.dmaapPortNumber(value);
    }

    private void readInDmaapTopicName(JsonReader in, ImmutableDmaapConsumerConfiguration.Builder builder)
        throws IOException {
      builder.dmaapTopicName(in.nextString());
    }

    private void readInDmaapProtocol(JsonReader in, ImmutableDmaapConsumerConfiguration.Builder builder)
        throws IOException {
      builder.dmaapProtocol(in.nextString());
    }

    private void readInDmaapUserName(JsonReader in, ImmutableDmaapConsumerConfiguration.Builder builder)
        throws IOException {
      builder.dmaapUserName(in.nextString());
    }

    private void readInDmaapUserPassword(JsonReader in, ImmutableDmaapConsumerConfiguration.Builder builder)
        throws IOException {
      builder.dmaapUserPassword(in.nextString());
    }

    private void readInDmaapContentType(JsonReader in, ImmutableDmaapConsumerConfiguration.Builder builder)
        throws IOException {
      builder.dmaapContentType(in.nextString());
    }
  }
}
