package org.onap.dcaegen2.services.datafile.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link ConsumerDmaapModel}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableConsumerDmaapModel.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "ConsumerDmaapModel"})
public final class ImmutableConsumerDmaapModel
    implements ConsumerDmaapModel {
  private final String pnfName;
  private final String ipv4;
  private final String ipv6;

  private ImmutableConsumerDmaapModel(String pnfName, String ipv4, String ipv6) {
    this.pnfName = pnfName;
    this.ipv4 = ipv4;
    this.ipv6 = ipv6;
  }

  /**
   * @return The value of the {@code pnfName} attribute
   */
  @Override
  public String getPnfName() {
    return pnfName;
  }

  /**
   * @return The value of the {@code ipv4} attribute
   */
  @Override
  public String getIpv4() {
    return ipv4;
  }

  /**
   * @return The value of the {@code ipv6} attribute
   */
  @Override
  public String getIpv6() {
    return ipv6;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ConsumerDmaapModel#getPnfName() pnfName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for pnfName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableConsumerDmaapModel withPnfName(String value) {
    if (this.pnfName.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "pnfName");
    return new ImmutableConsumerDmaapModel(newValue, this.ipv4, this.ipv6);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ConsumerDmaapModel#getIpv4() ipv4} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for ipv4
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableConsumerDmaapModel withIpv4(String value) {
    if (this.ipv4.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "ipv4");
    return new ImmutableConsumerDmaapModel(this.pnfName, newValue, this.ipv6);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ConsumerDmaapModel#getIpv6() ipv6} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for ipv6
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableConsumerDmaapModel withIpv6(String value) {
    if (this.ipv6.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "ipv6");
    return new ImmutableConsumerDmaapModel(this.pnfName, this.ipv4, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableConsumerDmaapModel} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableConsumerDmaapModel
        && equalTo((ImmutableConsumerDmaapModel) another);
  }

  private boolean equalTo(ImmutableConsumerDmaapModel another) {
    return pnfName.equals(another.pnfName)
        && ipv4.equals(another.ipv4)
        && ipv6.equals(another.ipv6);
  }

  /**
   * Computes a hash code from attributes: {@code pnfName}, {@code ipv4}, {@code ipv6}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + pnfName.hashCode();
    h += (h << 5) + ipv4.hashCode();
    h += (h << 5) + ipv6.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ConsumerDmaapModel} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "ConsumerDmaapModel{"
        + "pnfName=" + pnfName
        + ", ipv4=" + ipv4
        + ", ipv6=" + ipv6
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link ConsumerDmaapModel} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ConsumerDmaapModel instance
   */
  public static ImmutableConsumerDmaapModel copyOf(ConsumerDmaapModel instance) {
    if (instance instanceof ImmutableConsumerDmaapModel) {
      return (ImmutableConsumerDmaapModel) instance;
    }
    return ImmutableConsumerDmaapModel.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableConsumerDmaapModel ImmutableConsumerDmaapModel}.
   * @return A new ImmutableConsumerDmaapModel builder
   */
  public static ImmutableConsumerDmaapModel.Builder builder() {
    return new ImmutableConsumerDmaapModel.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableConsumerDmaapModel ImmutableConsumerDmaapModel}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_PNF_NAME = 0x1L;
    private static final long INIT_BIT_IPV4 = 0x2L;
    private static final long INIT_BIT_IPV6 = 0x4L;
    private long initBits = 0x7L;

    private String pnfName;
    private String ipv4;
    private String ipv6;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ConsumerDmaapModel} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ConsumerDmaapModel instance) {
      Objects.requireNonNull(instance, "instance");
      pnfName(instance.getPnfName());
      ipv4(instance.getIpv4());
      ipv6(instance.getIpv6());
      return this;
    }

    /**
     * Initializes the value for the {@link ConsumerDmaapModel#getPnfName() pnfName} attribute.
     * @param pnfName The value for pnfName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder pnfName(String pnfName) {
      this.pnfName = Objects.requireNonNull(pnfName, "pnfName");
      initBits &= ~INIT_BIT_PNF_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link ConsumerDmaapModel#getIpv4() ipv4} attribute.
     * @param ipv4 The value for ipv4 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder ipv4(String ipv4) {
      this.ipv4 = Objects.requireNonNull(ipv4, "ipv4");
      initBits &= ~INIT_BIT_IPV4;
      return this;
    }

    /**
     * Initializes the value for the {@link ConsumerDmaapModel#getIpv6() ipv6} attribute.
     * @param ipv6 The value for ipv6 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder ipv6(String ipv6) {
      this.ipv6 = Objects.requireNonNull(ipv6, "ipv6");
      initBits &= ~INIT_BIT_IPV6;
      return this;
    }

    /**
     * Builds a new {@link ImmutableConsumerDmaapModel ImmutableConsumerDmaapModel}.
     * @return An immutable instance of ConsumerDmaapModel
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableConsumerDmaapModel build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableConsumerDmaapModel(pnfName, ipv4, ipv6);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_PNF_NAME) != 0) attributes.add("pnfName");
      if ((initBits & INIT_BIT_IPV4) != 0) attributes.add("ipv4");
      if ((initBits & INIT_BIT_IPV6) != 0) attributes.add("ipv6");
      return "Cannot build ConsumerDmaapModel, some of required attributes are not set " + attributes;
    }
  }
}
