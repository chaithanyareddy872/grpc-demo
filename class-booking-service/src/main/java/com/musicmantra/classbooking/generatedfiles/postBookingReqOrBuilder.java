// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BookingMethods.proto

package com.musicmantra.classbooking.generatedfiles;

public interface postBookingReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:postBookingReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 studentid = 1;</code>
   */
  long getStudentid();

  /**
   * <code>uint64 sessionid = 2;</code>
   */
  long getSessionid();

  /**
   * <code>.google.protobuf.Timestamp dateTime = 3;</code>
   */
  boolean hasDateTime();
  /**
   * <code>.google.protobuf.Timestamp dateTime = 3;</code>
   */
  com.google.protobuf.Timestamp getDateTime();
  /**
   * <code>.google.protobuf.Timestamp dateTime = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getDateTimeOrBuilder();

  /**
   * <code>string status = 4;</code>
   */
  java.lang.String getStatus();
  /**
   * <code>string status = 4;</code>
   */
  com.google.protobuf.ByteString
      getStatusBytes();
}