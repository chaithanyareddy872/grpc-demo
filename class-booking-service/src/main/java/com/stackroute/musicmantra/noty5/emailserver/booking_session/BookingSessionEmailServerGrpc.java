package com.stackroute.musicmantra.noty5.emailserver.booking_session;

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
    comments = "Source: booking_session.proto")
public final class BookingSessionEmailServerGrpc {

  private BookingSessionEmailServerGrpc() {}

  public static final String SERVICE_NAME = "BookingSessionEmailServer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails,
      com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingResponse> getBookingNotificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "bookingNotification",
      requestType = com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails.class,
      responseType = com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails,
      com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingResponse> getBookingNotificationMethod() {
    io.grpc.MethodDescriptor<com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails, com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingResponse> getBookingNotificationMethod;
    if ((getBookingNotificationMethod = BookingSessionEmailServerGrpc.getBookingNotificationMethod) == null) {
      synchronized (BookingSessionEmailServerGrpc.class) {
        if ((getBookingNotificationMethod = BookingSessionEmailServerGrpc.getBookingNotificationMethod) == null) {
          BookingSessionEmailServerGrpc.getBookingNotificationMethod = getBookingNotificationMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails, com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BookingSessionEmailServer", "bookingNotification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BookingSessionEmailServerMethodDescriptorSupplier("bookingNotification"))
                  .build();
          }
        }
     }
     return getBookingNotificationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookingSessionEmailServerStub newStub(io.grpc.Channel channel) {
    return new BookingSessionEmailServerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookingSessionEmailServerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BookingSessionEmailServerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BookingSessionEmailServerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BookingSessionEmailServerFutureStub(channel);
  }

  /**
   */
  public static abstract class BookingSessionEmailServerImplBase implements io.grpc.BindableService {

    /**
     */
    public void bookingNotification(com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails request,
        io.grpc.stub.StreamObserver<com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBookingNotificationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBookingNotificationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails,
                com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingResponse>(
                  this, METHODID_BOOKING_NOTIFICATION)))
          .build();
    }
  }

  /**
   */
  public static final class BookingSessionEmailServerStub extends io.grpc.stub.AbstractStub<BookingSessionEmailServerStub> {
    private BookingSessionEmailServerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookingSessionEmailServerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingSessionEmailServerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookingSessionEmailServerStub(channel, callOptions);
    }

    /**
     */
    public void bookingNotification(com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails request,
        io.grpc.stub.StreamObserver<com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBookingNotificationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BookingSessionEmailServerBlockingStub extends io.grpc.stub.AbstractStub<BookingSessionEmailServerBlockingStub> {
    private BookingSessionEmailServerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookingSessionEmailServerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingSessionEmailServerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookingSessionEmailServerBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingResponse bookingNotification(com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails request) {
      return blockingUnaryCall(
          getChannel(), getBookingNotificationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BookingSessionEmailServerFutureStub extends io.grpc.stub.AbstractStub<BookingSessionEmailServerFutureStub> {
    private BookingSessionEmailServerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookingSessionEmailServerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingSessionEmailServerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookingSessionEmailServerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingResponse> bookingNotification(
        com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails request) {
      return futureUnaryCall(
          getChannel().newCall(getBookingNotificationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BOOKING_NOTIFICATION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BookingSessionEmailServerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BookingSessionEmailServerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BOOKING_NOTIFICATION:
          serviceImpl.bookingNotification((com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails) request,
              (io.grpc.stub.StreamObserver<com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingResponse>) responseObserver);
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

  private static abstract class BookingSessionEmailServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BookingSessionEmailServerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.stackroute.musicmantra.noty5.emailserver.booking_session.BookingSession.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BookingSessionEmailServer");
    }
  }

  private static final class BookingSessionEmailServerFileDescriptorSupplier
      extends BookingSessionEmailServerBaseDescriptorSupplier {
    BookingSessionEmailServerFileDescriptorSupplier() {}
  }

  private static final class BookingSessionEmailServerMethodDescriptorSupplier
      extends BookingSessionEmailServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BookingSessionEmailServerMethodDescriptorSupplier(String methodName) {
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
      synchronized (BookingSessionEmailServerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BookingSessionEmailServerFileDescriptorSupplier())
              .addMethod(getBookingNotificationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
