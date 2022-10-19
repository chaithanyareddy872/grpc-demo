package org.example;

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
    comments = "Source: userRegister.proto")
//usergegistergrpc
public final class userRegisterGrpc {

  private userRegisterGrpc() {}

  public static final String SERVICE_NAME = "userRegister";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.UserRegister.details,
      org.example.UserRegister.APIResponse1> getRegistrationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "registration",
      requestType = org.example.UserRegister.details.class,
      responseType = org.example.UserRegister.APIResponse1.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.UserRegister.details,
      org.example.UserRegister.APIResponse1> getRegistrationMethod() {
    io.grpc.MethodDescriptor<org.example.UserRegister.details, org.example.UserRegister.APIResponse1> getRegistrationMethod;
    if ((getRegistrationMethod = userRegisterGrpc.getRegistrationMethod) == null) {
      synchronized (userRegisterGrpc.class) {
        if ((getRegistrationMethod = userRegisterGrpc.getRegistrationMethod) == null) {
          userRegisterGrpc.getRegistrationMethod = getRegistrationMethod = 
              io.grpc.MethodDescriptor.<org.example.UserRegister.details, org.example.UserRegister.APIResponse1>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userRegister", "registration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserRegister.details.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserRegister.APIResponse1.getDefaultInstance()))
                  .setSchemaDescriptor(new userRegisterMethodDescriptorSupplier("registration"))
                  .build();
          }
        }
     }
     return getRegistrationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.UserRegister.authenticationRequest,
      org.example.UserRegister.APIResponse1> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = org.example.UserRegister.authenticationRequest.class,
      responseType = org.example.UserRegister.APIResponse1.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.UserRegister.authenticationRequest,
      org.example.UserRegister.APIResponse1> getLoginMethod() {
    io.grpc.MethodDescriptor<org.example.UserRegister.authenticationRequest, org.example.UserRegister.APIResponse1> getLoginMethod;
    if ((getLoginMethod = userRegisterGrpc.getLoginMethod) == null) {
      synchronized (userRegisterGrpc.class) {
        if ((getLoginMethod = userRegisterGrpc.getLoginMethod) == null) {
          userRegisterGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<org.example.UserRegister.authenticationRequest, org.example.UserRegister.APIResponse1>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userRegister", "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserRegister.authenticationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserRegister.APIResponse1.getDefaultInstance()))
                  .setSchemaDescriptor(new userRegisterMethodDescriptorSupplier("login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.UserRegister.deleteRequest,
      org.example.UserRegister.APIResponse1> getDeleteuserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteuser",
      requestType = org.example.UserRegister.deleteRequest.class,
      responseType = org.example.UserRegister.APIResponse1.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.UserRegister.deleteRequest,
      org.example.UserRegister.APIResponse1> getDeleteuserMethod() {
    io.grpc.MethodDescriptor<org.example.UserRegister.deleteRequest, org.example.UserRegister.APIResponse1> getDeleteuserMethod;
    if ((getDeleteuserMethod = userRegisterGrpc.getDeleteuserMethod) == null) {
      synchronized (userRegisterGrpc.class) {
        if ((getDeleteuserMethod = userRegisterGrpc.getDeleteuserMethod) == null) {
          userRegisterGrpc.getDeleteuserMethod = getDeleteuserMethod = 
              io.grpc.MethodDescriptor.<org.example.UserRegister.deleteRequest, org.example.UserRegister.APIResponse1>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userRegister", "deleteuser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserRegister.deleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserRegister.APIResponse1.getDefaultInstance()))
                  .setSchemaDescriptor(new userRegisterMethodDescriptorSupplier("deleteuser"))
                  .build();
          }
        }
     }
     return getDeleteuserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static userRegisterStub newStub(io.grpc.Channel channel) {
    return new userRegisterStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static userRegisterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new userRegisterBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static userRegisterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new userRegisterFutureStub(channel);
  }

  /**
   */
  public static abstract class userRegisterImplBase implements io.grpc.BindableService {

    /**
     */
    public void registration(org.example.UserRegister.details request,
        io.grpc.stub.StreamObserver<org.example.UserRegister.APIResponse1> responseObserver) {
      asyncUnimplementedUnaryCall(getRegistrationMethod(), responseObserver);
    }

    /**
     */
    public void login(org.example.UserRegister.authenticationRequest request,
        io.grpc.stub.StreamObserver<org.example.UserRegister.APIResponse1> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void deleteuser(org.example.UserRegister.deleteRequest request,
        io.grpc.stub.StreamObserver<org.example.UserRegister.APIResponse1> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteuserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegistrationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.UserRegister.details,
                org.example.UserRegister.APIResponse1>(
                  this, METHODID_REGISTRATION)))
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.UserRegister.authenticationRequest,
                org.example.UserRegister.APIResponse1>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getDeleteuserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.UserRegister.deleteRequest,
                org.example.UserRegister.APIResponse1>(
                  this, METHODID_DELETEUSER)))
          .build();
    }
  }

  /**
   */
  public static final class userRegisterStub extends io.grpc.stub.AbstractStub<userRegisterStub> {
    private userRegisterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userRegisterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userRegisterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userRegisterStub(channel, callOptions);
    }

    /**
     */
    public void registration(org.example.UserRegister.details request,
        io.grpc.stub.StreamObserver<org.example.UserRegister.APIResponse1> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegistrationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void login(org.example.UserRegister.authenticationRequest request,
        io.grpc.stub.StreamObserver<org.example.UserRegister.APIResponse1> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteuser(org.example.UserRegister.deleteRequest request,
        io.grpc.stub.StreamObserver<org.example.UserRegister.APIResponse1> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteuserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class userRegisterBlockingStub extends io.grpc.stub.AbstractStub<userRegisterBlockingStub> {
    private userRegisterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userRegisterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userRegisterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userRegisterBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.UserRegister.APIResponse1 registration(org.example.UserRegister.details request) {
      return blockingUnaryCall(
          getChannel(), getRegistrationMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.UserRegister.APIResponse1 login(org.example.UserRegister.authenticationRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.UserRegister.APIResponse1 deleteuser(org.example.UserRegister.deleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteuserMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class userRegisterFutureStub extends io.grpc.stub.AbstractStub<userRegisterFutureStub> {
    private userRegisterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userRegisterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userRegisterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userRegisterFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.UserRegister.APIResponse1> registration(
        org.example.UserRegister.details request) {
      return futureUnaryCall(
          getChannel().newCall(getRegistrationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.UserRegister.APIResponse1> login(
        org.example.UserRegister.authenticationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.UserRegister.APIResponse1> deleteuser(
        org.example.UserRegister.deleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteuserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTRATION = 0;
  private static final int METHODID_LOGIN = 1;
  private static final int METHODID_DELETEUSER = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final userRegisterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(userRegisterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTRATION:
          serviceImpl.registration((org.example.UserRegister.details) request,
              (io.grpc.stub.StreamObserver<org.example.UserRegister.APIResponse1>) responseObserver);
          break;
        case METHODID_LOGIN:
          serviceImpl.login((org.example.UserRegister.authenticationRequest) request,
              (io.grpc.stub.StreamObserver<org.example.UserRegister.APIResponse1>) responseObserver);
          break;
        case METHODID_DELETEUSER:
          serviceImpl.deleteuser((org.example.UserRegister.deleteRequest) request,
              (io.grpc.stub.StreamObserver<org.example.UserRegister.APIResponse1>) responseObserver);
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

  private static abstract class userRegisterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    userRegisterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.UserRegister.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("userRegister");
    }
  }

  private static final class userRegisterFileDescriptorSupplier
      extends userRegisterBaseDescriptorSupplier {
    userRegisterFileDescriptorSupplier() {}
  }

  private static final class userRegisterMethodDescriptorSupplier
      extends userRegisterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    userRegisterMethodDescriptorSupplier(String methodName) {
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
      synchronized (userRegisterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new userRegisterFileDescriptorSupplier())
              .addMethod(getRegistrationMethod())
              .addMethod(getLoginMethod())
              .addMethod(getDeleteuserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
