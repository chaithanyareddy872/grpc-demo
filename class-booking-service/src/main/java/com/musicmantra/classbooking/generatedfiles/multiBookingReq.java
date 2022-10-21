// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BookingMethods.proto

package com.musicmantra.classbooking.generatedfiles;

/**
 * <pre>
 *multi record req message
 * </pre>
 *
 * Protobuf type {@code multiBookingReq}
 */
public  final class multiBookingReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:multiBookingReq)
    multiBookingReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use multiBookingReq.newBuilder() to construct.
  private multiBookingReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private multiBookingReq() {
    userid_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private multiBookingReq(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            userid_ = input.readUInt64();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.musicmantra.classbooking.generatedfiles.BookingMethods.internal_static_multiBookingReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.musicmantra.classbooking.generatedfiles.BookingMethods.internal_static_multiBookingReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.musicmantra.classbooking.generatedfiles.multiBookingReq.class, com.musicmantra.classbooking.generatedfiles.multiBookingReq.Builder.class);
  }

  public static final int USERID_FIELD_NUMBER = 1;
  private long userid_;
  /**
   * <code>uint64 userid = 1;</code>
   */
  public long getUserid() {
    return userid_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (userid_ != 0L) {
      output.writeUInt64(1, userid_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (userid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, userid_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.musicmantra.classbooking.generatedfiles.multiBookingReq)) {
      return super.equals(obj);
    }
    com.musicmantra.classbooking.generatedfiles.multiBookingReq other = (com.musicmantra.classbooking.generatedfiles.multiBookingReq) obj;

    boolean result = true;
    result = result && (getUserid()
        == other.getUserid());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + USERID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUserid());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.musicmantra.classbooking.generatedfiles.multiBookingReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.musicmantra.classbooking.generatedfiles.multiBookingReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.musicmantra.classbooking.generatedfiles.multiBookingReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.musicmantra.classbooking.generatedfiles.multiBookingReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.musicmantra.classbooking.generatedfiles.multiBookingReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.musicmantra.classbooking.generatedfiles.multiBookingReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.musicmantra.classbooking.generatedfiles.multiBookingReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.musicmantra.classbooking.generatedfiles.multiBookingReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.musicmantra.classbooking.generatedfiles.multiBookingReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.musicmantra.classbooking.generatedfiles.multiBookingReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.musicmantra.classbooking.generatedfiles.multiBookingReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.musicmantra.classbooking.generatedfiles.multiBookingReq parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.musicmantra.classbooking.generatedfiles.multiBookingReq prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   *multi record req message
   * </pre>
   *
   * Protobuf type {@code multiBookingReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:multiBookingReq)
      com.musicmantra.classbooking.generatedfiles.multiBookingReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.musicmantra.classbooking.generatedfiles.BookingMethods.internal_static_multiBookingReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.musicmantra.classbooking.generatedfiles.BookingMethods.internal_static_multiBookingReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.musicmantra.classbooking.generatedfiles.multiBookingReq.class, com.musicmantra.classbooking.generatedfiles.multiBookingReq.Builder.class);
    }

    // Construct using com.musicmantra.classbooking.generatedfiles.multiBookingReq.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      userid_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.musicmantra.classbooking.generatedfiles.BookingMethods.internal_static_multiBookingReq_descriptor;
    }

    @java.lang.Override
    public com.musicmantra.classbooking.generatedfiles.multiBookingReq getDefaultInstanceForType() {
      return com.musicmantra.classbooking.generatedfiles.multiBookingReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.musicmantra.classbooking.generatedfiles.multiBookingReq build() {
      com.musicmantra.classbooking.generatedfiles.multiBookingReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.musicmantra.classbooking.generatedfiles.multiBookingReq buildPartial() {
      com.musicmantra.classbooking.generatedfiles.multiBookingReq result = new com.musicmantra.classbooking.generatedfiles.multiBookingReq(this);
      result.userid_ = userid_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.musicmantra.classbooking.generatedfiles.multiBookingReq) {
        return mergeFrom((com.musicmantra.classbooking.generatedfiles.multiBookingReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.musicmantra.classbooking.generatedfiles.multiBookingReq other) {
      if (other == com.musicmantra.classbooking.generatedfiles.multiBookingReq.getDefaultInstance()) return this;
      if (other.getUserid() != 0L) {
        setUserid(other.getUserid());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.musicmantra.classbooking.generatedfiles.multiBookingReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.musicmantra.classbooking.generatedfiles.multiBookingReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long userid_ ;
    /**
     * <code>uint64 userid = 1;</code>
     */
    public long getUserid() {
      return userid_;
    }
    /**
     * <code>uint64 userid = 1;</code>
     */
    public Builder setUserid(long value) {
      
      userid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 userid = 1;</code>
     */
    public Builder clearUserid() {
      
      userid_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:multiBookingReq)
  }

  // @@protoc_insertion_point(class_scope:multiBookingReq)
  private static final com.musicmantra.classbooking.generatedfiles.multiBookingReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.musicmantra.classbooking.generatedfiles.multiBookingReq();
  }

  public static com.musicmantra.classbooking.generatedfiles.multiBookingReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<multiBookingReq>
      PARSER = new com.google.protobuf.AbstractParser<multiBookingReq>() {
    @java.lang.Override
    public multiBookingReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new multiBookingReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<multiBookingReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<multiBookingReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.musicmantra.classbooking.generatedfiles.multiBookingReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

