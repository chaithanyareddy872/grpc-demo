// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BookingMethods.proto

package com.musicmantra.classbooking.generatedfiles;

public interface multiBookingRespOrBuilder extends
    // @@protoc_insertion_point(interface_extends:multiBookingResp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 bookinid = 1;</code>
   */
  long getBookinid();

  /**
   * <code>uint64 studentid = 2;</code>
   */
  long getStudentid();

  /**
   * <code>uint64 sessionid = 3;</code>
   */
  long getSessionid();

  /**
   * <code>.google.protobuf.Timestamp dateTime = 4;</code>
   */
  boolean hasDateTime();
  /**
   * <code>.google.protobuf.Timestamp dateTime = 4;</code>
   */
  com.google.protobuf.Timestamp getDateTime();
  /**
   * <code>.google.protobuf.Timestamp dateTime = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getDateTimeOrBuilder();

  /**
   * <code>string bookingstatus = 5;</code>
   */
  java.lang.String getBookingstatus();
  /**
   * <code>string bookingstatus = 5;</code>
   */
  com.google.protobuf.ByteString
      getBookingstatusBytes();

  /**
   * <code>string errormsg = 6;</code>
   */
  java.lang.String getErrormsg();
  /**
   * <code>string errormsg = 6;</code>
   */
  com.google.protobuf.ByteString
      getErrormsgBytes();

  /**
   * <code>int32 statuscode = 7;</code>
   */
  int getStatuscode();
}
