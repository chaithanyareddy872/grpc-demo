package com.musicmantra.classbooking.addnewrecord;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 *defining service class
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: BookingMethods.proto")
public final class ClassBookingGrpc {

  private ClassBookingGrpc() {}

  public static final String SERVICE_NAME = "ClassBooking";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.musicmantra.classbooking.addnewrecord.postBookingReq,
      com.musicmantra.classbooking.addnewrecord.BookingResp> getPostBookingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "postBooking",
      requestType = com.musicmantra.classbooking.addnewrecord.postBookingReq.class,
      responseType = com.musicmantra.classbooking.addnewrecord.BookingResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.musicmantra.classbooking.addnewrecord.postBookingReq,
      com.musicmantra.classbooking.addnewrecord.BookingResp> getPostBookingMethod() {
    io.grpc.MethodDescriptor<com.musicmantra.classbooking.addnewrecord.postBookingReq, com.musicmantra.classbooking.addnewrecord.BookingResp> getPostBookingMethod;
    if ((getPostBookingMethod = ClassBookingGrpc.getPostBookingMethod) == null) {
      synchronized (ClassBookingGrpc.class) {
        if ((getPostBookingMethod = ClassBookingGrpc.getPostBookingMethod) == null) {
          ClassBookingGrpc.getPostBookingMethod = getPostBookingMethod = 
              io.grpc.MethodDescriptor.<com.musicmantra.classbooking.addnewrecord.postBookingReq, com.musicmantra.classbooking.addnewrecord.BookingResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ClassBooking", "postBooking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.musicmantra.classbooking.addnewrecord.postBookingReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.musicmantra.classbooking.addnewrecord.BookingResp.getDefaultInstance()))
                  .setSchemaDescriptor(new ClassBookingMethodDescriptorSupplier("postBooking"))
                  .build();
          }
        }
     }
     return getPostBookingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.musicmantra.classbooking.addnewrecord.updatereq,
      com.musicmantra.classbooking.addnewrecord.BookingResp> getUpdateBookingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateBooking",
      requestType = com.musicmantra.classbooking.addnewrecord.updatereq.class,
      responseType = com.musicmantra.classbooking.addnewrecord.BookingResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.musicmantra.classbooking.addnewrecord.updatereq,
      com.musicmantra.classbooking.addnewrecord.BookingResp> getUpdateBookingMethod() {
    io.grpc.MethodDescriptor<com.musicmantra.classbooking.addnewrecord.updatereq, com.musicmantra.classbooking.addnewrecord.BookingResp> getUpdateBookingMethod;
    if ((getUpdateBookingMethod = ClassBookingGrpc.getUpdateBookingMethod) == null) {
      synchronized (ClassBookingGrpc.class) {
        if ((getUpdateBookingMethod = ClassBookingGrpc.getUpdateBookingMethod) == null) {
          ClassBookingGrpc.getUpdateBookingMethod = getUpdateBookingMethod = 
              io.grpc.MethodDescriptor.<com.musicmantra.classbooking.addnewrecord.updatereq, com.musicmantra.classbooking.addnewrecord.BookingResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ClassBooking", "updateBooking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.musicmantra.classbooking.addnewrecord.updatereq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.musicmantra.classbooking.addnewrecord.BookingResp.getDefaultInstance()))
                  .setSchemaDescriptor(new ClassBookingMethodDescriptorSupplier("updateBooking"))
                  .build();
          }
        }
     }
     return getUpdateBookingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.musicmantra.classbooking.addnewrecord.deleteBookingReq,
      com.musicmantra.classbooking.addnewrecord.BookingResp> getDeleteBookingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteBooking",
      requestType = com.musicmantra.classbooking.addnewrecord.deleteBookingReq.class,
      responseType = com.musicmantra.classbooking.addnewrecord.BookingResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.musicmantra.classbooking.addnewrecord.deleteBookingReq,
      com.musicmantra.classbooking.addnewrecord.BookingResp> getDeleteBookingMethod() {
    io.grpc.MethodDescriptor<com.musicmantra.classbooking.addnewrecord.deleteBookingReq, com.musicmantra.classbooking.addnewrecord.BookingResp> getDeleteBookingMethod;
    if ((getDeleteBookingMethod = ClassBookingGrpc.getDeleteBookingMethod) == null) {
      synchronized (ClassBookingGrpc.class) {
        if ((getDeleteBookingMethod = ClassBookingGrpc.getDeleteBookingMethod) == null) {
          ClassBookingGrpc.getDeleteBookingMethod = getDeleteBookingMethod = 
              io.grpc.MethodDescriptor.<com.musicmantra.classbooking.addnewrecord.deleteBookingReq, com.musicmantra.classbooking.addnewrecord.BookingResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ClassBooking", "deleteBooking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.musicmantra.classbooking.addnewrecord.deleteBookingReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.musicmantra.classbooking.addnewrecord.BookingResp.getDefaultInstance()))
                  .setSchemaDescriptor(new ClassBookingMethodDescriptorSupplier("deleteBooking"))
                  .build();
          }
        }
     }
     return getDeleteBookingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.musicmantra.classbooking.addnewrecord.multiBookingReq,
      com.musicmantra.classbooking.addnewrecord.multiBookingResp> getGetallstudentbookingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getallstudentbookings",
      requestType = com.musicmantra.classbooking.addnewrecord.multiBookingReq.class,
      responseType = com.musicmantra.classbooking.addnewrecord.multiBookingResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.musicmantra.classbooking.addnewrecord.multiBookingReq,
      com.musicmantra.classbooking.addnewrecord.multiBookingResp> getGetallstudentbookingsMethod() {
    io.grpc.MethodDescriptor<com.musicmantra.classbooking.addnewrecord.multiBookingReq, com.musicmantra.classbooking.addnewrecord.multiBookingResp> getGetallstudentbookingsMethod;
    if ((getGetallstudentbookingsMethod = ClassBookingGrpc.getGetallstudentbookingsMethod) == null) {
      synchronized (ClassBookingGrpc.class) {
        if ((getGetallstudentbookingsMethod = ClassBookingGrpc.getGetallstudentbookingsMethod) == null) {
          ClassBookingGrpc.getGetallstudentbookingsMethod = getGetallstudentbookingsMethod = 
              io.grpc.MethodDescriptor.<com.musicmantra.classbooking.addnewrecord.multiBookingReq, com.musicmantra.classbooking.addnewrecord.multiBookingResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ClassBooking", "getallstudentbookings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.musicmantra.classbooking.addnewrecord.multiBookingReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.musicmantra.classbooking.addnewrecord.multiBookingResp.getDefaultInstance()))
                  .setSchemaDescriptor(new ClassBookingMethodDescriptorSupplier("getallstudentbookings"))
                  .build();
          }
        }
     }
     return getGetallstudentbookingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.musicmantra.classbooking.addnewrecord.multiBookingReq,
      com.musicmantra.classbooking.addnewrecord.multiBookingResp> getGetallsessionbookingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getallsessionbookings",
      requestType = com.musicmantra.classbooking.addnewrecord.multiBookingReq.class,
      responseType = com.musicmantra.classbooking.addnewrecord.multiBookingResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.musicmantra.classbooking.addnewrecord.multiBookingReq,
      com.musicmantra.classbooking.addnewrecord.multiBookingResp> getGetallsessionbookingsMethod() {
    io.grpc.MethodDescriptor<com.musicmantra.classbooking.addnewrecord.multiBookingReq, com.musicmantra.classbooking.addnewrecord.multiBookingResp> getGetallsessionbookingsMethod;
    if ((getGetallsessionbookingsMethod = ClassBookingGrpc.getGetallsessionbookingsMethod) == null) {
      synchronized (ClassBookingGrpc.class) {
        if ((getGetallsessionbookingsMethod = ClassBookingGrpc.getGetallsessionbookingsMethod) == null) {
          ClassBookingGrpc.getGetallsessionbookingsMethod = getGetallsessionbookingsMethod = 
              io.grpc.MethodDescriptor.<com.musicmantra.classbooking.addnewrecord.multiBookingReq, com.musicmantra.classbooking.addnewrecord.multiBookingResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ClassBooking", "getallsessionbookings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.musicmantra.classbooking.addnewrecord.multiBookingReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.musicmantra.classbooking.addnewrecord.multiBookingResp.getDefaultInstance()))
                  .setSchemaDescriptor(new ClassBookingMethodDescriptorSupplier("getallsessionbookings"))
                  .build();
          }
        }
     }
     return getGetallsessionbookingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClassBookingStub newStub(io.grpc.Channel channel) {
    return new ClassBookingStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClassBookingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ClassBookingBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClassBookingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ClassBookingFutureStub(channel);
  }

  /**
   * <pre>
   *defining service class
   * </pre>
   */
  public static abstract class ClassBookingImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *method for inserting a record
     * </pre>
     */
    public void postBooking(com.musicmantra.classbooking.addnewrecord.postBookingReq request,
        io.grpc.stub.StreamObserver<com.musicmantra.classbooking.addnewrecord.BookingResp> responseObserver) {
      asyncUnimplementedUnaryCall(getPostBookingMethod(), responseObserver);
    }

    /**
     */
    public void updateBooking(com.musicmantra.classbooking.addnewrecord.updatereq request,
        io.grpc.stub.StreamObserver<com.musicmantra.classbooking.addnewrecord.BookingResp> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateBookingMethod(), responseObserver);
    }

    /**
     */
    public void deleteBooking(com.musicmantra.classbooking.addnewrecord.deleteBookingReq request,
        io.grpc.stub.StreamObserver<com.musicmantra.classbooking.addnewrecord.BookingResp> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteBookingMethod(), responseObserver);
    }

    /**
     */
    public void getallstudentbookings(com.musicmantra.classbooking.addnewrecord.multiBookingReq request,
        io.grpc.stub.StreamObserver<com.musicmantra.classbooking.addnewrecord.multiBookingResp> responseObserver) {
      asyncUnimplementedUnaryCall(getGetallstudentbookingsMethod(), responseObserver);
    }

    /**
     */
    public void getallsessionbookings(com.musicmantra.classbooking.addnewrecord.multiBookingReq request,
        io.grpc.stub.StreamObserver<com.musicmantra.classbooking.addnewrecord.multiBookingResp> responseObserver) {
      asyncUnimplementedUnaryCall(getGetallsessionbookingsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPostBookingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.musicmantra.classbooking.addnewrecord.postBookingReq,
                com.musicmantra.classbooking.addnewrecord.BookingResp>(
                  this, METHODID_POST_BOOKING)))
          .addMethod(
            getUpdateBookingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.musicmantra.classbooking.addnewrecord.updatereq,
                com.musicmantra.classbooking.addnewrecord.BookingResp>(
                  this, METHODID_UPDATE_BOOKING)))
          .addMethod(
            getDeleteBookingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.musicmantra.classbooking.addnewrecord.deleteBookingReq,
                com.musicmantra.classbooking.addnewrecord.BookingResp>(
                  this, METHODID_DELETE_BOOKING)))
          .addMethod(
            getGetallstudentbookingsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.musicmantra.classbooking.addnewrecord.multiBookingReq,
                com.musicmantra.classbooking.addnewrecord.multiBookingResp>(
                  this, METHODID_GETALLSTUDENTBOOKINGS)))
          .addMethod(
            getGetallsessionbookingsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.musicmantra.classbooking.addnewrecord.multiBookingReq,
                com.musicmantra.classbooking.addnewrecord.multiBookingResp>(
                  this, METHODID_GETALLSESSIONBOOKINGS)))
          .build();
    }
  }

  /**
   * <pre>
   *defining service class
   * </pre>
   */
  public static final class ClassBookingStub extends io.grpc.stub.AbstractStub<ClassBookingStub> {
    private ClassBookingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClassBookingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClassBookingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClassBookingStub(channel, callOptions);
    }

    /**
     * <pre>
     *method for inserting a record
     * </pre>
     */
    public void postBooking(com.musicmantra.classbooking.addnewrecord.postBookingReq request,
        io.grpc.stub.StreamObserver<com.musicmantra.classbooking.addnewrecord.BookingResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostBookingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateBooking(com.musicmantra.classbooking.addnewrecord.updatereq request,
        io.grpc.stub.StreamObserver<com.musicmantra.classbooking.addnewrecord.BookingResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateBookingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteBooking(com.musicmantra.classbooking.addnewrecord.deleteBookingReq request,
        io.grpc.stub.StreamObserver<com.musicmantra.classbooking.addnewrecord.BookingResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteBookingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getallstudentbookings(com.musicmantra.classbooking.addnewrecord.multiBookingReq request,
        io.grpc.stub.StreamObserver<com.musicmantra.classbooking.addnewrecord.multiBookingResp> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetallstudentbookingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getallsessionbookings(com.musicmantra.classbooking.addnewrecord.multiBookingReq request,
        io.grpc.stub.StreamObserver<com.musicmantra.classbooking.addnewrecord.multiBookingResp> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetallsessionbookingsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *defining service class
   * </pre>
   */
  public static final class ClassBookingBlockingStub extends io.grpc.stub.AbstractStub<ClassBookingBlockingStub> {
    private ClassBookingBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClassBookingBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClassBookingBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClassBookingBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *method for inserting a record
     * </pre>
     */
    public com.musicmantra.classbooking.addnewrecord.BookingResp postBooking(com.musicmantra.classbooking.addnewrecord.postBookingReq request) {
      return blockingUnaryCall(
          getChannel(), getPostBookingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.musicmantra.classbooking.addnewrecord.BookingResp updateBooking(com.musicmantra.classbooking.addnewrecord.updatereq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateBookingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.musicmantra.classbooking.addnewrecord.BookingResp deleteBooking(com.musicmantra.classbooking.addnewrecord.deleteBookingReq request) {
      return blockingUnaryCall(
          getChannel(), getDeleteBookingMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.musicmantra.classbooking.addnewrecord.multiBookingResp> getallstudentbookings(
        com.musicmantra.classbooking.addnewrecord.multiBookingReq request) {
      return blockingServerStreamingCall(
          getChannel(), getGetallstudentbookingsMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.musicmantra.classbooking.addnewrecord.multiBookingResp> getallsessionbookings(
        com.musicmantra.classbooking.addnewrecord.multiBookingReq request) {
      return blockingServerStreamingCall(
          getChannel(), getGetallsessionbookingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *defining service class
   * </pre>
   */
  public static final class ClassBookingFutureStub extends io.grpc.stub.AbstractStub<ClassBookingFutureStub> {
    private ClassBookingFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClassBookingFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClassBookingFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClassBookingFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *method for inserting a record
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.musicmantra.classbooking.addnewrecord.BookingResp> postBooking(
        com.musicmantra.classbooking.addnewrecord.postBookingReq request) {
      return futureUnaryCall(
          getChannel().newCall(getPostBookingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.musicmantra.classbooking.addnewrecord.BookingResp> updateBooking(
        com.musicmantra.classbooking.addnewrecord.updatereq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateBookingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.musicmantra.classbooking.addnewrecord.BookingResp> deleteBooking(
        com.musicmantra.classbooking.addnewrecord.deleteBookingReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteBookingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_POST_BOOKING = 0;
  private static final int METHODID_UPDATE_BOOKING = 1;
  private static final int METHODID_DELETE_BOOKING = 2;
  private static final int METHODID_GETALLSTUDENTBOOKINGS = 3;
  private static final int METHODID_GETALLSESSIONBOOKINGS = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ClassBookingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ClassBookingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_POST_BOOKING:
          serviceImpl.postBooking((com.musicmantra.classbooking.addnewrecord.postBookingReq) request,
              (io.grpc.stub.StreamObserver<com.musicmantra.classbooking.addnewrecord.BookingResp>) responseObserver);
          break;
        case METHODID_UPDATE_BOOKING:
          serviceImpl.updateBooking((com.musicmantra.classbooking.addnewrecord.updatereq) request,
              (io.grpc.stub.StreamObserver<com.musicmantra.classbooking.addnewrecord.BookingResp>) responseObserver);
          break;
        case METHODID_DELETE_BOOKING:
          serviceImpl.deleteBooking((com.musicmantra.classbooking.addnewrecord.deleteBookingReq) request,
              (io.grpc.stub.StreamObserver<com.musicmantra.classbooking.addnewrecord.BookingResp>) responseObserver);
          break;
        case METHODID_GETALLSTUDENTBOOKINGS:
          serviceImpl.getallstudentbookings((com.musicmantra.classbooking.addnewrecord.multiBookingReq) request,
              (io.grpc.stub.StreamObserver<com.musicmantra.classbooking.addnewrecord.multiBookingResp>) responseObserver);
          break;
        case METHODID_GETALLSESSIONBOOKINGS:
          serviceImpl.getallsessionbookings((com.musicmantra.classbooking.addnewrecord.multiBookingReq) request,
              (io.grpc.stub.StreamObserver<com.musicmantra.classbooking.addnewrecord.multiBookingResp>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ClassBookingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClassBookingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.musicmantra.classbooking.addnewrecord.BookingMethods.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClassBooking");
    }
  }

  private static final class ClassBookingFileDescriptorSupplier
      extends ClassBookingBaseDescriptorSupplier {
    ClassBookingFileDescriptorSupplier() {}
  }

  private static final class ClassBookingMethodDescriptorSupplier
      extends ClassBookingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ClassBookingMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ClassBookingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClassBookingFileDescriptorSupplier())
              .addMethod(getPostBookingMethod())
              .addMethod(getUpdateBookingMethod())
              .addMethod(getDeleteBookingMethod())
              .addMethod(getGetallstudentbookingsMethod())
              .addMethod(getGetallsessionbookingsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
