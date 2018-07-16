package org.onap.dcaegen2.services.datafile.config;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link AAIClientConfiguration}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code new ImmutableAAIClientConfiguration.Builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableAAIClientConfiguration.of()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "AAIClientConfiguration"})
public final class ImmutableAAIClientConfiguration
    extends AAIClientConfiguration {
  private final String aaiHost;
  private final Integer aaiHostPortNumber;
  private final String aaiProtocol;
  private final String aaiUserName;
  private final String aaiUserPassword;
  private final Boolean aaiIgnoreSSLCertificateErrors;
  private final String aaiBasePath;
  private final String aaiPnfPath;
  private final Map<String, String> aaiHeaders;
  private final int hashCode;

  private ImmutableAAIClientConfiguration(
      String aaiHost,
      Integer aaiHostPortNumber,
      String aaiProtocol,
      String aaiUserName,
      String aaiUserPassword,
      Boolean aaiIgnoreSSLCertificateErrors,
      String aaiBasePath,
      String aaiPnfPath,
      Map<String, ? extends String> aaiHeaders) {
    this.aaiHost = Objects.requireNonNull(aaiHost, "aaiHost");
    this.aaiHostPortNumber = Objects.requireNonNull(aaiHostPortNumber, "aaiHostPortNumber");
    this.aaiProtocol = Objects.requireNonNull(aaiProtocol, "aaiProtocol");
    this.aaiUserName = Objects.requireNonNull(aaiUserName, "aaiUserName");
    this.aaiUserPassword = Objects.requireNonNull(aaiUserPassword, "aaiUserPassword");
    this.aaiIgnoreSSLCertificateErrors = Objects.requireNonNull(aaiIgnoreSSLCertificateErrors, "aaiIgnoreSSLCertificateErrors");
    this.aaiBasePath = Objects.requireNonNull(aaiBasePath, "aaiBasePath");
    this.aaiPnfPath = Objects.requireNonNull(aaiPnfPath, "aaiPnfPath");
    this.aaiHeaders = createUnmodifiableMap(true, false, aaiHeaders);
    this.hashCode = computeHashCode();
  }

  private ImmutableAAIClientConfiguration(
      ImmutableAAIClientConfiguration original,
      String aaiHost,
      Integer aaiHostPortNumber,
      String aaiProtocol,
      String aaiUserName,
      String aaiUserPassword,
      Boolean aaiIgnoreSSLCertificateErrors,
      String aaiBasePath,
      String aaiPnfPath,
      Map<String, String> aaiHeaders) {
    this.aaiHost = aaiHost;
    this.aaiHostPortNumber = aaiHostPortNumber;
    this.aaiProtocol = aaiProtocol;
    this.aaiUserName = aaiUserName;
    this.aaiUserPassword = aaiUserPassword;
    this.aaiIgnoreSSLCertificateErrors = aaiIgnoreSSLCertificateErrors;
    this.aaiBasePath = aaiBasePath;
    this.aaiPnfPath = aaiPnfPath;
    this.aaiHeaders = aaiHeaders;
    this.hashCode = computeHashCode();
  }

  /**
   * @return The value of the {@code aaiHost} attribute
   */
  @Override
  public String aaiHost() {
    return aaiHost;
  }

  /**
   * @return The value of the {@code aaiHostPortNumber} attribute
   */
  @Override
  public Integer aaiHostPortNumber() {
    return aaiHostPortNumber;
  }

  /**
   * @return The value of the {@code aaiProtocol} attribute
   */
  @Override
  public String aaiProtocol() {
    return aaiProtocol;
  }

  /**
   * @return The value of the {@code aaiUserName} attribute
   */
  @Override
  public String aaiUserName() {
    return aaiUserName;
  }

  /**
   * @return The value of the {@code aaiUserPassword} attribute
   */
  @Override
  public String aaiUserPassword() {
    return aaiUserPassword;
  }

  /**
   * @return The value of the {@code aaiIgnoreSSLCertificateErrors} attribute
   */
  @Override
  public Boolean aaiIgnoreSSLCertificateErrors() {
    return aaiIgnoreSSLCertificateErrors;
  }

  /**
   * @return The value of the {@code aaiBasePath} attribute
   */
  @Override
  public String aaiBasePath() {
    return aaiBasePath;
  }

  /**
   * @return The value of the {@code aaiPnfPath} attribute
   */
  @Override
  public String aaiPnfPath() {
    return aaiPnfPath;
  }

  /**
   * @return The value of the {@code aaiHeaders} attribute
   */
  @Override
  public Map<String, String> aaiHeaders() {
    return aaiHeaders;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AAIClientConfiguration#aaiHost() aaiHost} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for aaiHost
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAAIClientConfiguration withAaiHost(String value) {
    if (this.aaiHost.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "aaiHost");
    return new ImmutableAAIClientConfiguration(
        this,
        newValue,
        this.aaiHostPortNumber,
        this.aaiProtocol,
        this.aaiUserName,
        this.aaiUserPassword,
        this.aaiIgnoreSSLCertificateErrors,
        this.aaiBasePath,
        this.aaiPnfPath,
        this.aaiHeaders);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AAIClientConfiguration#aaiHostPortNumber() aaiHostPortNumber} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for aaiHostPortNumber
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAAIClientConfiguration withAaiHostPortNumber(Integer value) {
    if (this.aaiHostPortNumber.equals(value)) return this;
    Integer newValue = Objects.requireNonNull(value, "aaiHostPortNumber");
    return new ImmutableAAIClientConfiguration(
        this,
        this.aaiHost,
        newValue,
        this.aaiProtocol,
        this.aaiUserName,
        this.aaiUserPassword,
        this.aaiIgnoreSSLCertificateErrors,
        this.aaiBasePath,
        this.aaiPnfPath,
        this.aaiHeaders);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AAIClientConfiguration#aaiProtocol() aaiProtocol} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for aaiProtocol
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAAIClientConfiguration withAaiProtocol(String value) {
    if (this.aaiProtocol.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "aaiProtocol");
    return new ImmutableAAIClientConfiguration(
        this,
        this.aaiHost,
        this.aaiHostPortNumber,
        newValue,
        this.aaiUserName,
        this.aaiUserPassword,
        this.aaiIgnoreSSLCertificateErrors,
        this.aaiBasePath,
        this.aaiPnfPath,
        this.aaiHeaders);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AAIClientConfiguration#aaiUserName() aaiUserName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for aaiUserName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAAIClientConfiguration withAaiUserName(String value) {
    if (this.aaiUserName.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "aaiUserName");
    return new ImmutableAAIClientConfiguration(
        this,
        this.aaiHost,
        this.aaiHostPortNumber,
        this.aaiProtocol,
        newValue,
        this.aaiUserPassword,
        this.aaiIgnoreSSLCertificateErrors,
        this.aaiBasePath,
        this.aaiPnfPath,
        this.aaiHeaders);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AAIClientConfiguration#aaiUserPassword() aaiUserPassword} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for aaiUserPassword
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAAIClientConfiguration withAaiUserPassword(String value) {
    if (this.aaiUserPassword.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "aaiUserPassword");
    return new ImmutableAAIClientConfiguration(
        this,
        this.aaiHost,
        this.aaiHostPortNumber,
        this.aaiProtocol,
        this.aaiUserName,
        newValue,
        this.aaiIgnoreSSLCertificateErrors,
        this.aaiBasePath,
        this.aaiPnfPath,
        this.aaiHeaders);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AAIClientConfiguration#aaiIgnoreSSLCertificateErrors() aaiIgnoreSSLCertificateErrors} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for aaiIgnoreSSLCertificateErrors
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAAIClientConfiguration withAaiIgnoreSSLCertificateErrors(Boolean value) {
    if (this.aaiIgnoreSSLCertificateErrors.equals(value)) return this;
    Boolean newValue = Objects.requireNonNull(value, "aaiIgnoreSSLCertificateErrors");
    return new ImmutableAAIClientConfiguration(
        this,
        this.aaiHost,
        this.aaiHostPortNumber,
        this.aaiProtocol,
        this.aaiUserName,
        this.aaiUserPassword,
        newValue,
        this.aaiBasePath,
        this.aaiPnfPath,
        this.aaiHeaders);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AAIClientConfiguration#aaiBasePath() aaiBasePath} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for aaiBasePath
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAAIClientConfiguration withAaiBasePath(String value) {
    if (this.aaiBasePath.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "aaiBasePath");
    return new ImmutableAAIClientConfiguration(
        this,
        this.aaiHost,
        this.aaiHostPortNumber,
        this.aaiProtocol,
        this.aaiUserName,
        this.aaiUserPassword,
        this.aaiIgnoreSSLCertificateErrors,
        newValue,
        this.aaiPnfPath,
        this.aaiHeaders);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AAIClientConfiguration#aaiPnfPath() aaiPnfPath} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for aaiPnfPath
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAAIClientConfiguration withAaiPnfPath(String value) {
    if (this.aaiPnfPath.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "aaiPnfPath");
    return new ImmutableAAIClientConfiguration(
        this,
        this.aaiHost,
        this.aaiHostPortNumber,
        this.aaiProtocol,
        this.aaiUserName,
        this.aaiUserPassword,
        this.aaiIgnoreSSLCertificateErrors,
        this.aaiBasePath,
        newValue,
        this.aaiHeaders);
  }

  /**
   * Copy the current immutable object by replacing the {@link AAIClientConfiguration#aaiHeaders() aaiHeaders} map with the specified map.
   * Nulls are not permitted as keys or values.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param entries The entries to be added to the aaiHeaders map
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAAIClientConfiguration withAaiHeaders(Map<String, ? extends String> entries) {
    if (this.aaiHeaders == entries) return this;
    Map<String, String> newValue = createUnmodifiableMap(true, false, entries);
    return new ImmutableAAIClientConfiguration(
        this,
        this.aaiHost,
        this.aaiHostPortNumber,
        this.aaiProtocol,
        this.aaiUserName,
        this.aaiUserPassword,
        this.aaiIgnoreSSLCertificateErrors,
        this.aaiBasePath,
        this.aaiPnfPath,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAAIClientConfiguration} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAAIClientConfiguration
        && equalTo((ImmutableAAIClientConfiguration) another);
  }

  private boolean equalTo(ImmutableAAIClientConfiguration another) {
    if (hashCode != another.hashCode) return false;
    return aaiHost.equals(another.aaiHost)
        && aaiHostPortNumber.equals(another.aaiHostPortNumber)
        && aaiProtocol.equals(another.aaiProtocol)
        && aaiUserName.equals(another.aaiUserName)
        && aaiUserPassword.equals(another.aaiUserPassword)
        && aaiIgnoreSSLCertificateErrors.equals(another.aaiIgnoreSSLCertificateErrors)
        && aaiBasePath.equals(another.aaiBasePath)
        && aaiPnfPath.equals(another.aaiPnfPath)
        && aaiHeaders.equals(another.aaiHeaders);
  }

  /**
   * Returns a precomputed-on-construction hash code from attributes: {@code aaiHost}, {@code aaiHostPortNumber}, {@code aaiProtocol}, {@code aaiUserName}, {@code aaiUserPassword}, {@code aaiIgnoreSSLCertificateErrors}, {@code aaiBasePath}, {@code aaiPnfPath}, {@code aaiHeaders}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    return hashCode;
  }

  private int computeHashCode() {
    int h = 5381;
    h += (h << 5) + aaiHost.hashCode();
    h += (h << 5) + aaiHostPortNumber.hashCode();
    h += (h << 5) + aaiProtocol.hashCode();
    h += (h << 5) + aaiUserName.hashCode();
    h += (h << 5) + aaiUserPassword.hashCode();
    h += (h << 5) + aaiIgnoreSSLCertificateErrors.hashCode();
    h += (h << 5) + aaiBasePath.hashCode();
    h += (h << 5) + aaiPnfPath.hashCode();
    h += (h << 5) + aaiHeaders.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code AAIClientConfiguration} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "AAIClientConfiguration{"
        + "aaiHost=" + aaiHost
        + ", aaiHostPortNumber=" + aaiHostPortNumber
        + ", aaiProtocol=" + aaiProtocol
        + ", aaiUserName=" + aaiUserName
        + ", aaiUserPassword=" + aaiUserPassword
        + ", aaiIgnoreSSLCertificateErrors=" + aaiIgnoreSSLCertificateErrors
        + ", aaiBasePath=" + aaiBasePath
        + ", aaiPnfPath=" + aaiPnfPath
        + ", aaiHeaders=" + aaiHeaders
        + "}";
  }

  /**
   * Construct a new immutable {@code AAIClientConfiguration} instance.
   * @param aaiHost The value for the {@code aaiHost} attribute
   * @param aaiHostPortNumber The value for the {@code aaiHostPortNumber} attribute
   * @param aaiProtocol The value for the {@code aaiProtocol} attribute
   * @param aaiUserName The value for the {@code aaiUserName} attribute
   * @param aaiUserPassword The value for the {@code aaiUserPassword} attribute
   * @param aaiIgnoreSSLCertificateErrors The value for the {@code aaiIgnoreSSLCertificateErrors} attribute
   * @param aaiBasePath The value for the {@code aaiBasePath} attribute
   * @param aaiPnfPath The value for the {@code aaiPnfPath} attribute
   * @param aaiHeaders The value for the {@code aaiHeaders} attribute
   * @return An immutable AAIClientConfiguration instance
   */
  public static ImmutableAAIClientConfiguration of(String aaiHost, Integer aaiHostPortNumber, String aaiProtocol, String aaiUserName, String aaiUserPassword, Boolean aaiIgnoreSSLCertificateErrors, String aaiBasePath, String aaiPnfPath, Map<String, ? extends String> aaiHeaders) {
    return new ImmutableAAIClientConfiguration(aaiHost, aaiHostPortNumber, aaiProtocol, aaiUserName, aaiUserPassword, aaiIgnoreSSLCertificateErrors, aaiBasePath, aaiPnfPath, aaiHeaders);
  }

  /**
   * Creates an immutable copy of a {@link AAIClientConfiguration} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AAIClientConfiguration instance
   */
  public static ImmutableAAIClientConfiguration copyOf(AAIClientConfiguration instance) {
    if (instance instanceof ImmutableAAIClientConfiguration) {
      return (ImmutableAAIClientConfiguration) instance;
    }
    return new ImmutableAAIClientConfiguration.Builder()
        .from(instance)
        .build();
  }

  private static final long serialVersionUID = 1L;

  /**
   * Builds instances of type {@link ImmutableAAIClientConfiguration ImmutableAAIClientConfiguration}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_AAI_HOST = 0x1L;
    private static final long INIT_BIT_AAI_HOST_PORT_NUMBER = 0x2L;
    private static final long INIT_BIT_AAI_PROTOCOL = 0x4L;
    private static final long INIT_BIT_AAI_USER_NAME = 0x8L;
    private static final long INIT_BIT_AAI_USER_PASSWORD = 0x10L;
    private static final long INIT_BIT_AAI_IGNORE_S_S_L_CERTIFICATE_ERRORS = 0x20L;
    private static final long INIT_BIT_AAI_BASE_PATH = 0x40L;
    private static final long INIT_BIT_AAI_PNF_PATH = 0x80L;
    private long initBits = 0xffL;

    private String aaiHost;
    private Integer aaiHostPortNumber;
    private String aaiProtocol;
    private String aaiUserName;
    private String aaiUserPassword;
    private Boolean aaiIgnoreSSLCertificateErrors;
    private String aaiBasePath;
    private String aaiPnfPath;
    private Map<String, String> aaiHeaders = new LinkedHashMap<String, String>();

    /**
     * Creates a builder for {@link ImmutableAAIClientConfiguration ImmutableAAIClientConfiguration} instances.
     */
    public Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AAIClientConfiguration} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AAIClientConfiguration instance) {
      Objects.requireNonNull(instance, "instance");
      aaiHost(instance.aaiHost());
      aaiHostPortNumber(instance.aaiHostPortNumber());
      aaiProtocol(instance.aaiProtocol());
      aaiUserName(instance.aaiUserName());
      aaiUserPassword(instance.aaiUserPassword());
      aaiIgnoreSSLCertificateErrors(instance.aaiIgnoreSSLCertificateErrors());
      aaiBasePath(instance.aaiBasePath());
      aaiPnfPath(instance.aaiPnfPath());
      putAllAaiHeaders(instance.aaiHeaders());
      return this;
    }

    /**
     * Initializes the value for the {@link AAIClientConfiguration#aaiHost() aaiHost} attribute.
     * @param aaiHost The value for aaiHost 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder aaiHost(String aaiHost) {
      this.aaiHost = Objects.requireNonNull(aaiHost, "aaiHost");
      initBits &= ~INIT_BIT_AAI_HOST;
      return this;
    }

    /**
     * Initializes the value for the {@link AAIClientConfiguration#aaiHostPortNumber() aaiHostPortNumber} attribute.
     * @param aaiHostPortNumber The value for aaiHostPortNumber 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder aaiHostPortNumber(Integer aaiHostPortNumber) {
      this.aaiHostPortNumber = Objects.requireNonNull(aaiHostPortNumber, "aaiHostPortNumber");
      initBits &= ~INIT_BIT_AAI_HOST_PORT_NUMBER;
      return this;
    }

    /**
     * Initializes the value for the {@link AAIClientConfiguration#aaiProtocol() aaiProtocol} attribute.
     * @param aaiProtocol The value for aaiProtocol 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder aaiProtocol(String aaiProtocol) {
      this.aaiProtocol = Objects.requireNonNull(aaiProtocol, "aaiProtocol");
      initBits &= ~INIT_BIT_AAI_PROTOCOL;
      return this;
    }

    /**
     * Initializes the value for the {@link AAIClientConfiguration#aaiUserName() aaiUserName} attribute.
     * @param aaiUserName The value for aaiUserName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder aaiUserName(String aaiUserName) {
      this.aaiUserName = Objects.requireNonNull(aaiUserName, "aaiUserName");
      initBits &= ~INIT_BIT_AAI_USER_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link AAIClientConfiguration#aaiUserPassword() aaiUserPassword} attribute.
     * @param aaiUserPassword The value for aaiUserPassword 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder aaiUserPassword(String aaiUserPassword) {
      this.aaiUserPassword = Objects.requireNonNull(aaiUserPassword, "aaiUserPassword");
      initBits &= ~INIT_BIT_AAI_USER_PASSWORD;
      return this;
    }

    /**
     * Initializes the value for the {@link AAIClientConfiguration#aaiIgnoreSSLCertificateErrors() aaiIgnoreSSLCertificateErrors} attribute.
     * @param aaiIgnoreSSLCertificateErrors The value for aaiIgnoreSSLCertificateErrors 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder aaiIgnoreSSLCertificateErrors(Boolean aaiIgnoreSSLCertificateErrors) {
      this.aaiIgnoreSSLCertificateErrors = Objects.requireNonNull(aaiIgnoreSSLCertificateErrors, "aaiIgnoreSSLCertificateErrors");
      initBits &= ~INIT_BIT_AAI_IGNORE_S_S_L_CERTIFICATE_ERRORS;
      return this;
    }

    /**
     * Initializes the value for the {@link AAIClientConfiguration#aaiBasePath() aaiBasePath} attribute.
     * @param aaiBasePath The value for aaiBasePath 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder aaiBasePath(String aaiBasePath) {
      this.aaiBasePath = Objects.requireNonNull(aaiBasePath, "aaiBasePath");
      initBits &= ~INIT_BIT_AAI_BASE_PATH;
      return this;
    }

    /**
     * Initializes the value for the {@link AAIClientConfiguration#aaiPnfPath() aaiPnfPath} attribute.
     * @param aaiPnfPath The value for aaiPnfPath 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder aaiPnfPath(String aaiPnfPath) {
      this.aaiPnfPath = Objects.requireNonNull(aaiPnfPath, "aaiPnfPath");
      initBits &= ~INIT_BIT_AAI_PNF_PATH;
      return this;
    }

    /**
     * Put one entry to the {@link AAIClientConfiguration#aaiHeaders() aaiHeaders} map.
     * @param key The key in the aaiHeaders map
     * @param value The associated value in the aaiHeaders map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putAaiHeaders(String key, String value) {
      this.aaiHeaders.put(
          Objects.requireNonNull(key, "aaiHeaders key"),
          Objects.requireNonNull(value, "aaiHeaders value"));
      return this;
    }

    /**
     * Put one entry to the {@link AAIClientConfiguration#aaiHeaders() aaiHeaders} map. Nulls are not permitted
     * @param entry The key and value entry
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putAaiHeaders(Map.Entry<String, ? extends String> entry) {
      String k = entry.getKey();
      String v = entry.getValue();
      this.aaiHeaders.put(
          Objects.requireNonNull(k, "aaiHeaders key"),
          Objects.requireNonNull(v, "aaiHeaders value"));
      return this;
    }

    /**
     * Sets or replaces all mappings from the specified map as entries for the {@link AAIClientConfiguration#aaiHeaders() aaiHeaders} map. Nulls are not permitted
     * @param aaiHeaders The entries that will be added to the aaiHeaders map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder aaiHeaders(Map<String, ? extends String> aaiHeaders) {
      this.aaiHeaders.clear();
      return putAllAaiHeaders(aaiHeaders);
    }

    /**
     * Put all mappings from the specified map as entries to {@link AAIClientConfiguration#aaiHeaders() aaiHeaders} map. Nulls are not permitted
     * @param aaiHeaders The entries that will be added to the aaiHeaders map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putAllAaiHeaders(Map<String, ? extends String> aaiHeaders) {
      for (Map.Entry<String, ? extends String> entry : aaiHeaders.entrySet()) {
        String k = entry.getKey();
        String v = entry.getValue();
        this.aaiHeaders.put(
            Objects.requireNonNull(k, "aaiHeaders key"),
            Objects.requireNonNull(v, "aaiHeaders value"));
      }
      return this;
    }

    /**
     * Builds a new {@link ImmutableAAIClientConfiguration ImmutableAAIClientConfiguration}.
     * @return An immutable instance of AAIClientConfiguration
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAAIClientConfiguration build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAAIClientConfiguration(
          null,
          aaiHost,
          aaiHostPortNumber,
          aaiProtocol,
          aaiUserName,
          aaiUserPassword,
          aaiIgnoreSSLCertificateErrors,
          aaiBasePath,
          aaiPnfPath,
          createUnmodifiableMap(false, false, aaiHeaders));
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_AAI_HOST) != 0) attributes.add("aaiHost");
      if ((initBits & INIT_BIT_AAI_HOST_PORT_NUMBER) != 0) attributes.add("aaiHostPortNumber");
      if ((initBits & INIT_BIT_AAI_PROTOCOL) != 0) attributes.add("aaiProtocol");
      if ((initBits & INIT_BIT_AAI_USER_NAME) != 0) attributes.add("aaiUserName");
      if ((initBits & INIT_BIT_AAI_USER_PASSWORD) != 0) attributes.add("aaiUserPassword");
      if ((initBits & INIT_BIT_AAI_IGNORE_S_S_L_CERTIFICATE_ERRORS) != 0) attributes.add("aaiIgnoreSSLCertificateErrors");
      if ((initBits & INIT_BIT_AAI_BASE_PATH) != 0) attributes.add("aaiBasePath");
      if ((initBits & INIT_BIT_AAI_PNF_PATH) != 0) attributes.add("aaiPnfPath");
      return "Cannot build AAIClientConfiguration, some of required attributes are not set " + attributes;
    }
  }

  private static <K, V> Map<K, V> createUnmodifiableMap(boolean checkNulls, boolean skipNulls, Map<? extends K, ? extends V> map) {
    switch (map.size()) {
    case 0: return Collections.emptyMap();
    case 1: {
      Map.Entry<? extends K, ? extends V> e = map.entrySet().iterator().next();
      K k = e.getKey();
      V v = e.getValue();
      if (checkNulls) {
        Objects.requireNonNull(k, "key");
        Objects.requireNonNull(v, "value");
      }
      if (skipNulls && (k == null || v == null)) {
        return Collections.emptyMap();
      }
      return Collections.singletonMap(k, v);
    }
    default: {
      Map<K, V> linkedMap = new LinkedHashMap<K, V>(map.size());
      if (skipNulls || checkNulls) {
        for (Map.Entry<? extends K, ? extends V> e : map.entrySet()) {
          K k = e.getKey();
          V v = e.getValue();
          if (skipNulls) {
            if (k == null || v == null) continue;
          } else if (checkNulls) {
            Objects.requireNonNull(k, "key");
            Objects.requireNonNull(v, "value");
          }
          linkedMap.put(k, v);
        }
      } else {
        linkedMap.putAll(map);
      }
      return Collections.unmodifiableMap(linkedMap);
    }
    }
  }
}
