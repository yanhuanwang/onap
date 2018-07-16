package org.onap.dcaegen2.services.datafile.config;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import java.util.Map;
import javax.annotation.Generated;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code AAIClientConfiguration}.
 * @see ImmutableAAIClientConfiguration
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "org.onap.dcaegen2.services.datafile.config.AAIClientConfiguration"})
public final class GsonAdaptersAAIClientConfiguration implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (AAIClientConfigurationTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new AAIClientConfigurationTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersAAIClientConfiguration(AAIClientConfiguration)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class AAIClientConfigurationTypeAdapter extends TypeAdapter<AAIClientConfiguration> {
    public final Integer aaiHostPortNumberTypeSample = null;
    public final Boolean aaiIgnoreSSLCertificateErrorsTypeSample = null;
    private final TypeAdapter<Integer> aaiHostPortNumberTypeAdapter;
    private final TypeAdapter<Boolean> aaiIgnoreSSLCertificateErrorsTypeAdapter;

    AAIClientConfigurationTypeAdapter(Gson gson) {
      this.aaiHostPortNumberTypeAdapter = gson.getAdapter( Integer.class);
      this.aaiIgnoreSSLCertificateErrorsTypeAdapter = gson.getAdapter( Boolean.class);
    } 

    static boolean adapts(TypeToken<?> type) {
      return AAIClientConfiguration.class == type.getRawType()
          || ImmutableAAIClientConfiguration.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, AAIClientConfiguration value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeAAIClientConfiguration(out, value);
      }
    }

    @Override
    public AAIClientConfiguration read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readAAIClientConfiguration(in);
    }

    private void writeAAIClientConfiguration(JsonWriter out, AAIClientConfiguration instance)
        throws IOException {
      out.beginObject();
      out.name("aaiHost");
      out.value(instance.aaiHost());
      out.name("aaiHostPortNumber");
      aaiHostPortNumberTypeAdapter.write(out, instance.aaiHostPortNumber());
      out.name("aaiProtocol");
      out.value(instance.aaiProtocol());
      out.name("aaiUserName");
      out.value(instance.aaiUserName());
      out.name("aaiUserPassword");
      out.value(instance.aaiUserPassword());
      out.name("aaiIgnoreSSLCertificateErrors");
      aaiIgnoreSSLCertificateErrorsTypeAdapter.write(out, instance.aaiIgnoreSSLCertificateErrors());
      out.name("aaiBasePath");
      out.value(instance.aaiBasePath());
      out.name("aaiPnfPath");
      out.value(instance.aaiPnfPath());
      Map<String, String> aaiHeadersMapping = instance.aaiHeaders();
      out.name("aaiHeaders");
      out.beginObject();
      for (Map.Entry<String, String> e : aaiHeadersMapping.entrySet()) {
        String key = e.getKey();
        out.name(key);
        String value = e.getValue();
        out.value(value);
      }
      out.endObject();
      out.endObject();
    }

    private AAIClientConfiguration readAAIClientConfiguration(JsonReader in)
        throws IOException {
      ImmutableAAIClientConfiguration.Builder builder = new ImmutableAAIClientConfiguration.Builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableAAIClientConfiguration.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      switch (attributeName.charAt(0)) {
      case 'a':
        if ("aaiHost".equals(attributeName)) {
          readInAaiHost(in, builder);
          return;
        }
        if ("aaiHostPortNumber".equals(attributeName)) {
          readInAaiHostPortNumber(in, builder);
          return;
        }
        if ("aaiProtocol".equals(attributeName)) {
          readInAaiProtocol(in, builder);
          return;
        }
        if ("aaiUserName".equals(attributeName)) {
          readInAaiUserName(in, builder);
          return;
        }
        if ("aaiUserPassword".equals(attributeName)) {
          readInAaiUserPassword(in, builder);
          return;
        }
        if ("aaiIgnoreSSLCertificateErrors".equals(attributeName)) {
          readInAaiIgnoreSSLCertificateErrors(in, builder);
          return;
        }
        if ("aaiBasePath".equals(attributeName)) {
          readInAaiBasePath(in, builder);
          return;
        }
        if ("aaiPnfPath".equals(attributeName)) {
          readInAaiPnfPath(in, builder);
          return;
        }
        if ("aaiHeaders".equals(attributeName)) {
          readInAaiHeaders(in, builder);
          return;
        }
        break;
      default:
      }
      in.skipValue();
    }

    private void readInAaiHost(JsonReader in, ImmutableAAIClientConfiguration.Builder builder)
        throws IOException {
      builder.aaiHost(in.nextString());
    }

    private void readInAaiHostPortNumber(JsonReader in, ImmutableAAIClientConfiguration.Builder builder)
        throws IOException {
      Integer value = aaiHostPortNumberTypeAdapter.read(in);
      builder.aaiHostPortNumber(value);
    }

    private void readInAaiProtocol(JsonReader in, ImmutableAAIClientConfiguration.Builder builder)
        throws IOException {
      builder.aaiProtocol(in.nextString());
    }

    private void readInAaiUserName(JsonReader in, ImmutableAAIClientConfiguration.Builder builder)
        throws IOException {
      builder.aaiUserName(in.nextString());
    }

    private void readInAaiUserPassword(JsonReader in, ImmutableAAIClientConfiguration.Builder builder)
        throws IOException {
      builder.aaiUserPassword(in.nextString());
    }

    private void readInAaiIgnoreSSLCertificateErrors(JsonReader in, ImmutableAAIClientConfiguration.Builder builder)
        throws IOException {
      Boolean value = aaiIgnoreSSLCertificateErrorsTypeAdapter.read(in);
      builder.aaiIgnoreSSLCertificateErrors(value);
    }

    private void readInAaiBasePath(JsonReader in, ImmutableAAIClientConfiguration.Builder builder)
        throws IOException {
      builder.aaiBasePath(in.nextString());
    }

    private void readInAaiPnfPath(JsonReader in, ImmutableAAIClientConfiguration.Builder builder)
        throws IOException {
      builder.aaiPnfPath(in.nextString());
    }

    private void readInAaiHeaders(JsonReader in, ImmutableAAIClientConfiguration.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        in.beginObject();
        while(in.hasNext()) {
          String rawKey = in.nextName();
          String key = rawKey;
          String value = in.nextString();
          builder.putAaiHeaders(key, value);
        }
        in.endObject();
      }
    }
  }
}
