// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BookingMethods.proto

package com.musicmantra.classbooking.generatedfiles;

/**
 * Protobuf type {@code sessionBookingReq}
 */
public  final class sessionBookingReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sessionBookingReq)
    sessionBookingReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use sessionBookingReq.newBuilder() to construct.
  private sessionBookingReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private sessionBookingReq() {
    sessionid_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private sessionBookingReq(
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

            sessionid_ = input.readUInt64();
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
    return com.musicmantra.classbooking.generatedfiles.BookingMethods.internal_static_sessionBookingReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.musicmantra.classbooking.generatedfiles.BookingMethods.internal_static_sessionBookingReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.musicmantra.classbooking.generatedfiles.sessionBookingReq.class, com.musicmantra.classbooking.generatedfiles.sessionBookingReq.Builder.class);
  }

  public static final int SESSIONID_FIELD_NUMBER = 1;
  private long sessionid_;
  /**
   * <code>uint64 sessionid = 1;</code>
   */
  public long getSessionid() {
    return sessionid_;
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
    if (sessionid_ != 0L) {
      output.writeUInt64(1, sessionid_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sessionid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, sessionid_);
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
    if (!(obj instanceof com.musicmantra.classbooking.generatedfiles.sessionBookingReq)) {
      return super.equals(obj);
    }
    com.musicmantra.classbooking.generatedfiles.sessionBookingReq other = (com.musicmantra.classbooking.generatedfiles.sessionBookingReq) obj;

    boolean result = true;
    result = result && (getSessionid()
        == other.getSessionid());
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
    hash = (37 * hash) + SESSIONID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSessionid());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.musicmantra.classbooking.generatedfiles.sessionBookingReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.musicmantra.classbooking.generatedfiles.sessionBookingReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.musicmantra.classbooking.generatedfiles.sessionBookingReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.musicmantra.classbooking.generatedfiles.sessionBookingReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.musicmantra.classbooking.generatedfiles.sessionBookingReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.musicmantra.classbooking.generatedfiles.sessionBookingReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.musicmantra.classbooking.generatedfiles.sessionBookingReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.musicmantra.classbooking.generatedfiles.sessionBookingReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.musicmantra.classbooking.generatedfiles.sessionBookingReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.musicmantra.classbooking.generatedfiles.sessionBookingReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.musicmantra.classbooking.generatedfiles.sessionBookingReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.musicmantra.classbooking.generatedfiles.sessionBookingReq parseFrom(
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
  public static Builder newBuilder(com.musicmantra.classbooking.generatedfiles.sessionBookingReq prototype) {
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
   * Protobuf type {@code sessionBookingReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sessionBookingReq)
      com.musicmantra.classbooking.generatedfiles.sessionBookingReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.musicmantra.classbooking.generatedfiles.BookingMethods.internal_static_sessionBookingReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.musicmantra.classbooking.generatedfiles.BookingMethods.internal_static_sessionBookingReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.musicmantra.classbooking.generatedfiles.sessionBookingReq.class, com.musicmantra.classbooking.generatedfiles.sessionBookingReq.Builder.class);
    }

    // Construct using com.musicmantra.classbooking.generatedfiles.sessionBookingReq.newBuilder()
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
      sessionid_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.musicmantra.classbooking.generatedfiles.BookingMethods.internal_static_sessionBookingReq_descriptor;
    }

    @java.lang.Override
    public com.musicmantra.classbooking.generatedfiles.sessionBookingReq getDefaultInstanceForType() {
      return com.musicmantra.classbooking.generatedfiles.sessionBookingReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.musicmantra.classbooking.generatedfiles.sessionBookingReq build() {
      com.musicmantra.classbooking.generatedfiles.sessionBookingReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.musicmantra.classbooking.generatedfiles.sessionBookingReq buildPartial() {
      com.musicmantra.classbooking.generatedfiles.sessionBookingReq result = new com.musicmantra.classbooking.generatedfiles.sessionBookingReq(this);
      result.sessionid_ = sessionid_;
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
      if (other instanceof com.musicmantra.classbooking.generatedfiles.sessionBookingReq) {
        return mergeFrom((com.musicmantra.classbooking.generatedfiles.sessionBookingReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.musicmantra.classbooking.generatedfiles.sessionBookingReq other) {
      if (other == com.musicmantra.classbooking.generatedfiles.sessionBookingReq.getDefaultInstance()) return this;
      if (other.getSessionid() != 0L) {
        setSessionid(other.getSessionid());
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
      com.musicmantra.classbooking.generatedfiles.sessionBookingReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.musicmantra.classbooking.generatedfiles.sessionBookingReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long sessionid_ ;
    /**
     * <code>uint64 sessionid = 1;</code>
     */
    public long getSessionid() {
      return sessionid_;
    }
    /**
     * <code>uint64 sessionid = 1;</code>
     */
    public Builder setSessionid(long value) {
      
      sessionid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 sessionid = 1;</code>
     */
    public Builder clearSessionid() {
      
      sessionid_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:sessionBookingReq)
  }

  // @@protoc_insertion_point(class_scope:sessionBookingReq)
  private static final com.musicmantra.classbooking.generatedfiles.sessionBookingReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.musicmantra.classbooking.generatedfiles.sessionBookingReq();
  }

  public static com.musicmantra.classbooking.generatedfiles.sessionBookingReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<sessionBookingReq>
      PARSER = new com.google.protobuf.AbstractParser<sessionBookingReq>() {
    @java.lang.Override
    public sessionBookingReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new sessionBookingReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<sessionBookingReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<sessionBookingReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.musicmantra.classbooking.generatedfiles.sessionBookingReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

