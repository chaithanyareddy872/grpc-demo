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
  private static volatile io.grpc.MethodDescriptor<mailRequestforExistingUser,
      apiResponse> getSendOTPtoExistingUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendOTPtoExistingUser",
      requestType = mailRequestforExistingUser.class,
      responseType = apiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mailRequestforExistingUser,
      apiResponse> getSendOTPtoExistingUserMethod() {
    io.grpc.MethodDescriptor<mailRequestforExistingUser, apiResponse> getSendOTPtoExistingUserMethod;
    if ((getSendOTPtoExistingUserMethod = EmailServerGrpc.getSendOTPtoExistingUserMethod) == null) {
      synchronized (EmailServerGrpc.class) {
        if ((getSendOTPtoExistingUserMethod = EmailServerGrpc.getSendOTPtoExistingUserMethod) == null) {
          EmailServerGrpc.getSendOTPtoExistingUserMethod = getSendOTPtoExistingUserMethod = 
              io.grpc.MethodDescriptor.<mailRequestforExistingUser, apiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EmailServer", "sendOTPtoExistingUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mailRequestforExistingUser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  apiResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmailServerMethodDescriptorSupplier("sendOTPtoExistingUser"))
                  .build();
          }
        }
     }
     return getSendOTPtoExistingUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mailRequesttoregister,
      apiResponse> getSendOTPTONewUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendOTPTONewUser",
      requestType = mailRequesttoregister.class,
      responseType = apiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mailRequesttoregister,
      apiResponse> getSendOTPTONewUserMethod() {
    io.grpc.MethodDescriptor<mailRequesttoregister, apiResponse> getSendOTPTONewUserMethod;
    if ((getSendOTPTONewUserMethod = EmailServerGrpc.getSendOTPTONewUserMethod) == null) {
      synchronized (EmailServerGrpc.class) {
        if ((getSendOTPTONewUserMethod = EmailServerGrpc.getSendOTPTONewUserMethod) == null) {
          EmailServerGrpc.getSendOTPTONewUserMethod = getSendOTPTONewUserMethod = 
              io.grpc.MethodDescriptor.<mailRequesttoregister, apiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EmailServer", "sendOTPTONewUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mailRequesttoregister.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  apiResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmailServerMethodDescriptorSupplier("sendOTPTONewUser"))
                  .build();
          }
        }
     }
     return getSendOTPTONewUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bookingDetails,
      sentmailResponse> getBookingNotificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "bookingNotification",
      requestType = bookingDetails.class,
      responseType = sentmailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bookingDetails,
      sentmailResponse> getBookingNotificationMethod() {
    io.grpc.MethodDescriptor<bookingDetails, sentmailResponse> getBookingNotificationMethod;
    if ((getBookingNotificationMethod = EmailServerGrpc.getBookingNotificationMethod) == null) {
      synchronized (EmailServerGrpc.class) {
        if ((getBookingNotificationMethod = EmailServerGrpc.getBookingNotificationMethod) == null) {
          EmailServerGrpc.getBookingNotificationMethod = getBookingNotificationMethod = 
              io.grpc.MethodDescriptor.<bookingDetails, sentmailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EmailServer", "bookingNotification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bookingDetails.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sentmailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmailServerMethodDescriptorSupplier("bookingNotification"))
                  .build();
          }
        }
     }
     return getBookingNotificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mailRequesttoregister,
      sentmailResponse> getSendregistrationMailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendregistrationMail",
      requestType = mailRequesttoregister.class,
      responseType = sentmailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mailRequesttoregister,
      sentmailResponse> getSendregistrationMailMethod() {
    io.grpc.MethodDescriptor<mailRequesttoregister, sentmailResponse> getSendregistrationMailMethod;
    if ((getSendregistrationMailMethod = EmailServerGrpc.getSendregistrationMailMethod) == null) {
      synchronized (EmailServerGrpc.class) {
        if ((getSendregistrationMailMethod = EmailServerGrpc.getSendregistrationMailMethod) == null) {
          EmailServerGrpc.getSendregistrationMailMethod = getSendregistrationMailMethod = 
              io.grpc.MethodDescriptor.<mailRequesttoregister, sentmailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EmailServer", "sendregistrationMail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mailRequesttoregister.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sentmailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmailServerMethodDescriptorSupplier("sendregistrationMail"))
                  .build();
          }
        }
     }
     return getSendregistrationMailMethod;
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
    public void sendOTPtoExistingUser(mailRequestforExistingUser request,
                                      io.grpc.stub.StreamObserver<apiResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendOTPtoExistingUserMethod(), responseObserver);
    }

    /**
     */
    public void sendOTPTONewUser(mailRequesttoregister request,
                                 io.grpc.stub.StreamObserver<apiResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendOTPTONewUserMethod(), responseObserver);
    }

    /**
     */
    public void bookingNotification(bookingDetails request,
                                    io.grpc.stub.StreamObserver<sentmailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBookingNotificationMethod(), responseObserver);
    }

    /**
     */
    public void sendregistrationMail(mailRequesttoregister request,
                                     io.grpc.stub.StreamObserver<sentmailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendregistrationMailMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendOTPtoExistingUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mailRequestforExistingUser,
                apiResponse>(
                  this, METHODID_SEND_OTPTO_EXISTING_USER)))
          .addMethod(
            getSendOTPTONewUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mailRequesttoregister,
                apiResponse>(
                  this, METHODID_SEND_OTPTONEW_USER)))
          .addMethod(
            getBookingNotificationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                bookingDetails,
                sentmailResponse>(
                  this, METHODID_BOOKING_NOTIFICATION)))
          .addMethod(
            getSendregistrationMailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mailRequesttoregister,
                sentmailResponse>(
                  this, METHODID_SENDREGISTRATION_MAIL)))
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

    @Override
    protected EmailServerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmailServerStub(channel, callOptions);
    }

    /**
     */
    public void sendOTPtoExistingUser(mailRequestforExistingUser request,
                                      io.grpc.stub.StreamObserver<apiResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendOTPtoExistingUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendOTPTONewUser(mailRequesttoregister request,
                                 io.grpc.stub.StreamObserver<apiResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendOTPTONewUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void bookingNotification(bookingDetails request,
                                    io.grpc.stub.StreamObserver<sentmailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBookingNotificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendregistrationMail(mailRequesttoregister request,
                                     io.grpc.stub.StreamObserver<sentmailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendregistrationMailMethod(), getCallOptions()), request, responseObserver);
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

    @Override
    protected EmailServerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmailServerBlockingStub(channel, callOptions);
    }

    /**
     */
    public apiResponse sendOTPtoExistingUser(mailRequestforExistingUser request) {
      return blockingUnaryCall(
          getChannel(), getSendOTPtoExistingUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public apiResponse sendOTPTONewUser(mailRequesttoregister request) {
      return blockingUnaryCall(
          getChannel(), getSendOTPTONewUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public sentmailResponse bookingNotification(bookingDetails request) {
      return blockingUnaryCall(
          getChannel(), getBookingNotificationMethod(), getCallOptions(), request);
    }

    /**
     */
    public sentmailResponse sendregistrationMail(mailRequesttoregister request) {
      return blockingUnaryCall(
          getChannel(), getSendregistrationMailMethod(), getCallOptions(), request);
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

    @Override
    protected EmailServerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmailServerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<apiResponse> sendOTPtoExistingUser(
        mailRequestforExistingUser request) {
      return futureUnaryCall(
          getChannel().newCall(getSendOTPtoExistingUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<apiResponse> sendOTPTONewUser(
        mailRequesttoregister request) {
      return futureUnaryCall(
          getChannel().newCall(getSendOTPTONewUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sentmailResponse> bookingNotification(
        bookingDetails request) {
      return futureUnaryCall(
          getChannel().newCall(getBookingNotificationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sentmailResponse> sendregistrationMail(
        mailRequesttoregister request) {
      return futureUnaryCall(
          getChannel().newCall(getSendregistrationMailMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_OTPTO_EXISTING_USER = 0;
  private static final int METHODID_SEND_OTPTONEW_USER = 1;
  private static final int METHODID_BOOKING_NOTIFICATION = 2;
  private static final int METHODID_SENDREGISTRATION_MAIL = 3;

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

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_OTPTO_EXISTING_USER:
          serviceImpl.sendOTPtoExistingUser((mailRequestforExistingUser) request,
              (io.grpc.stub.StreamObserver<apiResponse>) responseObserver);
          break;
        case METHODID_SEND_OTPTONEW_USER:
          serviceImpl.sendOTPTONewUser((mailRequesttoregister) request,
              (io.grpc.stub.StreamObserver<apiResponse>) responseObserver);
          break;
        case METHODID_BOOKING_NOTIFICATION:
          serviceImpl.bookingNotification((bookingDetails) request,
              (io.grpc.stub.StreamObserver<sentmailResponse>) responseObserver);
          break;
        case METHODID_SENDREGISTRATION_MAIL:
          serviceImpl.sendregistrationMail((mailRequesttoregister) request,
              (io.grpc.stub.StreamObserver<sentmailResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
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

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return EmailService.getDescriptor();
    }

    @Override
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

    @Override
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
              .addMethod(getSendOTPtoExistingUserMethod())
              .addMethod(getSendOTPTONewUserMethod())
              .addMethod(getBookingNotificationMethod())
              .addMethod(getSendregistrationMailMethod())
              .build();
        }
      }
    }
    return result;
  }
}
