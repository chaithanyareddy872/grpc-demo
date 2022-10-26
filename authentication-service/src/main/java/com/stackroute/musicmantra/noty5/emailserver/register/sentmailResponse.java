// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: registration_forgotPassword.proto

package com.stackroute.musicmantra.noty5.emailserver.register;

/**
 * Protobuf type {@code sentmailResponse}
 */
public  final class sentmailResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sentmailResponse)
    sentmailResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use sentmailResponse.newBuilder() to construct.
  private sentmailResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private sentmailResponse() {
    message_ = "";
    responsecode_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private sentmailResponse(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            message_ = s;
            break;
          }
          case 16: {

            responsecode_ = input.readInt32();
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
    return com.stackroute.musicmantra.noty5.emailserver.register.RegistrationForgotPassword.internal_static_sentmailResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.stackroute.musicmantra.noty5.emailserver.register.RegistrationForgotPassword.internal_static_sentmailResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse.class, com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse.Builder.class);
  }

  public static final int MESSAGE_FIELD_NUMBER = 1;
  private volatile java.lang.Object message_;
  /**
   * <code>string message = 1;</code>
   */
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESPONSECODE_FIELD_NUMBER = 2;
  private int responsecode_;
  /**
   * <code>int32 Responsecode = 2;</code>
   */
  public int getResponsecode() {
    return responsecode_;
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
    if (!getMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, message_);
    }
    if (responsecode_ != 0) {
      output.writeInt32(2, responsecode_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, message_);
    }
    if (responsecode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, responsecode_);
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
    if (!(obj instanceof com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse)) {
      return super.equals(obj);
    }
    com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse other = (com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse) obj;

    boolean result = true;
    result = result && getMessage()
        .equals(other.getMessage());
    result = result && (getResponsecode()
        == other.getResponsecode());
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
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (37 * hash) + RESPONSECODE_FIELD_NUMBER;
    hash = (53 * hash) + getResponsecode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse parseFrom(
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
  public static Builder newBuilder(com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse prototype) {
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
   * Protobuf type {@code sentmailResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sentmailResponse)
      com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.stackroute.musicmantra.noty5.emailserver.register.RegistrationForgotPassword.internal_static_sentmailResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.stackroute.musicmantra.noty5.emailserver.register.RegistrationForgotPassword.internal_static_sentmailResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse.class, com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse.Builder.class);
    }

    // Construct using com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse.newBuilder()
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
      message_ = "";

      responsecode_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.stackroute.musicmantra.noty5.emailserver.register.RegistrationForgotPassword.internal_static_sentmailResponse_descriptor;
    }

    @java.lang.Override
    public com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse getDefaultInstanceForType() {
      return com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse build() {
      com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse buildPartial() {
      com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse result = new com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse(this);
      result.message_ = message_;
      result.responsecode_ = responsecode_;
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
      if (other instanceof com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse) {
        return mergeFrom((com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse other) {
      if (other == com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse.getDefaultInstance()) return this;
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (other.getResponsecode() != 0) {
        setResponsecode(other.getResponsecode());
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
      com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 1;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message = 1;</code>
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 1;</code>
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string message = 1;</code>
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
      onChanged();
      return this;
    }

    private int responsecode_ ;
    /**
     * <code>int32 Responsecode = 2;</code>
     */
    public int getResponsecode() {
      return responsecode_;
    }
    /**
     * <code>int32 Responsecode = 2;</code>
     */
    public Builder setResponsecode(int value) {
      
      responsecode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 Responsecode = 2;</code>
     */
    public Builder clearResponsecode() {
      
      responsecode_ = 0;
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


    // @@protoc_insertion_point(builder_scope:sentmailResponse)
  }

  // @@protoc_insertion_point(class_scope:sentmailResponse)
  private static final com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse();
  }

  public static com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<sentmailResponse>
      PARSER = new com.google.protobuf.AbstractParser<sentmailResponse>() {
    @java.lang.Override
    public sentmailResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new sentmailResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<sentmailResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<sentmailResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

