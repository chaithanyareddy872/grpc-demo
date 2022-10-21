package com.stackroute.musicmantra.booking;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: BookingMethods.proto")
public final class BookingMethodsGrpc {

  private BookingMethodsGrpc() {}

  public static final String SERVICE_NAME = "BookingMethods";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.stackroute.musicmantra.booking.BookingMethodsOuterClass.getBookingReq,
      com.stackroute.musicmantra.booking.BookingMethodsOuterClass.getBookingResp> getGetBookingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBooking",
      requestType = com.stackroute.musicmantra.booking.BookingMethodsOuterClass.getBookingReq.class,
      responseType = com.stackroute.musicmantra.booking.BookingMethodsOuterClass.getBookingResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.musicmantra.booking.BookingMethodsOuterClass.getBookingReq,
      com.stackroute.musicmantra.booking.BookingMethodsOuterClass.getBookingResp> getGetBookingMethod() {
    io.grpc.MethodDescriptor<com.stackroute.musicmantra.booking.BookingMethodsOuterClass.getBookingReq, com.stackroute.musicmantra.booking.BookingMethodsOuterClass.getBookingResp> getGetBookingMethod;
    if ((getGetBookingMethod = BookingMethodsGrpc.getGetBookingMethod) == null) {
      synchronized (BookingMethodsGrpc.class) {
        if ((getGetBookingMethod = BookingMethodsGrpc.getGetBookingMethod) == null) {
          BookingMethodsGrpc.getGetBookingMethod = getGetBookingMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.musicmantra.booking.BookingMethodsOuterClass.getBookingReq, com.stackroute.musicmantra.booking.BookingMethodsOuterClass.getBookingResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BookingMethods", "getBooking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.musicmantra.booking.BookingMethodsOuterClass.getBookingReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.musicmantra.booking.BookingMethodsOuterClass.getBookingResp.getDefaultInstance()))
                  .setSchemaDescriptor(new BookingMethodsMethodDescriptorSupplier("getBooking"))
                  .build();
          }
        }
     }
     return getGetBookingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookingMethodsStub newStub(io.grpc.Channel channel) {
    return new BookingMethodsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookingMethodsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BookingMethodsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BookingMethodsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BookingMethodsFutureStub(channel);
  }

  /**
   */
  public static abstract class BookingMethodsImplBase implements io.grpc.BindableService {

    /**
     */
    public void getBooking(com.stackroute.musicmantra.booking.BookingMethodsOuterClass.getBookingReq request,
        io.grpc.stub.StreamObserver<com.stackroute.musicmantra.booking.BookingMethodsOuterClass.getBookingResp> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBookingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetBookingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.musicmantra.booking.BookingMethodsOuterClass.getBookingReq,
                com.stackroute.musicmantra.booking.BookingMethodsOuterClass.getBookingResp>(
                  this, METHODID_GET_BOOKING)))
          .build();
    }
  }

  /**
   */
  public static final class BookingMethodsStub extends io.grpc.stub.AbstractStub<BookingMethodsStub> {
    private BookingMethodsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookingMethodsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingMethodsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookingMethodsStub(channel, callOptions);
    }

    /**
     */
    public void getBooking(com.stackroute.musicmantra.booking.BookingMethodsOuterClass.getBookingReq request,
        io.grpc.stub.StreamObserver<com.stackroute.musicmantra.booking.BookingMethodsOuterClass.getBookingResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBookingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BookingMethodsBlockingStub extends io.grpc.stub.AbstractStub<BookingMethodsBlockingStub> {
    private BookingMethodsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookingMethodsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingMethodsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookingMethodsBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.stackroute.musicmantra.booking.BookingMethodsOuterClass.getBookingResp getBooking(com.stackroute.musicmantra.booking.BookingMethodsOuterClass.getBookingReq request) {
      return blockingUnaryCall(
          getChannel(), getGetBookingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BookingMethodsFutureStub extends io.grpc.stub.AbstractStub<BookingMethodsFutureStub> {
    private BookingMethodsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookingMethodsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingMethodsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookingMethodsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.musicmantra.booking.BookingMethodsOuterClass.getBookingResp> getBooking(
        com.stackroute.musicmantra.booking.BookingMethodsOuterClass.getBookingReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBookingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BOOKING = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BookingMethodsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BookingMethodsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BOOKING:
          serviceImpl.getBooking((com.stackroute.musicmantra.booking.BookingMethodsOuterClass.getBookingReq) request,
              (io.grpc.stub.StreamObserver<com.stackroute.musicmantra.booking.BookingMethodsOuterClass.getBookingResp>) responseObserver);
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

  private static abstract class BookingMethodsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BookingMethodsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.stackroute.musicmantra.booking.BookingMethodsOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BookingMethods");
    }
  }

  private static final class BookingMethodsFileDescriptorSupplier
      extends BookingMethodsBaseDescriptorSupplier {
    BookingMethodsFileDescriptorSupplier() {}
  }

  private static final class BookingMethodsMethodDescriptorSupplier
      extends BookingMethodsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BookingMethodsMethodDescriptorSupplier(String methodName) {
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
      synchronized (BookingMethodsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BookingMethodsFileDescriptorSupplier())
              .addMethod(getGetBookingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
