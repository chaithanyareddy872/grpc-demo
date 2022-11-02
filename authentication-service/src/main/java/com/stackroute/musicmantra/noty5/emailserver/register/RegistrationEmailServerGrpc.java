package com.stackroute.musicmantra.noty5.emailserver.register;

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
    comments = "Source: registration_forgotPassword.proto")
public final class RegistrationEmailServerGrpc {

  private RegistrationEmailServerGrpc() {}

  public static final String SERVICE_NAME = "RegistrationEmailServer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.stackroute.musicmantra.noty5.emailserver.register.mailRequest,
      com.stackroute.musicmantra.noty5.emailserver.register.OTPapiResponse> getSendResetPasswordOTPMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendResetPasswordOTP",
      requestType = com.stackroute.musicmantra.noty5.emailserver.register.mailRequest.class,
      responseType = com.stackroute.musicmantra.noty5.emailserver.register.OTPapiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.musicmantra.noty5.emailserver.register.mailRequest,
      com.stackroute.musicmantra.noty5.emailserver.register.OTPapiResponse> getSendResetPasswordOTPMethod() {
    io.grpc.MethodDescriptor<com.stackroute.musicmantra.noty5.emailserver.register.mailRequest, com.stackroute.musicmantra.noty5.emailserver.register.OTPapiResponse> getSendResetPasswordOTPMethod;
    if ((getSendResetPasswordOTPMethod = RegistrationEmailServerGrpc.getSendResetPasswordOTPMethod) == null) {
      synchronized (RegistrationEmailServerGrpc.class) {
        if ((getSendResetPasswordOTPMethod = RegistrationEmailServerGrpc.getSendResetPasswordOTPMethod) == null) {
          RegistrationEmailServerGrpc.getSendResetPasswordOTPMethod = getSendResetPasswordOTPMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.musicmantra.noty5.emailserver.register.mailRequest, com.stackroute.musicmantra.noty5.emailserver.register.OTPapiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RegistrationEmailServer", "sendResetPasswordOTP"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.musicmantra.noty5.emailserver.register.mailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.musicmantra.noty5.emailserver.register.OTPapiResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RegistrationEmailServerMethodDescriptorSupplier("sendResetPasswordOTP"))
                  .build();
          }
        }
     }
     return getSendResetPasswordOTPMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stackroute.musicmantra.noty5.emailserver.register.mailRequest,
      com.stackroute.musicmantra.noty5.emailserver.register.OTPapiResponse> getSendRegistrationOTPMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendRegistrationOTP",
      requestType = com.stackroute.musicmantra.noty5.emailserver.register.mailRequest.class,
      responseType = com.stackroute.musicmantra.noty5.emailserver.register.OTPapiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.musicmantra.noty5.emailserver.register.mailRequest,
      com.stackroute.musicmantra.noty5.emailserver.register.OTPapiResponse> getSendRegistrationOTPMethod() {
    io.grpc.MethodDescriptor<com.stackroute.musicmantra.noty5.emailserver.register.mailRequest, com.stackroute.musicmantra.noty5.emailserver.register.OTPapiResponse> getSendRegistrationOTPMethod;
    if ((getSendRegistrationOTPMethod = RegistrationEmailServerGrpc.getSendRegistrationOTPMethod) == null) {
      synchronized (RegistrationEmailServerGrpc.class) {
        if ((getSendRegistrationOTPMethod = RegistrationEmailServerGrpc.getSendRegistrationOTPMethod) == null) {
          RegistrationEmailServerGrpc.getSendRegistrationOTPMethod = getSendRegistrationOTPMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.musicmantra.noty5.emailserver.register.mailRequest, com.stackroute.musicmantra.noty5.emailserver.register.OTPapiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RegistrationEmailServer", "sendRegistrationOTP"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.musicmantra.noty5.emailserver.register.mailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.musicmantra.noty5.emailserver.register.OTPapiResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RegistrationEmailServerMethodDescriptorSupplier("sendRegistrationOTP"))
                  .build();
          }
        }
     }
     return getSendRegistrationOTPMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stackroute.musicmantra.noty5.emailserver.register.mailRequest,
      com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse> getSendregistedMailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendregistedMail",
      requestType = com.stackroute.musicmantra.noty5.emailserver.register.mailRequest.class,
      responseType = com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.musicmantra.noty5.emailserver.register.mailRequest,
      com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse> getSendregistedMailMethod() {
    io.grpc.MethodDescriptor<com.stackroute.musicmantra.noty5.emailserver.register.mailRequest, com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse> getSendregistedMailMethod;
    if ((getSendregistedMailMethod = RegistrationEmailServerGrpc.getSendregistedMailMethod) == null) {
      synchronized (RegistrationEmailServerGrpc.class) {
        if ((getSendregistedMailMethod = RegistrationEmailServerGrpc.getSendregistedMailMethod) == null) {
          RegistrationEmailServerGrpc.getSendregistedMailMethod = getSendregistedMailMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.musicmantra.noty5.emailserver.register.mailRequest, com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RegistrationEmailServer", "sendregistedMail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.musicmantra.noty5.emailserver.register.mailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RegistrationEmailServerMethodDescriptorSupplier("sendregistedMail"))
                  .build();
          }
        }
     }
     return getSendregistedMailMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RegistrationEmailServerStub newStub(io.grpc.Channel channel) {
    return new RegistrationEmailServerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RegistrationEmailServerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RegistrationEmailServerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RegistrationEmailServerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RegistrationEmailServerFutureStub(channel);
  }

  /**
   */
  public static abstract class RegistrationEmailServerImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendResetPasswordOTP(com.stackroute.musicmantra.noty5.emailserver.register.mailRequest request,
        io.grpc.stub.StreamObserver<com.stackroute.musicmantra.noty5.emailserver.register.OTPapiResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendResetPasswordOTPMethod(), responseObserver);
    }

    /**
     */
    public void sendRegistrationOTP(com.stackroute.musicmantra.noty5.emailserver.register.mailRequest request,
        io.grpc.stub.StreamObserver<com.stackroute.musicmantra.noty5.emailserver.register.OTPapiResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendRegistrationOTPMethod(), responseObserver);
    }

    /**
     */
    public void sendregistedMail(com.stackroute.musicmantra.noty5.emailserver.register.mailRequest request,
        io.grpc.stub.StreamObserver<com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendregistedMailMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendResetPasswordOTPMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.musicmantra.noty5.emailserver.register.mailRequest,
                com.stackroute.musicmantra.noty5.emailserver.register.OTPapiResponse>(
                  this, METHODID_SEND_RESET_PASSWORD_OTP)))
          .addMethod(
            getSendRegistrationOTPMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.musicmantra.noty5.emailserver.register.mailRequest,
                com.stackroute.musicmantra.noty5.emailserver.register.OTPapiResponse>(
                  this, METHODID_SEND_REGISTRATION_OTP)))
          .addMethod(
            getSendregistedMailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.musicmantra.noty5.emailserver.register.mailRequest,
                com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse>(
                  this, METHODID_SENDREGISTED_MAIL)))
          .build();
    }
  }

  /**
   */
  public static final class RegistrationEmailServerStub extends io.grpc.stub.AbstractStub<RegistrationEmailServerStub> {
    private RegistrationEmailServerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RegistrationEmailServerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegistrationEmailServerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RegistrationEmailServerStub(channel, callOptions);
    }

    /**
     */
    public void sendResetPasswordOTP(com.stackroute.musicmantra.noty5.emailserver.register.mailRequest request,
        io.grpc.stub.StreamObserver<com.stackroute.musicmantra.noty5.emailserver.register.OTPapiResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendResetPasswordOTPMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendRegistrationOTP(com.stackroute.musicmantra.noty5.emailserver.register.mailRequest request,
        io.grpc.stub.StreamObserver<com.stackroute.musicmantra.noty5.emailserver.register.OTPapiResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendRegistrationOTPMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendregistedMail(com.stackroute.musicmantra.noty5.emailserver.register.mailRequest request,
        io.grpc.stub.StreamObserver<com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendregistedMailMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RegistrationEmailServerBlockingStub extends io.grpc.stub.AbstractStub<RegistrationEmailServerBlockingStub> {
    private RegistrationEmailServerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RegistrationEmailServerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegistrationEmailServerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RegistrationEmailServerBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.stackroute.musicmantra.noty5.emailserver.register.OTPapiResponse sendResetPasswordOTP(com.stackroute.musicmantra.noty5.emailserver.register.mailRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendResetPasswordOTPMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stackroute.musicmantra.noty5.emailserver.register.OTPapiResponse sendRegistrationOTP(com.stackroute.musicmantra.noty5.emailserver.register.mailRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendRegistrationOTPMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse sendregistedMail(com.stackroute.musicmantra.noty5.emailserver.register.mailRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendregistedMailMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RegistrationEmailServerFutureStub extends io.grpc.stub.AbstractStub<RegistrationEmailServerFutureStub> {
    private RegistrationEmailServerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RegistrationEmailServerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegistrationEmailServerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RegistrationEmailServerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.musicmantra.noty5.emailserver.register.OTPapiResponse> sendResetPasswordOTP(
        com.stackroute.musicmantra.noty5.emailserver.register.mailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendResetPasswordOTPMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.musicmantra.noty5.emailserver.register.OTPapiResponse> sendRegistrationOTP(
        com.stackroute.musicmantra.noty5.emailserver.register.mailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendRegistrationOTPMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse> sendregistedMail(
        com.stackroute.musicmantra.noty5.emailserver.register.mailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendregistedMailMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_RESET_PASSWORD_OTP = 0;
  private static final int METHODID_SEND_REGISTRATION_OTP = 1;
  private static final int METHODID_SENDREGISTED_MAIL = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RegistrationEmailServerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RegistrationEmailServerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_RESET_PASSWORD_OTP:
          serviceImpl.sendResetPasswordOTP((com.stackroute.musicmantra.noty5.emailserver.register.mailRequest) request,
              (io.grpc.stub.StreamObserver<com.stackroute.musicmantra.noty5.emailserver.register.OTPapiResponse>) responseObserver);
          break;
        case METHODID_SEND_REGISTRATION_OTP:
          serviceImpl.sendRegistrationOTP((com.stackroute.musicmantra.noty5.emailserver.register.mailRequest) request,
              (io.grpc.stub.StreamObserver<com.stackroute.musicmantra.noty5.emailserver.register.OTPapiResponse>) responseObserver);
          break;
        case METHODID_SENDREGISTED_MAIL:
          serviceImpl.sendregistedMail((com.stackroute.musicmantra.noty5.emailserver.register.mailRequest) request,
              (io.grpc.stub.StreamObserver<com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse>) responseObserver);
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

  private static abstract class RegistrationEmailServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RegistrationEmailServerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.stackroute.musicmantra.noty5.emailserver.register.RegistrationForgotPassword.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RegistrationEmailServer");
    }
  }

  private static final class RegistrationEmailServerFileDescriptorSupplier
      extends RegistrationEmailServerBaseDescriptorSupplier {
    RegistrationEmailServerFileDescriptorSupplier() {}
  }

  private static final class RegistrationEmailServerMethodDescriptorSupplier
      extends RegistrationEmailServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RegistrationEmailServerMethodDescriptorSupplier(String methodName) {
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
      synchronized (RegistrationEmailServerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RegistrationEmailServerFileDescriptorSupplier())
              .addMethod(getSendResetPasswordOTPMethod())
              .addMethod(getSendRegistrationOTPMethod())
              .addMethod(getSendregistedMailMethod())
              .build();
        }
      }
    }
    return result;
  }
}
