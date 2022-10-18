// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EmailService.proto

package com.stackroute.musicmantra.noty5.emailserver;

/**
 * Protobuf type {@code bookingDetails}
 */
public  final class bookingDetails extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bookingDetails)
    bookingDetailsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use bookingDetails.newBuilder() to construct.
  private bookingDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private bookingDetails() {
    userName_ = "";
    userEmail_ = "";
    courseName_ = "";
    sendersEmail_ = "";
    sendersEmailPassword_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private bookingDetails(
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

            userName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            userEmail_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            courseName_ = s;
            break;
          }
          case 34: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (timeName_ != null) {
              subBuilder = timeName_.toBuilder();
            }
            timeName_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(timeName_);
              timeName_ = subBuilder.buildPartial();
            }

            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            sendersEmail_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            sendersEmailPassword_ = s;
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
    return com.stackroute.musicmantra.noty5.emailserver.EmailService.internal_static_bookingDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.stackroute.musicmantra.noty5.emailserver.EmailService.internal_static_bookingDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.stackroute.musicmantra.noty5.emailserver.bookingDetails.class, com.stackroute.musicmantra.noty5.emailserver.bookingDetails.Builder.class);
  }

  public static final int USERNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object userName_;
  /**
   * <code>string userName = 1;</code>
   */
  public java.lang.String getUserName() {
    java.lang.Object ref = userName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userName_ = s;
      return s;
    }
  }
  /**
   * <code>string userName = 1;</code>
   */
  public com.google.protobuf.ByteString
      getUserNameBytes() {
    java.lang.Object ref = userName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USEREMAIL_FIELD_NUMBER = 2;
  private volatile java.lang.Object userEmail_;
  /**
   * <code>string userEmail = 2;</code>
   */
  public java.lang.String getUserEmail() {
    java.lang.Object ref = userEmail_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userEmail_ = s;
      return s;
    }
  }
  /**
   * <code>string userEmail = 2;</code>
   */
  public com.google.protobuf.ByteString
      getUserEmailBytes() {
    java.lang.Object ref = userEmail_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userEmail_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COURSENAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object courseName_;
  /**
   * <code>string courseName = 3;</code>
   */
  public java.lang.String getCourseName() {
    java.lang.Object ref = courseName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      courseName_ = s;
      return s;
    }
  }
  /**
   * <code>string courseName = 3;</code>
   */
  public com.google.protobuf.ByteString
      getCourseNameBytes() {
    java.lang.Object ref = courseName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      courseName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIME_NAME_FIELD_NUMBER = 4;
  private com.google.protobuf.Timestamp timeName_;
  /**
   * <code>.google.protobuf.Timestamp time_name = 4;</code>
   */
  public boolean hasTimeName() {
    return timeName_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp time_name = 4;</code>
   */
  public com.google.protobuf.Timestamp getTimeName() {
    return timeName_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timeName_;
  }
  /**
   * <code>.google.protobuf.Timestamp time_name = 4;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getTimeNameOrBuilder() {
    return getTimeName();
  }

  public static final int SENDERSEMAIL_FIELD_NUMBER = 5;
  private volatile java.lang.Object sendersEmail_;
  /**
   * <code>string sendersEmail = 5;</code>
   */
  public java.lang.String getSendersEmail() {
    java.lang.Object ref = sendersEmail_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sendersEmail_ = s;
      return s;
    }
  }
  /**
   * <code>string sendersEmail = 5;</code>
   */
  public com.google.protobuf.ByteString
      getSendersEmailBytes() {
    java.lang.Object ref = sendersEmail_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sendersEmail_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SENDERSEMAILPASSWORD_FIELD_NUMBER = 6;
  private volatile java.lang.Object sendersEmailPassword_;
  /**
   * <code>string sendersEmailPassword = 6;</code>
   */
  public java.lang.String getSendersEmailPassword() {
    java.lang.Object ref = sendersEmailPassword_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sendersEmailPassword_ = s;
      return s;
    }
  }
  /**
   * <code>string sendersEmailPassword = 6;</code>
   */
  public com.google.protobuf.ByteString
      getSendersEmailPasswordBytes() {
    java.lang.Object ref = sendersEmailPassword_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sendersEmailPassword_ = b;
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
    if (!getUserNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, userName_);
    }
    if (!getUserEmailBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, userEmail_);
    }
    if (!getCourseNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, courseName_);
    }
    if (timeName_ != null) {
      output.writeMessage(4, getTimeName());
    }
    if (!getSendersEmailBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, sendersEmail_);
    }
    if (!getSendersEmailPasswordBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, sendersEmailPassword_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUserNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, userName_);
    }
    if (!getUserEmailBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, userEmail_);
    }
    if (!getCourseNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, courseName_);
    }
    if (timeName_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getTimeName());
    }
    if (!getSendersEmailBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, sendersEmail_);
    }
    if (!getSendersEmailPasswordBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, sendersEmailPassword_);
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
    if (!(obj instanceof com.stackroute.musicmantra.noty5.emailserver.bookingDetails)) {
      return super.equals(obj);
    }
    com.stackroute.musicmantra.noty5.emailserver.bookingDetails other = (com.stackroute.musicmantra.noty5.emailserver.bookingDetails) obj;

    boolean result = true;
    result = result && getUserName()
        .equals(other.getUserName());
    result = result && getUserEmail()
        .equals(other.getUserEmail());
    result = result && getCourseName()
        .equals(other.getCourseName());
    result = result && (hasTimeName() == other.hasTimeName());
    if (hasTimeName()) {
      result = result && getTimeName()
          .equals(other.getTimeName());
    }
    result = result && getSendersEmail()
        .equals(other.getSendersEmail());
    result = result && getSendersEmailPassword()
        .equals(other.getSendersEmailPassword());
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
    hash = (37 * hash) + USERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getUserName().hashCode();
    hash = (37 * hash) + USEREMAIL_FIELD_NUMBER;
    hash = (53 * hash) + getUserEmail().hashCode();
    hash = (37 * hash) + COURSENAME_FIELD_NUMBER;
    hash = (53 * hash) + getCourseName().hashCode();
    if (hasTimeName()) {
      hash = (37 * hash) + TIME_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getTimeName().hashCode();
    }
    hash = (37 * hash) + SENDERSEMAIL_FIELD_NUMBER;
    hash = (53 * hash) + getSendersEmail().hashCode();
    hash = (37 * hash) + SENDERSEMAILPASSWORD_FIELD_NUMBER;
    hash = (53 * hash) + getSendersEmailPassword().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.stackroute.musicmantra.noty5.emailserver.bookingDetails parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.bookingDetails parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.bookingDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.bookingDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.bookingDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.bookingDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.bookingDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.bookingDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.bookingDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.bookingDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.bookingDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.bookingDetails parseFrom(
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
  public static Builder newBuilder(com.stackroute.musicmantra.noty5.emailserver.bookingDetails prototype) {
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
   * Protobuf type {@code bookingDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bookingDetails)
      com.stackroute.musicmantra.noty5.emailserver.bookingDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.stackroute.musicmantra.noty5.emailserver.EmailService.internal_static_bookingDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.stackroute.musicmantra.noty5.emailserver.EmailService.internal_static_bookingDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.stackroute.musicmantra.noty5.emailserver.bookingDetails.class, com.stackroute.musicmantra.noty5.emailserver.bookingDetails.Builder.class);
    }

    // Construct using com.stackroute.musicmantra.noty5.emailserver.bookingDetails.newBuilder()
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
      userName_ = "";

      userEmail_ = "";

      courseName_ = "";

      if (timeNameBuilder_ == null) {
        timeName_ = null;
      } else {
        timeName_ = null;
        timeNameBuilder_ = null;
      }
      sendersEmail_ = "";

      sendersEmailPassword_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.stackroute.musicmantra.noty5.emailserver.EmailService.internal_static_bookingDetails_descriptor;
    }

    @java.lang.Override
    public com.stackroute.musicmantra.noty5.emailserver.bookingDetails getDefaultInstanceForType() {
      return com.stackroute.musicmantra.noty5.emailserver.bookingDetails.getDefaultInstance();
    }

    @java.lang.Override
    public com.stackroute.musicmantra.noty5.emailserver.bookingDetails build() {
      com.stackroute.musicmantra.noty5.emailserver.bookingDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.stackroute.musicmantra.noty5.emailserver.bookingDetails buildPartial() {
      com.stackroute.musicmantra.noty5.emailserver.bookingDetails result = new com.stackroute.musicmantra.noty5.emailserver.bookingDetails(this);
      result.userName_ = userName_;
      result.userEmail_ = userEmail_;
      result.courseName_ = courseName_;
      if (timeNameBuilder_ == null) {
        result.timeName_ = timeName_;
      } else {
        result.timeName_ = timeNameBuilder_.build();
      }
      result.sendersEmail_ = sendersEmail_;
      result.sendersEmailPassword_ = sendersEmailPassword_;
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
      if (other instanceof com.stackroute.musicmantra.noty5.emailserver.bookingDetails) {
        return mergeFrom((com.stackroute.musicmantra.noty5.emailserver.bookingDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.stackroute.musicmantra.noty5.emailserver.bookingDetails other) {
      if (other == com.stackroute.musicmantra.noty5.emailserver.bookingDetails.getDefaultInstance()) return this;
      if (!other.getUserName().isEmpty()) {
        userName_ = other.userName_;
        onChanged();
      }
      if (!other.getUserEmail().isEmpty()) {
        userEmail_ = other.userEmail_;
        onChanged();
      }
      if (!other.getCourseName().isEmpty()) {
        courseName_ = other.courseName_;
        onChanged();
      }
      if (other.hasTimeName()) {
        mergeTimeName(other.getTimeName());
      }
      if (!other.getSendersEmail().isEmpty()) {
        sendersEmail_ = other.sendersEmail_;
        onChanged();
      }
      if (!other.getSendersEmailPassword().isEmpty()) {
        sendersEmailPassword_ = other.sendersEmailPassword_;
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
      com.stackroute.musicmantra.noty5.emailserver.bookingDetails parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.stackroute.musicmantra.noty5.emailserver.bookingDetails) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object userName_ = "";
    /**
     * <code>string userName = 1;</code>
     */
    public java.lang.String getUserName() {
      java.lang.Object ref = userName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string userName = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUserNameBytes() {
      java.lang.Object ref = userName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string userName = 1;</code>
     */
    public Builder setUserName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string userName = 1;</code>
     */
    public Builder clearUserName() {
      
      userName_ = getDefaultInstance().getUserName();
      onChanged();
      return this;
    }
    /**
     * <code>string userName = 1;</code>
     */
    public Builder setUserNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object userEmail_ = "";
    /**
     * <code>string userEmail = 2;</code>
     */
    public java.lang.String getUserEmail() {
      java.lang.Object ref = userEmail_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userEmail_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string userEmail = 2;</code>
     */
    public com.google.protobuf.ByteString
        getUserEmailBytes() {
      java.lang.Object ref = userEmail_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userEmail_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string userEmail = 2;</code>
     */
    public Builder setUserEmail(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userEmail_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string userEmail = 2;</code>
     */
    public Builder clearUserEmail() {
      
      userEmail_ = getDefaultInstance().getUserEmail();
      onChanged();
      return this;
    }
    /**
     * <code>string userEmail = 2;</code>
     */
    public Builder setUserEmailBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userEmail_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object courseName_ = "";
    /**
     * <code>string courseName = 3;</code>
     */
    public java.lang.String getCourseName() {
      java.lang.Object ref = courseName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        courseName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string courseName = 3;</code>
     */
    public com.google.protobuf.ByteString
        getCourseNameBytes() {
      java.lang.Object ref = courseName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        courseName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string courseName = 3;</code>
     */
    public Builder setCourseName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      courseName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string courseName = 3;</code>
     */
    public Builder clearCourseName() {
      
      courseName_ = getDefaultInstance().getCourseName();
      onChanged();
      return this;
    }
    /**
     * <code>string courseName = 3;</code>
     */
    public Builder setCourseNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      courseName_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp timeName_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> timeNameBuilder_;
    /**
     * <code>.google.protobuf.Timestamp time_name = 4;</code>
     */
    public boolean hasTimeName() {
      return timeNameBuilder_ != null || timeName_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp time_name = 4;</code>
     */
    public com.google.protobuf.Timestamp getTimeName() {
      if (timeNameBuilder_ == null) {
        return timeName_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timeName_;
      } else {
        return timeNameBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp time_name = 4;</code>
     */
    public Builder setTimeName(com.google.protobuf.Timestamp value) {
      if (timeNameBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timeName_ = value;
        onChanged();
      } else {
        timeNameBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp time_name = 4;</code>
     */
    public Builder setTimeName(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (timeNameBuilder_ == null) {
        timeName_ = builderForValue.build();
        onChanged();
      } else {
        timeNameBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp time_name = 4;</code>
     */
    public Builder mergeTimeName(com.google.protobuf.Timestamp value) {
      if (timeNameBuilder_ == null) {
        if (timeName_ != null) {
          timeName_ =
            com.google.protobuf.Timestamp.newBuilder(timeName_).mergeFrom(value).buildPartial();
        } else {
          timeName_ = value;
        }
        onChanged();
      } else {
        timeNameBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp time_name = 4;</code>
     */
    public Builder clearTimeName() {
      if (timeNameBuilder_ == null) {
        timeName_ = null;
        onChanged();
      } else {
        timeName_ = null;
        timeNameBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp time_name = 4;</code>
     */
    public com.google.protobuf.Timestamp.Builder getTimeNameBuilder() {
      
      onChanged();
      return getTimeNameFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp time_name = 4;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getTimeNameOrBuilder() {
      if (timeNameBuilder_ != null) {
        return timeNameBuilder_.getMessageOrBuilder();
      } else {
        return timeName_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : timeName_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp time_name = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getTimeNameFieldBuilder() {
      if (timeNameBuilder_ == null) {
        timeNameBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getTimeName(),
                getParentForChildren(),
                isClean());
        timeName_ = null;
      }
      return timeNameBuilder_;
    }

    private java.lang.Object sendersEmail_ = "";
    /**
     * <code>string sendersEmail = 5;</code>
     */
    public java.lang.String getSendersEmail() {
      java.lang.Object ref = sendersEmail_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sendersEmail_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sendersEmail = 5;</code>
     */
    public com.google.protobuf.ByteString
        getSendersEmailBytes() {
      java.lang.Object ref = sendersEmail_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sendersEmail_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sendersEmail = 5;</code>
     */
    public Builder setSendersEmail(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sendersEmail_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string sendersEmail = 5;</code>
     */
    public Builder clearSendersEmail() {
      
      sendersEmail_ = getDefaultInstance().getSendersEmail();
      onChanged();
      return this;
    }
    /**
     * <code>string sendersEmail = 5;</code>
     */
    public Builder setSendersEmailBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sendersEmail_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object sendersEmailPassword_ = "";
    /**
     * <code>string sendersEmailPassword = 6;</code>
     */
    public java.lang.String getSendersEmailPassword() {
      java.lang.Object ref = sendersEmailPassword_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sendersEmailPassword_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sendersEmailPassword = 6;</code>
     */
    public com.google.protobuf.ByteString
        getSendersEmailPasswordBytes() {
      java.lang.Object ref = sendersEmailPassword_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sendersEmailPassword_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sendersEmailPassword = 6;</code>
     */
    public Builder setSendersEmailPassword(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sendersEmailPassword_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string sendersEmailPassword = 6;</code>
     */
    public Builder clearSendersEmailPassword() {
      
      sendersEmailPassword_ = getDefaultInstance().getSendersEmailPassword();
      onChanged();
      return this;
    }
    /**
     * <code>string sendersEmailPassword = 6;</code>
     */
    public Builder setSendersEmailPasswordBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sendersEmailPassword_ = value;
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


    // @@protoc_insertion_point(builder_scope:bookingDetails)
  }

  // @@protoc_insertion_point(class_scope:bookingDetails)
  private static final com.stackroute.musicmantra.noty5.emailserver.bookingDetails DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.stackroute.musicmantra.noty5.emailserver.bookingDetails();
  }

  public static com.stackroute.musicmantra.noty5.emailserver.bookingDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<bookingDetails>
      PARSER = new com.google.protobuf.AbstractParser<bookingDetails>() {
    @java.lang.Override
    public bookingDetails parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new bookingDetails(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<bookingDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<bookingDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.stackroute.musicmantra.noty5.emailserver.bookingDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

