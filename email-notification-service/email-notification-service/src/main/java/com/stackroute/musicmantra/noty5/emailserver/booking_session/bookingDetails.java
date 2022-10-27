// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: booking_session.proto

package com.stackroute.musicmantra.noty5.emailserver.booking_session;

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
    bookingId_ = 0;
    bookingtype_ = "";
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
          case 8: {

            bookingId_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            bookingtype_ = s;
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
    return com.stackroute.musicmantra.noty5.emailserver.booking_session.BookingSession.internal_static_bookingDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.stackroute.musicmantra.noty5.emailserver.booking_session.BookingSession.internal_static_bookingDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails.class, com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails.Builder.class);
  }

  public static final int BOOKINGID_FIELD_NUMBER = 1;
  private int bookingId_;
  /**
   * <code>int32 bookingId = 1;</code>
   */
  public int getBookingId() {
    return bookingId_;
  }

  public static final int BOOKINGTYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object bookingtype_;
  /**
   * <code>string bookingtype = 2;</code>
   */
  public java.lang.String getBookingtype() {
    java.lang.Object ref = bookingtype_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bookingtype_ = s;
      return s;
    }
  }
  /**
   * <code>string bookingtype = 2;</code>
   */
  public com.google.protobuf.ByteString
      getBookingtypeBytes() {
    java.lang.Object ref = bookingtype_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bookingtype_ = b;
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
    if (bookingId_ != 0) {
      output.writeInt32(1, bookingId_);
    }
    if (!getBookingtypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, bookingtype_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bookingId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, bookingId_);
    }
    if (!getBookingtypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, bookingtype_);
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
    if (!(obj instanceof com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails)) {
      return super.equals(obj);
    }
    com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails other = (com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails) obj;

    boolean result = true;
    result = result && (getBookingId()
        == other.getBookingId());
    result = result && getBookingtype()
        .equals(other.getBookingtype());
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
    hash = (37 * hash) + BOOKINGID_FIELD_NUMBER;
    hash = (53 * hash) + getBookingId();
    hash = (37 * hash) + BOOKINGTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getBookingtype().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails parseFrom(
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
  public static Builder newBuilder(com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails prototype) {
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
      com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.stackroute.musicmantra.noty5.emailserver.booking_session.BookingSession.internal_static_bookingDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.stackroute.musicmantra.noty5.emailserver.booking_session.BookingSession.internal_static_bookingDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails.class, com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails.Builder.class);
    }

    // Construct using com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails.newBuilder()
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
      bookingId_ = 0;

      bookingtype_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.stackroute.musicmantra.noty5.emailserver.booking_session.BookingSession.internal_static_bookingDetails_descriptor;
    }

    @java.lang.Override
    public com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails getDefaultInstanceForType() {
      return com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails.getDefaultInstance();
    }

    @java.lang.Override
    public com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails build() {
      com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails buildPartial() {
      com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails result = new com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails(this);
      result.bookingId_ = bookingId_;
      result.bookingtype_ = bookingtype_;
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
      if (other instanceof com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails) {
        return mergeFrom((com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails other) {
      if (other == com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails.getDefaultInstance()) return this;
      if (other.getBookingId() != 0) {
        setBookingId(other.getBookingId());
      }
      if (!other.getBookingtype().isEmpty()) {
        bookingtype_ = other.bookingtype_;
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
      com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bookingId_ ;
    /**
     * <code>int32 bookingId = 1;</code>
     */
    public int getBookingId() {
      return bookingId_;
    }
    /**
     * <code>int32 bookingId = 1;</code>
     */
    public Builder setBookingId(int value) {
      
      bookingId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 bookingId = 1;</code>
     */
    public Builder clearBookingId() {
      
      bookingId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object bookingtype_ = "";
    /**
     * <code>string bookingtype = 2;</code>
     */
    public java.lang.String getBookingtype() {
      java.lang.Object ref = bookingtype_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bookingtype_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string bookingtype = 2;</code>
     */
    public com.google.protobuf.ByteString
        getBookingtypeBytes() {
      java.lang.Object ref = bookingtype_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bookingtype_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string bookingtype = 2;</code>
     */
    public Builder setBookingtype(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      bookingtype_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string bookingtype = 2;</code>
     */
    public Builder clearBookingtype() {
      
      bookingtype_ = getDefaultInstance().getBookingtype();
      onChanged();
      return this;
    }
    /**
     * <code>string bookingtype = 2;</code>
     */
    public Builder setBookingtypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      bookingtype_ = value;
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
  private static final com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails();
  }

  public static com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails getDefaultInstance() {
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
  public com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

