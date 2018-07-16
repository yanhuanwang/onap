package org.onap.dcaegen2.services.datafile.config;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import javax.annotation.Generated;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code DmaapPublisherConfiguration}.
 * @see ImmutableDmaapPublisherConfiguration
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "org.onap.dcaegen2.services.datafile.config.DmaapPublisherConfiguration"})
public final class GsonAdaptersDmaapPublisherConfiguration implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (DmaapPublisherConfigurationTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new DmaapPublisherConfigurationTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersDmaapPublisherConfiguration(DmaapPublisherConfiguration)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class DmaapPublisherConfigurationTypeAdapter extends TypeAdapter<DmaapPublisherConfiguration> {
    public final Integer dmaapPortNumberTypeSample = null;
    private final TypeAdapter<Integer> dmaapPortNumberTypeAdapter;

    DmaapPublisherConfigurationTypeAdapter(Gson gson) {
      this.dmaapPortNumberTypeAdapter = gson.getAdapter( Integer.class);
    } 

    static boolean adapts(TypeToken<?> type) {
      return DmaapPublisherConfiguration.class == type.getRawType()
          || ImmutableDmaapPublisherConfiguration.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, DmaapPublisherConfiguration value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeDmaapPublisherConfiguration(out, value);
      }
    }

    @Override
    public DmaapPublisherConfiguration read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readDmaapPublisherConfiguration(in);
    }

    private void writeDmaapPublisherConfiguration(JsonWriter out, DmaapPublisherConfiguration instance)
        throws IOException {
      out.beginObject();
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

    private DmaapPublisherConfiguration readDmaapPublisherConfiguration(JsonReader in)
        throws IOException {
      ImmutableDmaapPublisherConfiguration.Builder builder = new ImmutableDmaapPublisherConfiguration.Builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableDmaapPublisherConfiguration.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      switch (attributeName.charAt(0)) {
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

    private void readInDmaapHostName(JsonReader in, ImmutableDmaapPublisherConfiguration.Builder builder)
        throws IOException {
      builder.dmaapHostName(in.nextString());
    }

    private void readInDmaapPortNumber(JsonReader in, ImmutableDmaapPublisherConfiguration.Builder builder)
        throws IOException {
      Integer value = dmaapPortNumberTypeAdapter.read(in);
      builder.dmaapPortNumber(value);
    }

    private void readInDmaapTopicName(JsonReader in, ImmutableDmaapPublisherConfiguration.Builder builder)
        throws IOException {
      builder.dmaapTopicName(in.nextString());
    }

    private void readInDmaapProtocol(JsonReader in, ImmutableDmaapPublisherConfiguration.Builder builder)
        throws IOException {
      builder.dmaapProtocol(in.nextString());
    }

    private void readInDmaapUserName(JsonReader in, ImmutableDmaapPublisherConfiguration.Builder builder)
        throws IOException {
      builder.dmaapUserName(in.nextString());
    }

    private void readInDmaapUserPassword(JsonReader in, ImmutableDmaapPublisherConfiguration.Builder builder)
        throws IOException {
      builder.dmaapUserPassword(in.nextString());
    }

    private void readInDmaapContentType(JsonReader in, ImmutableDmaapPublisherConfiguration.Builder builder)
        throws IOException {
      builder.dmaapContentType(in.nextString());
    }
  }
}
