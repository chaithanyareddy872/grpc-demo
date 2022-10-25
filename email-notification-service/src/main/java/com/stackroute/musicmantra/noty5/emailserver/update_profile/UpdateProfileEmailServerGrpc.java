package com.stackroute.musicmantra.noty5.emailserver.update_profile;

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
    comments = "Source: Update_profile.proto")
public final class UpdateProfileEmailServerGrpc {

  private UpdateProfileEmailServerGrpc() {}

  public static final String SERVICE_NAME = "UpdateProfileEmailServer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.stackroute.musicmantra.noty5.emailserver.update_profile.mailRequesttoUpdate,
      com.stackroute.musicmantra.noty5.emailserver.update_profile.updateProfileResponse> getProfileUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "profileUpdate",
      requestType = com.stackroute.musicmantra.noty5.emailserver.update_profile.mailRequesttoUpdate.class,
      responseType = com.stackroute.musicmantra.noty5.emailserver.update_profile.updateProfileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.musicmantra.noty5.emailserver.update_profile.mailRequesttoUpdate,
      com.stackroute.musicmantra.noty5.emailserver.update_profile.updateProfileResponse> getProfileUpdateMethod() {
    io.grpc.MethodDescriptor<com.stackroute.musicmantra.noty5.emailserver.update_profile.mailRequesttoUpdate, com.stackroute.musicmantra.noty5.emailserver.update_profile.updateProfileResponse> getProfileUpdateMethod;
    if ((getProfileUpdateMethod = UpdateProfileEmailServerGrpc.getProfileUpdateMethod) == null) {
      synchronized (UpdateProfileEmailServerGrpc.class) {
        if ((getProfileUpdateMethod = UpdateProfileEmailServerGrpc.getProfileUpdateMethod) == null) {
          UpdateProfileEmailServerGrpc.getProfileUpdateMethod = getProfileUpdateMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.musicmantra.noty5.emailserver.update_profile.mailRequesttoUpdate, com.stackroute.musicmantra.noty5.emailserver.update_profile.updateProfileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UpdateProfileEmailServer", "profileUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.musicmantra.noty5.emailserver.update_profile.mailRequesttoUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.musicmantra.noty5.emailserver.update_profile.updateProfileResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UpdateProfileEmailServerMethodDescriptorSupplier("profileUpdate"))
                  .build();
          }
        }
     }
     return getProfileUpdateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UpdateProfileEmailServerStub newStub(io.grpc.Channel channel) {
    return new UpdateProfileEmailServerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UpdateProfileEmailServerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UpdateProfileEmailServerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UpdateProfileEmailServerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UpdateProfileEmailServerFutureStub(channel);
  }

  /**
   */
  public static abstract class UpdateProfileEmailServerImplBase implements io.grpc.BindableService {

    /**
     */
    public void profileUpdate(com.stackroute.musicmantra.noty5.emailserver.update_profile.mailRequesttoUpdate request,
        io.grpc.stub.StreamObserver<com.stackroute.musicmantra.noty5.emailserver.update_profile.updateProfileResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getProfileUpdateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getProfileUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.musicmantra.noty5.emailserver.update_profile.mailRequesttoUpdate,
                com.stackroute.musicmantra.noty5.emailserver.update_profile.updateProfileResponse>(
                  this, METHODID_PROFILE_UPDATE)))
          .build();
    }
  }

  /**
   */
  public static final class UpdateProfileEmailServerStub extends io.grpc.stub.AbstractStub<UpdateProfileEmailServerStub> {
    private UpdateProfileEmailServerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UpdateProfileEmailServerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdateProfileEmailServerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UpdateProfileEmailServerStub(channel, callOptions);
    }

    /**
     */
    public void profileUpdate(com.stackroute.musicmantra.noty5.emailserver.update_profile.mailRequesttoUpdate request,
        io.grpc.stub.StreamObserver<com.stackroute.musicmantra.noty5.emailserver.update_profile.updateProfileResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProfileUpdateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UpdateProfileEmailServerBlockingStub extends io.grpc.stub.AbstractStub<UpdateProfileEmailServerBlockingStub> {
    private UpdateProfileEmailServerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UpdateProfileEmailServerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdateProfileEmailServerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UpdateProfileEmailServerBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.stackroute.musicmantra.noty5.emailserver.update_profile.updateProfileResponse profileUpdate(com.stackroute.musicmantra.noty5.emailserver.update_profile.mailRequesttoUpdate request) {
      return blockingUnaryCall(
          getChannel(), getProfileUpdateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UpdateProfileEmailServerFutureStub extends io.grpc.stub.AbstractStub<UpdateProfileEmailServerFutureStub> {
    private UpdateProfileEmailServerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UpdateProfileEmailServerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdateProfileEmailServerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UpdateProfileEmailServerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.musicmantra.noty5.emailserver.update_profile.updateProfileResponse> profileUpdate(
        com.stackroute.musicmantra.noty5.emailserver.update_profile.mailRequesttoUpdate request) {
      return futureUnaryCall(
          getChannel().newCall(getProfileUpdateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PROFILE_UPDATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UpdateProfileEmailServerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UpdateProfileEmailServerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PROFILE_UPDATE:
          serviceImpl.profileUpdate((com.stackroute.musicmantra.noty5.emailserver.update_profile.mailRequesttoUpdate) request,
              (io.grpc.stub.StreamObserver<com.stackroute.musicmantra.noty5.emailserver.update_profile.updateProfileResponse>) responseObserver);
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

  private static abstract class UpdateProfileEmailServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UpdateProfileEmailServerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.stackroute.musicmantra.noty5.emailserver.update_profile.UpdateProfile.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UpdateProfileEmailServer");
    }
  }

  private static final class UpdateProfileEmailServerFileDescriptorSupplier
      extends UpdateProfileEmailServerBaseDescriptorSupplier {
    UpdateProfileEmailServerFileDescriptorSupplier() {}
  }

  private static final class UpdateProfileEmailServerMethodDescriptorSupplier
      extends UpdateProfileEmailServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UpdateProfileEmailServerMethodDescriptorSupplier(String methodName) {
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
      synchronized (UpdateProfileEmailServerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UpdateProfileEmailServerFileDescriptorSupplier())
              .addMethod(getProfileUpdateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
