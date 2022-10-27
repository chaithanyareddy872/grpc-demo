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
  private static volatile io.grpc.MethodDescriptor<com.stackroute.musicmantra.noty5.emailserver.register.mailRequestforExistingUser,
      com.stackroute.musicmantra.noty5.emailserver.register.apiResponse> getSendOTPtoExistingUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendOTPtoExistingUser",
      requestType = com.stackroute.musicmantra.noty5.emailserver.register.mailRequestforExistingUser.class,
      responseType = com.stackroute.musicmantra.noty5.emailserver.register.apiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.musicmantra.noty5.emailserver.register.mailRequestforExistingUser,
      com.stackroute.musicmantra.noty5.emailserver.register.apiResponse> getSendOTPtoExistingUserMethod() {
    io.grpc.MethodDescriptor<com.stackroute.musicmantra.noty5.emailserver.register.mailRequestforExistingUser, com.stackroute.musicmantra.noty5.emailserver.register.apiResponse> getSendOTPtoExistingUserMethod;
    if ((getSendOTPtoExistingUserMethod = RegistrationEmailServerGrpc.getSendOTPtoExistingUserMethod) == null) {
      synchronized (RegistrationEmailServerGrpc.class) {
        if ((getSendOTPtoExistingUserMethod = RegistrationEmailServerGrpc.getSendOTPtoExistingUserMethod) == null) {
          RegistrationEmailServerGrpc.getSendOTPtoExistingUserMethod = getSendOTPtoExistingUserMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.musicmantra.noty5.emailserver.register.mailRequestforExistingUser, com.stackroute.musicmantra.noty5.emailserver.register.apiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RegistrationEmailServer", "sendOTPtoExistingUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.musicmantra.noty5.emailserver.register.mailRequestforExistingUser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.musicmantra.noty5.emailserver.register.apiResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RegistrationEmailServerMethodDescriptorSupplier("sendOTPtoExistingUser"))
                  .build();
          }
        }
     }
     return getSendOTPtoExistingUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister,
      com.stackroute.musicmantra.noty5.emailserver.register.apiResponse> getSendOTPTONewUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendOTPTONewUser",
      requestType = com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister.class,
      responseType = com.stackroute.musicmantra.noty5.emailserver.register.apiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister,
      com.stackroute.musicmantra.noty5.emailserver.register.apiResponse> getSendOTPTONewUserMethod() {
    io.grpc.MethodDescriptor<com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister, com.stackroute.musicmantra.noty5.emailserver.register.apiResponse> getSendOTPTONewUserMethod;
    if ((getSendOTPTONewUserMethod = RegistrationEmailServerGrpc.getSendOTPTONewUserMethod) == null) {
      synchronized (RegistrationEmailServerGrpc.class) {
        if ((getSendOTPTONewUserMethod = RegistrationEmailServerGrpc.getSendOTPTONewUserMethod) == null) {
          RegistrationEmailServerGrpc.getSendOTPTONewUserMethod = getSendOTPTONewUserMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister, com.stackroute.musicmantra.noty5.emailserver.register.apiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RegistrationEmailServer", "sendOTPTONewUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.musicmantra.noty5.emailserver.register.apiResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RegistrationEmailServerMethodDescriptorSupplier("sendOTPTONewUser"))
                  .build();
          }
        }
     }
     return getSendOTPTONewUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister,
      com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse> getSendregistrationMailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendregistrationMail",
      requestType = com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister.class,
      responseType = com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister,
      com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse> getSendregistrationMailMethod() {
    io.grpc.MethodDescriptor<com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister, com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse> getSendregistrationMailMethod;
    if ((getSendregistrationMailMethod = RegistrationEmailServerGrpc.getSendregistrationMailMethod) == null) {
      synchronized (RegistrationEmailServerGrpc.class) {
        if ((getSendregistrationMailMethod = RegistrationEmailServerGrpc.getSendregistrationMailMethod) == null) {
          RegistrationEmailServerGrpc.getSendregistrationMailMethod = getSendregistrationMailMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister, com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RegistrationEmailServer", "sendregistrationMail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RegistrationEmailServerMethodDescriptorSupplier("sendregistrationMail"))
                  .build();
          }
        }
     }
     return getSendregistrationMailMethod;
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
    public void sendOTPtoExistingUser(com.stackroute.musicmantra.noty5.emailserver.register.mailRequestforExistingUser request,
        io.grpc.stub.StreamObserver<com.stackroute.musicmantra.noty5.emailserver.register.apiResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendOTPtoExistingUserMethod(), responseObserver);
    }

    /**
     */
    public void sendOTPTONewUser(com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister request,
        io.grpc.stub.StreamObserver<com.stackroute.musicmantra.noty5.emailserver.register.apiResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendOTPTONewUserMethod(), responseObserver);
    }

    /**
     */
    public void sendregistrationMail(com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister request,
        io.grpc.stub.StreamObserver<com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendregistrationMailMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendOTPtoExistingUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.musicmantra.noty5.emailserver.register.mailRequestforExistingUser,
                com.stackroute.musicmantra.noty5.emailserver.register.apiResponse>(
                  this, METHODID_SEND_OTPTO_EXISTING_USER)))
          .addMethod(
            getSendOTPTONewUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister,
                com.stackroute.musicmantra.noty5.emailserver.register.apiResponse>(
                  this, METHODID_SEND_OTPTONEW_USER)))
          .addMethod(
            getSendregistrationMailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister,
                com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse>(
                  this, METHODID_SENDREGISTRATION_MAIL)))
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
    public void sendOTPtoExistingUser(com.stackroute.musicmantra.noty5.emailserver.register.mailRequestforExistingUser request,
        io.grpc.stub.StreamObserver<com.stackroute.musicmantra.noty5.emailserver.register.apiResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendOTPtoExistingUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendOTPTONewUser(com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister request,
        io.grpc.stub.StreamObserver<com.stackroute.musicmantra.noty5.emailserver.register.apiResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendOTPTONewUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendregistrationMail(com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister request,
        io.grpc.stub.StreamObserver<com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendregistrationMailMethod(), getCallOptions()), request, responseObserver);
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
    public com.stackroute.musicmantra.noty5.emailserver.register.apiResponse sendOTPtoExistingUser(com.stackroute.musicmantra.noty5.emailserver.register.mailRequestforExistingUser request) {
      return blockingUnaryCall(
          getChannel(), getSendOTPtoExistingUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stackroute.musicmantra.noty5.emailserver.register.apiResponse sendOTPTONewUser(com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister request) {
      return blockingUnaryCall(
          getChannel(), getSendOTPTONewUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse sendregistrationMail(com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister request) {
      return blockingUnaryCall(
          getChannel(), getSendregistrationMailMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.musicmantra.noty5.emailserver.register.apiResponse> sendOTPtoExistingUser(
        com.stackroute.musicmantra.noty5.emailserver.register.mailRequestforExistingUser request) {
      return futureUnaryCall(
          getChannel().newCall(getSendOTPtoExistingUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.musicmantra.noty5.emailserver.register.apiResponse> sendOTPTONewUser(
        com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister request) {
      return futureUnaryCall(
          getChannel().newCall(getSendOTPTONewUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse> sendregistrationMail(
        com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister request) {
      return futureUnaryCall(
          getChannel().newCall(getSendregistrationMailMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_OTPTO_EXISTING_USER = 0;
  private static final int METHODID_SEND_OTPTONEW_USER = 1;
  private static final int METHODID_SENDREGISTRATION_MAIL = 2;

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
        case METHODID_SEND_OTPTO_EXISTING_USER:
          serviceImpl.sendOTPtoExistingUser((com.stackroute.musicmantra.noty5.emailserver.register.mailRequestforExistingUser) request,
              (io.grpc.stub.StreamObserver<com.stackroute.musicmantra.noty5.emailserver.register.apiResponse>) responseObserver);
          break;
        case METHODID_SEND_OTPTONEW_USER:
          serviceImpl.sendOTPTONewUser((com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister) request,
              (io.grpc.stub.StreamObserver<com.stackroute.musicmantra.noty5.emailserver.register.apiResponse>) responseObserver);
          break;
        case METHODID_SENDREGISTRATION_MAIL:
          serviceImpl.sendregistrationMail((com.stackroute.musicmantra.noty5.emailserver.register.mailRequesttoregister) request,
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
              .addMethod(getSendOTPtoExistingUserMethod())
              .addMethod(getSendOTPTONewUserMethod())
              .addMethod(getSendregistrationMailMethod())
              .build();
        }
      }
    }
    return result;
  }
}
