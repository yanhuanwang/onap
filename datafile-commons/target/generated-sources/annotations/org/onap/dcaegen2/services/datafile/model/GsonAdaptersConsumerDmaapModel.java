package org.onap.dcaegen2.services.datafile.model;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import javax.annotation.Generated;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code ConsumerDmaapModel}.
 * @see ImmutableConsumerDmaapModel
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "org.onap.dcaegen2.services.datafile.model.ConsumerDmaapModel"})
public final class GsonAdaptersConsumerDmaapModel implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (ConsumerDmaapModelTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new ConsumerDmaapModelTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersConsumerDmaapModel(ConsumerDmaapModel)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class ConsumerDmaapModelTypeAdapter extends TypeAdapter<ConsumerDmaapModel> {

    ConsumerDmaapModelTypeAdapter(Gson gson) {
    } 

    static boolean adapts(TypeToken<?> type) {
      return ConsumerDmaapModel.class == type.getRawType()
          || ImmutableConsumerDmaapModel.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, ConsumerDmaapModel value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeConsumerDmaapModel(out, value);
      }
    }

    @Override
    public ConsumerDmaapModel read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readConsumerDmaapModel(in);
    }

    private void writeConsumerDmaapModel(JsonWriter out, ConsumerDmaapModel instance)
        throws IOException {
      out.beginObject();
      out.name("pnf-name");
      out.value(instance.getPnfName());
      out.name("ipaddress-v4-oam");
      out.value(instance.getIpv4());
      out.name("ipaddress-v6-oam");
      out.value(instance.getIpv6());
      out.endObject();
    }

    private ConsumerDmaapModel readConsumerDmaapModel(JsonReader in)
        throws IOException {
      ImmutableConsumerDmaapModel.Builder builder = ImmutableConsumerDmaapModel.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableConsumerDmaapModel.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      switch (attributeName.charAt(0)) {
      case 'p':
        if ("pnf-name".equals(attributeName)) {
          readInPnfName(in, builder);
          return;
        }
        break;
      case 'i':
        if ("ipaddress-v4-oam".equals(attributeName)) {
          readInIpv4(in, builder);
          return;
        }
        if ("ipaddress-v6-oam".equals(attributeName)) {
          readInIpv6(in, builder);
          return;
        }
        break;
      default:
      }
      in.skipValue();
    }

    private void readInPnfName(JsonReader in, ImmutableConsumerDmaapModel.Builder builder)
        throws IOException {
      builder.pnfName(in.nextString());
    }

    private void readInIpv4(JsonReader in, ImmutableConsumerDmaapModel.Builder builder)
        throws IOException {
      builder.ipv4(in.nextString());
    }

    private void readInIpv6(JsonReader in, ImmutableConsumerDmaapModel.Builder builder)
        throws IOException {
      builder.ipv6(in.nextString());
    }
  }
}
