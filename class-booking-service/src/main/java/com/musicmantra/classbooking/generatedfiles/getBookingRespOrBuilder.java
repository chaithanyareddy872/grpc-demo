// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BookingMethods.proto

package com.musicmantra.classbooking.generatedfiles;

public interface getBookingRespOrBuilder extends
    // @@protoc_insertion_point(interface_extends:getBookingResp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 bookingid = 1;</code>
   */
  long getBookingid();

  /**
   * <code>uint64 studentid = 2;</code>
   */
  long getStudentid();

  /**
   * <code>uint64 sessionid = 3;</code>
   */
  long getSessionid();

  /**
   * <code>string status = 4;</code>
   */
  java.lang.String getStatus();
  /**
   * <code>string status = 4;</code>
   */
  com.google.protobuf.ByteString
      getStatusBytes();

  /**
   * <code>.google.protobuf.Timestamp bookingdatetime = 5;</code>
   */
  boolean hasBookingdatetime();
  /**
   * <code>.google.protobuf.Timestamp bookingdatetime = 5;</code>
   */
  com.google.protobuf.Timestamp getBookingdatetime();
  /**
   * <code>.google.protobuf.Timestamp bookingdatetime = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getBookingdatetimeOrBuilder();
}
