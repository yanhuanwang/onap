package org.onap.dcaegen2.services.datafile.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link DmaapPublisherConfiguration}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code new ImmutableDmaapPublisherConfiguration.Builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableDmaapPublisherConfiguration.of()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "DmaapPublisherConfiguration"})
public final class ImmutableDmaapPublisherConfiguration
    extends DmaapPublisherConfiguration {
  private final String dmaapHostName;
  private final Integer dmaapPortNumber;
  private final String dmaapTopicName;
  private final String dmaapProtocol;
  private final String dmaapUserName;
  private final String dmaapUserPassword;
  private final String dmaapContentType;
  private final int hashCode;

  private ImmutableDmaapPublisherConfiguration(
      String dmaapHostName,
      Integer dmaapPortNumber,
      String dmaapTopicName,
      String dmaapProtocol,
      String dmaapUserName,
      String dmaapUserPassword,
      String dmaapContentType) {
    this.dmaapHostName = Objects.requireNonNull(dmaapHostName, "dmaapHostName");
    this.dmaapPortNumber = Objects.requireNonNull(dmaapPortNumber, "dmaapPortNumber");
    this.dmaapTopicName = Objects.requireNonNull(dmaapTopicName, "dmaapTopicName");
    this.dmaapProtocol = Objects.requireNonNull(dmaapProtocol, "dmaapProtocol");
    this.dmaapUserName = Objects.requireNonNull(dmaapUserName, "dmaapUserName");
    this.dmaapUserPassword = Objects.requireNonNull(dmaapUserPassword, "dmaapUserPassword");
    this.dmaapContentType = Objects.requireNonNull(dmaapContentType, "dmaapContentType");
    this.hashCode = computeHashCode();
  }

  private ImmutableDmaapPublisherConfiguration(
      ImmutableDmaapPublisherConfiguration original,
      String dmaapHostName,
      Integer dmaapPortNumber,
      String dmaapTopicName,
      String dmaapProtocol,
      String dmaapUserName,
      String dmaapUserPassword,
      String dmaapContentType) {
    this.dmaapHostName = dmaapHostName;
    this.dmaapPortNumber = dmaapPortNumber;
    this.dmaapTopicName = dmaapTopicName;
    this.dmaapProtocol = dmaapProtocol;
    this.dmaapUserName = dmaapUserName;
    this.dmaapUserPassword = dmaapUserPassword;
    this.dmaapContentType = dmaapContentType;
    this.hashCode = computeHashCode();
  }

  /**
   * @return The value of the {@code dmaapHostName} attribute
   */
  @Override
  public String dmaapHostName() {
    return dmaapHostName;
  }

  /**
   * @return The value of the {@code dmaapPortNumber} attribute
   */
  @Override
  public Integer dmaapPortNumber() {
    return dmaapPortNumber;
  }

  /**
   * @return The value of the {@code dmaapTopicName} attribute
   */
  @Override
  public String dmaapTopicName() {
    return dmaapTopicName;
  }

  /**
   * @return The value of the {@code dmaapProtocol} attribute
   */
  @Override
  public String dmaapProtocol() {
    return dmaapProtocol;
  }

  /**
   * @return The value of the {@code dmaapUserName} attribute
   */
  @Override
  public String dmaapUserName() {
    return dmaapUserName;
  }

  /**
   * @return The value of the {@code dmaapUserPassword} attribute
   */
  @Override
  public String dmaapUserPassword() {
    return dmaapUserPassword;
  }

  /**
   * @return The value of the {@code dmaapContentType} attribute
   */
  @Override
  public String dmaapContentType() {
    return dmaapContentType;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DmaapPublisherConfiguration#dmaapHostName() dmaapHostName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dmaapHostName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDmaapPublisherConfiguration withDmaapHostName(String value) {
    if (this.dmaapHostName.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "dmaapHostName");
    return new ImmutableDmaapPublisherConfiguration(
        this,
        newValue,
        this.dmaapPortNumber,
        this.dmaapTopicName,
        this.dmaapProtocol,
        this.dmaapUserName,
        this.dmaapUserPassword,
        this.dmaapContentType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DmaapPublisherConfiguration#dmaapPortNumber() dmaapPortNumber} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dmaapPortNumber
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDmaapPublisherConfiguration withDmaapPortNumber(Integer value) {
    if (this.dmaapPortNumber.equals(value)) return this;
    Integer newValue = Objects.requireNonNull(value, "dmaapPortNumber");
    return new ImmutableDmaapPublisherConfiguration(
        this,
        this.dmaapHostName,
        newValue,
        this.dmaapTopicName,
        this.dmaapProtocol,
        this.dmaapUserName,
        this.dmaapUserPassword,
        this.dmaapContentType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DmaapPublisherConfiguration#dmaapTopicName() dmaapTopicName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dmaapTopicName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDmaapPublisherConfiguration withDmaapTopicName(String value) {
    if (this.dmaapTopicName.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "dmaapTopicName");
    return new ImmutableDmaapPublisherConfiguration(
        this,
        this.dmaapHostName,
        this.dmaapPortNumber,
        newValue,
        this.dmaapProtocol,
        this.dmaapUserName,
        this.dmaapUserPassword,
        this.dmaapContentType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DmaapPublisherConfiguration#dmaapProtocol() dmaapProtocol} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dmaapProtocol
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDmaapPublisherConfiguration withDmaapProtocol(String value) {
    if (this.dmaapProtocol.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "dmaapProtocol");
    return new ImmutableDmaapPublisherConfiguration(
        this,
        this.dmaapHostName,
        this.dmaapPortNumber,
        this.dmaapTopicName,
        newValue,
        this.dmaapUserName,
        this.dmaapUserPassword,
        this.dmaapContentType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DmaapPublisherConfiguration#dmaapUserName() dmaapUserName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dmaapUserName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDmaapPublisherConfiguration withDmaapUserName(String value) {
    if (this.dmaapUserName.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "dmaapUserName");
    return new ImmutableDmaapPublisherConfiguration(
        this,
        this.dmaapHostName,
        this.dmaapPortNumber,
        this.dmaapTopicName,
        this.dmaapProtocol,
        newValue,
        this.dmaapUserPassword,
        this.dmaapContentType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DmaapPublisherConfiguration#dmaapUserPassword() dmaapUserPassword} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dmaapUserPassword
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDmaapPublisherConfiguration withDmaapUserPassword(String value) {
    if (this.dmaapUserPassword.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "dmaapUserPassword");
    return new ImmutableDmaapPublisherConfiguration(
        this,
        this.dmaapHostName,
        this.dmaapPortNumber,
        this.dmaapTopicName,
        this.dmaapProtocol,
        this.dmaapUserName,
        newValue,
        this.dmaapContentType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DmaapPublisherConfiguration#dmaapContentType() dmaapContentType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dmaapContentType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDmaapPublisherConfiguration withDmaapContentType(String value) {
    if (this.dmaapContentType.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "dmaapContentType");
    return new ImmutableDmaapPublisherConfiguration(
        this,
        this.dmaapHostName,
        this.dmaapPortNumber,
        this.dmaapTopicName,
        this.dmaapProtocol,
        this.dmaapUserName,
        this.dmaapUserPassword,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDmaapPublisherConfiguration} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDmaapPublisherConfiguration
        && equalTo((ImmutableDmaapPublisherConfiguration) another);
  }

  private boolean equalTo(ImmutableDmaapPublisherConfiguration another) {
    if (hashCode != another.hashCode) return false;
    return dmaapHostName.equals(another.dmaapHostName)
        && dmaapPortNumber.equals(another.dmaapPortNumber)
        && dmaapTopicName.equals(another.dmaapTopicName)
        && dmaapProtocol.equals(another.dmaapProtocol)
        && dmaapUserName.equals(another.dmaapUserName)
        && dmaapUserPassword.equals(another.dmaapUserPassword)
        && dmaapContentType.equals(another.dmaapContentType);
  }

  /**
   * Returns a precomputed-on-construction hash code from attributes: {@code dmaapHostName}, {@code dmaapPortNumber}, {@code dmaapTopicName}, {@code dmaapProtocol}, {@code dmaapUserName}, {@code dmaapUserPassword}, {@code dmaapContentType}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    return hashCode;
  }

  private int computeHashCode() {
    int h = 5381;
    h += (h << 5) + dmaapHostName.hashCode();
    h += (h << 5) + dmaapPortNumber.hashCode();
    h += (h << 5) + dmaapTopicName.hashCode();
    h += (h << 5) + dmaapProtocol.hashCode();
    h += (h << 5) + dmaapUserName.hashCode();
    h += (h << 5) + dmaapUserPassword.hashCode();
    h += (h << 5) + dmaapContentType.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code DmaapPublisherConfiguration} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "DmaapPublisherConfiguration{"
        + "dmaapHostName=" + dmaapHostName
        + ", dmaapPortNumber=" + dmaapPortNumber
        + ", dmaapTopicName=" + dmaapTopicName
        + ", dmaapProtocol=" + dmaapProtocol
        + ", dmaapUserName=" + dmaapUserName
        + ", dmaapUserPassword=" + dmaapUserPassword
        + ", dmaapContentType=" + dmaapContentType
        + "}";
  }

  /**
   * Construct a new immutable {@code DmaapPublisherConfiguration} instance.
   * @param dmaapHostName The value for the {@code dmaapHostName} attribute
   * @param dmaapPortNumber The value for the {@code dmaapPortNumber} attribute
   * @param dmaapTopicName The value for the {@code dmaapTopicName} attribute
   * @param dmaapProtocol The value for the {@code dmaapProtocol} attribute
   * @param dmaapUserName The value for the {@code dmaapUserName} attribute
   * @param dmaapUserPassword The value for the {@code dmaapUserPassword} attribute
   * @param dmaapContentType The value for the {@code dmaapContentType} attribute
   * @return An immutable DmaapPublisherConfiguration instance
   */
  public static ImmutableDmaapPublisherConfiguration of(String dmaapHostName, Integer dmaapPortNumber, String dmaapTopicName, String dmaapProtocol, String dmaapUserName, String dmaapUserPassword, String dmaapContentType) {
    return new ImmutableDmaapPublisherConfiguration(dmaapHostName, dmaapPortNumber, dmaapTopicName, dmaapProtocol, dmaapUserName, dmaapUserPassword, dmaapContentType);
  }

  /**
   * Creates an immutable copy of a {@link DmaapPublisherConfiguration} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DmaapPublisherConfiguration instance
   */
  public static ImmutableDmaapPublisherConfiguration copyOf(DmaapPublisherConfiguration instance) {
    if (instance instanceof ImmutableDmaapPublisherConfiguration) {
      return (ImmutableDmaapPublisherConfiguration) instance;
    }
    return new ImmutableDmaapPublisherConfiguration.Builder()
        .from(instance)
        .build();
  }

  private static final long serialVersionUID = 1L;

  /**
   * Builds instances of type {@link ImmutableDmaapPublisherConfiguration ImmutableDmaapPublisherConfiguration}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder 
      implements DmaapPublisherConfiguration.Builder {
    private static final long INIT_BIT_DMAAP_HOST_NAME = 0x1L;
    private static final long INIT_BIT_DMAAP_PORT_NUMBER = 0x2L;
    private static final long INIT_BIT_DMAAP_TOPIC_NAME = 0x4L;
    private static final long INIT_BIT_DMAAP_PROTOCOL = 0x8L;
    private static final long INIT_BIT_DMAAP_USER_NAME = 0x10L;
    private static final long INIT_BIT_DMAAP_USER_PASSWORD = 0x20L;
    private static final long INIT_BIT_DMAAP_CONTENT_TYPE = 0x40L;
    private long initBits = 0x7fL;

    private String dmaapHostName;
    private Integer dmaapPortNumber;
    private String dmaapTopicName;
    private String dmaapProtocol;
    private String dmaapUserName;
    private String dmaapUserPassword;
    private String dmaapContentType;

    /**
     * Creates a builder for {@link ImmutableDmaapPublisherConfiguration ImmutableDmaapPublisherConfiguration} instances.
     */
    public Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code org.onap.dcaegen2.services.datafile.config.DmaapCustomConfig} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(DmaapCustomConfig instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code org.onap.dcaegen2.services.datafile.config.DmaapPublisherConfiguration} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(DmaapPublisherConfiguration instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof DmaapCustomConfig) {
        DmaapCustomConfig instance = (DmaapCustomConfig) object;
        dmaapHostName(instance.dmaapHostName());
        dmaapTopicName(instance.dmaapTopicName());
        dmaapUserPassword(instance.dmaapUserPassword());
        dmaapContentType(instance.dmaapContentType());
        dmaapPortNumber(instance.dmaapPortNumber());
        dmaapProtocol(instance.dmaapProtocol());
        dmaapUserName(instance.dmaapUserName());
      }
    }

    /**
     * Initializes the value for the {@link DmaapPublisherConfiguration#dmaapHostName() dmaapHostName} attribute.
     * @param dmaapHostName The value for dmaapHostName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder dmaapHostName(String dmaapHostName) {
      this.dmaapHostName = Objects.requireNonNull(dmaapHostName, "dmaapHostName");
      initBits &= ~INIT_BIT_DMAAP_HOST_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link DmaapPublisherConfiguration#dmaapPortNumber() dmaapPortNumber} attribute.
     * @param dmaapPortNumber The value for dmaapPortNumber 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder dmaapPortNumber(Integer dmaapPortNumber) {
      this.dmaapPortNumber = Objects.requireNonNull(dmaapPortNumber, "dmaapPortNumber");
      initBits &= ~INIT_BIT_DMAAP_PORT_NUMBER;
      return this;
    }

    /**
     * Initializes the value for the {@link DmaapPublisherConfiguration#dmaapTopicName() dmaapTopicName} attribute.
     * @param dmaapTopicName The value for dmaapTopicName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder dmaapTopicName(String dmaapTopicName) {
      this.dmaapTopicName = Objects.requireNonNull(dmaapTopicName, "dmaapTopicName");
      initBits &= ~INIT_BIT_DMAAP_TOPIC_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link DmaapPublisherConfiguration#dmaapProtocol() dmaapProtocol} attribute.
     * @param dmaapProtocol The value for dmaapProtocol 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder dmaapProtocol(String dmaapProtocol) {
      this.dmaapProtocol = Objects.requireNonNull(dmaapProtocol, "dmaapProtocol");
      initBits &= ~INIT_BIT_DMAAP_PROTOCOL;
      return this;
    }

    /**
     * Initializes the value for the {@link DmaapPublisherConfiguration#dmaapUserName() dmaapUserName} attribute.
     * @param dmaapUserName The value for dmaapUserName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder dmaapUserName(String dmaapUserName) {
      this.dmaapUserName = Objects.requireNonNull(dmaapUserName, "dmaapUserName");
      initBits &= ~INIT_BIT_DMAAP_USER_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link DmaapPublisherConfiguration#dmaapUserPassword() dmaapUserPassword} attribute.
     * @param dmaapUserPassword The value for dmaapUserPassword 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder dmaapUserPassword(String dmaapUserPassword) {
      this.dmaapUserPassword = Objects.requireNonNull(dmaapUserPassword, "dmaapUserPassword");
      initBits &= ~INIT_BIT_DMAAP_USER_PASSWORD;
      return this;
    }

    /**
     * Initializes the value for the {@link DmaapPublisherConfiguration#dmaapContentType() dmaapContentType} attribute.
     * @param dmaapContentType The value for dmaapContentType 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder dmaapContentType(String dmaapContentType) {
      this.dmaapContentType = Objects.requireNonNull(dmaapContentType, "dmaapContentType");
      initBits &= ~INIT_BIT_DMAAP_CONTENT_TYPE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableDmaapPublisherConfiguration ImmutableDmaapPublisherConfiguration}.
     * @return An immutable instance of DmaapPublisherConfiguration
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableDmaapPublisherConfiguration build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableDmaapPublisherConfiguration(
          null,
          dmaapHostName,
          dmaapPortNumber,
          dmaapTopicName,
          dmaapProtocol,
          dmaapUserName,
          dmaapUserPassword,
          dmaapContentType);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_DMAAP_HOST_NAME) != 0) attributes.add("dmaapHostName");
      if ((initBits & INIT_BIT_DMAAP_PORT_NUMBER) != 0) attributes.add("dmaapPortNumber");
      if ((initBits & INIT_BIT_DMAAP_TOPIC_NAME) != 0) attributes.add("dmaapTopicName");
      if ((initBits & INIT_BIT_DMAAP_PROTOCOL) != 0) attributes.add("dmaapProtocol");
      if ((initBits & INIT_BIT_DMAAP_USER_NAME) != 0) attributes.add("dmaapUserName");
      if ((initBits & INIT_BIT_DMAAP_USER_PASSWORD) != 0) attributes.add("dmaapUserPassword");
      if ((initBits & INIT_BIT_DMAAP_CONTENT_TYPE) != 0) attributes.add("dmaapContentType");
      return "Cannot build DmaapPublisherConfiguration, some of required attributes are not set " + attributes;
    }
  }
}
