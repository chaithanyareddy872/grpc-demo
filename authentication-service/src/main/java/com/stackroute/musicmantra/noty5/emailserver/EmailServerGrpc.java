package com.stackroute.musicmantra.noty5.emailserver;

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
    comments = "Source: EmailService.proto")
public final class EmailServerGrpc {

  private EmailServerGrpc() {}

  public static final String SERVICE_NAME = "EmailServer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.stackroute.musicmantra.noty5.emailserver.mailRequest,
      com.stackroute.musicmantra.noty5.emailserver.apiResponse> getSendOTPMailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendOTPMail",
      requestType = com.stackroute.musicmantra.noty5.emailserver.mailRequest.class,
      responseType = com.stackroute.musicmantra.noty5.emailserver.apiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.musicmantra.noty5.emailserver.mailRequest,
      com.stackroute.musicmantra.noty5.emailserver.apiResponse> getSendOTPMailMethod() {
    io.grpc.MethodDescriptor<com.stackroute.musicmantra.noty5.emailserver.mailRequest, com.stackroute.musicmantra.noty5.emailserver.apiResponse> getSendOTPMailMethod;
    if ((getSendOTPMailMethod = EmailServerGrpc.getSendOTPMailMethod) == null) {
      synchronized (EmailServerGrpc.class) {
        if ((getSendOTPMailMethod = EmailServerGrpc.getSendOTPMailMethod) == null) {
          EmailServerGrpc.getSendOTPMailMethod = getSendOTPMailMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.musicmantra.noty5.emailserver.mailRequest, com.stackroute.musicmantra.noty5.emailserver.apiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EmailServer", "sendOTPMail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.musicmantra.noty5.emailserver.mailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.musicmantra.noty5.emailserver.apiResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmailServerMethodDescriptorSupplier("sendOTPMail"))
                  .build();
          }
        }
     }
     return getSendOTPMailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stackroute.musicmantra.noty5.emailserver.bookingDetails,
      com.stackroute.musicmantra.noty5.emailserver.bookingmailResponse> getBookingNotificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "bookingNotification",
      requestType = com.stackroute.musicmantra.noty5.emailserver.bookingDetails.class,
      responseType = com.stackroute.musicmantra.noty5.emailserver.bookingmailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.musicmantra.noty5.emailserver.bookingDetails,
      com.stackroute.musicmantra.noty5.emailserver.bookingmailResponse> getBookingNotificationMethod() {
    io.grpc.MethodDescriptor<com.stackroute.musicmantra.noty5.emailserver.bookingDetails, com.stackroute.musicmantra.noty5.emailserver.bookingmailResponse> getBookingNotificationMethod;
    if ((getBookingNotificationMethod = EmailServerGrpc.getBookingNotificationMethod) == null) {
      synchronized (EmailServerGrpc.class) {
        if ((getBookingNotificationMethod = EmailServerGrpc.getBookingNotificationMethod) == null) {
          EmailServerGrpc.getBookingNotificationMethod = getBookingNotificationMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.musicmantra.noty5.emailserver.bookingDetails, com.stackroute.musicmantra.noty5.emailserver.bookingmailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EmailServer", "bookingNotification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.musicmantra.noty5.emailserver.bookingDetails.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.musicmantra.noty5.emailserver.bookingmailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmailServerMethodDescriptorSupplier("bookingNotification"))
                  .build();
          }
        }
     }
     return getBookingNotificationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmailServerStub newStub(io.grpc.Channel channel) {
    return new EmailServerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmailServerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EmailServerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmailServerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EmailServerFutureStub(channel);
  }

  /**
   */
  public static abstract class EmailServerImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendOTPMail(com.stackroute.musicmantra.noty5.emailserver.mailRequest request,
        io.grpc.stub.StreamObserver<com.stackroute.musicmantra.noty5.emailserver.apiResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendOTPMailMethod(), responseObserver);
    }

    /**
     */
    public void bookingNotification(com.stackroute.musicmantra.noty5.emailserver.bookingDetails request,
        io.grpc.stub.StreamObserver<com.stackroute.musicmantra.noty5.emailserver.bookingmailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBookingNotificationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendOTPMailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.musicmantra.noty5.emailserver.mailRequest,
                com.stackroute.musicmantra.noty5.emailserver.apiResponse>(
                  this, METHODID_SEND_OTPMAIL)))
          .addMethod(
            getBookingNotificationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.musicmantra.noty5.emailserver.bookingDetails,
                com.stackroute.musicmantra.noty5.emailserver.bookingmailResponse>(
                  this, METHODID_BOOKING_NOTIFICATION)))
          .build();
    }
  }

  /**
   */
  public static final class EmailServerStub extends io.grpc.stub.AbstractStub<EmailServerStub> {
    private EmailServerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmailServerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmailServerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmailServerStub(channel, callOptions);
    }

    /**
     */
    public void sendOTPMail(com.stackroute.musicmantra.noty5.emailserver.mailRequest request,
        io.grpc.stub.StreamObserver<com.stackroute.musicmantra.noty5.emailserver.apiResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendOTPMailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void bookingNotification(com.stackroute.musicmantra.noty5.emailserver.bookingDetails request,
        io.grpc.stub.StreamObserver<com.stackroute.musicmantra.noty5.emailserver.bookingmailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBookingNotificationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EmailServerBlockingStub extends io.grpc.stub.AbstractStub<EmailServerBlockingStub> {
    private EmailServerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmailServerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmailServerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmailServerBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.stackroute.musicmantra.noty5.emailserver.apiResponse sendOTPMail(com.stackroute.musicmantra.noty5.emailserver.mailRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendOTPMailMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stackroute.musicmantra.noty5.emailserver.bookingmailResponse bookingNotification(com.stackroute.musicmantra.noty5.emailserver.bookingDetails request) {
      return blockingUnaryCall(
          getChannel(), getBookingNotificationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EmailServerFutureStub extends io.grpc.stub.AbstractStub<EmailServerFutureStub> {
    private EmailServerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmailServerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmailServerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmailServerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.musicmantra.noty5.emailserver.apiResponse> sendOTPMail(
        com.stackroute.musicmantra.noty5.emailserver.mailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendOTPMailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.musicmantra.noty5.emailserver.bookingmailResponse> bookingNotification(
        com.stackroute.musicmantra.noty5.emailserver.bookingDetails request) {
      return futureUnaryCall(
          getChannel().newCall(getBookingNotificationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_OTPMAIL = 0;
  private static final int METHODID_BOOKING_NOTIFICATION = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EmailServerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EmailServerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_OTPMAIL:
          serviceImpl.sendOTPMail((com.stackroute.musicmantra.noty5.emailserver.mailRequest) request,
              (io.grpc.stub.StreamObserver<com.stackroute.musicmantra.noty5.emailserver.apiResponse>) responseObserver);
          break;
        case METHODID_BOOKING_NOTIFICATION:
          serviceImpl.bookingNotification((com.stackroute.musicmantra.noty5.emailserver.bookingDetails) request,
              (io.grpc.stub.StreamObserver<com.stackroute.musicmantra.noty5.emailserver.bookingmailResponse>) responseObserver);
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

  private static abstract class EmailServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmailServerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.stackroute.musicmantra.noty5.emailserver.EmailService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmailServer");
    }
  }

  private static final class EmailServerFileDescriptorSupplier
      extends EmailServerBaseDescriptorSupplier {
    EmailServerFileDescriptorSupplier() {}
  }

  private static final class EmailServerMethodDescriptorSupplier
      extends EmailServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EmailServerMethodDescriptorSupplier(String methodName) {
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
      synchronized (EmailServerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmailServerFileDescriptorSupplier())
              .addMethod(getSendOTPMailMethod())
              .addMethod(getBookingNotificationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
