// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: registration_forgotPassword.proto

package com.stackroute.musicmantra.noty5.emailserver.register;

/**
 * Protobuf type {@code mailRequesttoregister}
 */
public  final class mailRequesttoregister extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:mailRequesttoregister)
    mailRequesttoregisterOrBuilder {
private static final long serialVersionUID = 0L;
  // Use mailRequesttoregister.newBuilder() to construct.
  private mailRequesttoregister(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private mailRequesttoregister() {
    emailid_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private mailRequesttoregister(
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

            emailid_ = s;
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
    return com.stackroute.musicmantra.noty5.emailserver.register.RegistrationForgotPassword.internal_static_mailRequesttoregister_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.stackroute.musicmantra.noty5.emailserver.register.RegistrationForgotPassword.internal_static_mailRequesttoregister_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister.class, com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister.Builder.class);
  }

  public static final int EMAILID_FIELD_NUMBER = 1;
  private volatile java.lang.Object emailid_;
  /**
   * <code>string emailid = 1;</code>
   */
  public java.lang.String getEmailid() {
    java.lang.Object ref = emailid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      emailid_ = s;
      return s;
    }
  }
  /**
   * <code>string emailid = 1;</code>
   */
  public com.google.protobuf.ByteString
      getEmailidBytes() {
    java.lang.Object ref = emailid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      emailid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getEmailidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, emailid_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getEmailidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, emailid_);
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
    if (!(obj instanceof com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister)) {
      return super.equals(obj);
    }
    com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister other = (com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister) obj;

    boolean result = true;
    result = result && getEmailid()
        .equals(other.getEmailid());
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
    hash = (37 * hash) + EMAILID_FIELD_NUMBER;
    hash = (53 * hash) + getEmailid().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister parseFrom(
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
  public static Builder newBuilder(com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister prototype) {
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
   * Protobuf type {@code mailRequesttoregister}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mailRequesttoregister)
      com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregisterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.stackroute.musicmantra.noty5.emailserver.register.RegistrationForgotPassword.internal_static_mailRequesttoregister_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.stackroute.musicmantra.noty5.emailserver.register.RegistrationForgotPassword.internal_static_mailRequesttoregister_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister.class, com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister.Builder.class);
    }

    // Construct using com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister.newBuilder()
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
      emailid_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.stackroute.musicmantra.noty5.emailserver.register.RegistrationForgotPassword.internal_static_mailRequesttoregister_descriptor;
    }

    @java.lang.Override
    public com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister getDefaultInstanceForType() {
      return com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister.getDefaultInstance();
    }

    @java.lang.Override
    public com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister build() {
      com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister buildPartial() {
      com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister result = new com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister(this);
      result.emailid_ = emailid_;
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
      if (other instanceof com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister) {
        return mergeFrom((com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister other) {
      if (other == com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister.getDefaultInstance()) return this;
      if (!other.getEmailid().isEmpty()) {
        emailid_ = other.emailid_;
        onChanged();
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
      com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object emailid_ = "";
    /**
     * <code>string emailid = 1;</code>
     */
    public java.lang.String getEmailid() {
      java.lang.Object ref = emailid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        emailid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string emailid = 1;</code>
     */
    public com.google.protobuf.ByteString
        getEmailidBytes() {
      java.lang.Object ref = emailid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        emailid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string emailid = 1;</code>
     */
    public Builder setEmailid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      emailid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string emailid = 1;</code>
     */
    public Builder clearEmailid() {
      
      emailid_ = getDefaultInstance().getEmailid();
      onChanged();
      return this;
    }
    /**
     * <code>string emailid = 1;</code>
     */
    public Builder setEmailidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      emailid_ = value;
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


    // @@protoc_insertion_point(builder_scope:mailRequesttoregister)
  }

  // @@protoc_insertion_point(class_scope:mailRequesttoregister)
  private static final com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister();
  }

  public static com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<mailRequesttoregister>
      PARSER = new com.google.protobuf.AbstractParser<mailRequesttoregister>() {
    @java.lang.Override
    public mailRequesttoregister parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new mailRequesttoregister(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<mailRequesttoregister> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<mailRequesttoregister> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
