package org.grpc.generated;

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
    comments = "Source: userprofile.proto")
public final class UpdateServiceGrpc {

  private UpdateServiceGrpc() {}

  public static final String SERVICE_NAME = "UpdateService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.grpc.generated.Userprofile.nameOrPasswordRequest,
      org.grpc.generated.Userprofile.Response> getUpdatefirstNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updatefirstName",
      requestType = org.grpc.generated.Userprofile.nameOrPasswordRequest.class,
      responseType = org.grpc.generated.Userprofile.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.grpc.generated.Userprofile.nameOrPasswordRequest,
      org.grpc.generated.Userprofile.Response> getUpdatefirstNameMethod() {
    io.grpc.MethodDescriptor<org.grpc.generated.Userprofile.nameOrPasswordRequest, org.grpc.generated.Userprofile.Response> getUpdatefirstNameMethod;
    if ((getUpdatefirstNameMethod = UpdateServiceGrpc.getUpdatefirstNameMethod) == null) {
      synchronized (UpdateServiceGrpc.class) {
        if ((getUpdatefirstNameMethod = UpdateServiceGrpc.getUpdatefirstNameMethod) == null) {
          UpdateServiceGrpc.getUpdatefirstNameMethod = getUpdatefirstNameMethod = 
              io.grpc.MethodDescriptor.<org.grpc.generated.Userprofile.nameOrPasswordRequest, org.grpc.generated.Userprofile.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UpdateService", "updatefirstName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc.generated.Userprofile.nameOrPasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc.generated.Userprofile.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new UpdateServiceMethodDescriptorSupplier("updatefirstName"))
                  .build();
          }
        }
     }
     return getUpdatefirstNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.grpc.generated.Userprofile.nameOrPasswordRequest,
      org.grpc.generated.Userprofile.Response> getUpdatelastLastMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updatelastLast",
      requestType = org.grpc.generated.Userprofile.nameOrPasswordRequest.class,
      responseType = org.grpc.generated.Userprofile.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.grpc.generated.Userprofile.nameOrPasswordRequest,
      org.grpc.generated.Userprofile.Response> getUpdatelastLastMethod() {
    io.grpc.MethodDescriptor<org.grpc.generated.Userprofile.nameOrPasswordRequest, org.grpc.generated.Userprofile.Response> getUpdatelastLastMethod;
    if ((getUpdatelastLastMethod = UpdateServiceGrpc.getUpdatelastLastMethod) == null) {
      synchronized (UpdateServiceGrpc.class) {
        if ((getUpdatelastLastMethod = UpdateServiceGrpc.getUpdatelastLastMethod) == null) {
          UpdateServiceGrpc.getUpdatelastLastMethod = getUpdatelastLastMethod = 
              io.grpc.MethodDescriptor.<org.grpc.generated.Userprofile.nameOrPasswordRequest, org.grpc.generated.Userprofile.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UpdateService", "updatelastLast"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc.generated.Userprofile.nameOrPasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc.generated.Userprofile.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new UpdateServiceMethodDescriptorSupplier("updatelastLast"))
                  .build();
          }
        }
     }
     return getUpdatelastLastMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.grpc.generated.Userprofile.nameOrPasswordRequest,
      org.grpc.generated.Userprofile.Response> getUpdateContactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateContact",
      requestType = org.grpc.generated.Userprofile.nameOrPasswordRequest.class,
      responseType = org.grpc.generated.Userprofile.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.grpc.generated.Userprofile.nameOrPasswordRequest,
      org.grpc.generated.Userprofile.Response> getUpdateContactMethod() {
    io.grpc.MethodDescriptor<org.grpc.generated.Userprofile.nameOrPasswordRequest, org.grpc.generated.Userprofile.Response> getUpdateContactMethod;
    if ((getUpdateContactMethod = UpdateServiceGrpc.getUpdateContactMethod) == null) {
      synchronized (UpdateServiceGrpc.class) {
        if ((getUpdateContactMethod = UpdateServiceGrpc.getUpdateContactMethod) == null) {
          UpdateServiceGrpc.getUpdateContactMethod = getUpdateContactMethod = 
              io.grpc.MethodDescriptor.<org.grpc.generated.Userprofile.nameOrPasswordRequest, org.grpc.generated.Userprofile.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UpdateService", "updateContact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc.generated.Userprofile.nameOrPasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc.generated.Userprofile.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new UpdateServiceMethodDescriptorSupplier("updateContact"))
                  .build();
          }
        }
     }
     return getUpdateContactMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.grpc.generated.Userprofile.Address,
      org.grpc.generated.Userprofile.Response> getUpdateAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateAddress",
      requestType = org.grpc.generated.Userprofile.Address.class,
      responseType = org.grpc.generated.Userprofile.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.grpc.generated.Userprofile.Address,
      org.grpc.generated.Userprofile.Response> getUpdateAddressMethod() {
    io.grpc.MethodDescriptor<org.grpc.generated.Userprofile.Address, org.grpc.generated.Userprofile.Response> getUpdateAddressMethod;
    if ((getUpdateAddressMethod = UpdateServiceGrpc.getUpdateAddressMethod) == null) {
      synchronized (UpdateServiceGrpc.class) {
        if ((getUpdateAddressMethod = UpdateServiceGrpc.getUpdateAddressMethod) == null) {
          UpdateServiceGrpc.getUpdateAddressMethod = getUpdateAddressMethod = 
              io.grpc.MethodDescriptor.<org.grpc.generated.Userprofile.Address, org.grpc.generated.Userprofile.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UpdateService", "updateAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc.generated.Userprofile.Address.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc.generated.Userprofile.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new UpdateServiceMethodDescriptorSupplier("updateAddress"))
                  .build();
          }
        }
     }
     return getUpdateAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.grpc.generated.Userprofile.preference,
      org.grpc.generated.Userprofile.Response> getUpdatePreferenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updatePreference",
      requestType = org.grpc.generated.Userprofile.preference.class,
      responseType = org.grpc.generated.Userprofile.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.grpc.generated.Userprofile.preference,
      org.grpc.generated.Userprofile.Response> getUpdatePreferenceMethod() {
    io.grpc.MethodDescriptor<org.grpc.generated.Userprofile.preference, org.grpc.generated.Userprofile.Response> getUpdatePreferenceMethod;
    if ((getUpdatePreferenceMethod = UpdateServiceGrpc.getUpdatePreferenceMethod) == null) {
      synchronized (UpdateServiceGrpc.class) {
        if ((getUpdatePreferenceMethod = UpdateServiceGrpc.getUpdatePreferenceMethod) == null) {
          UpdateServiceGrpc.getUpdatePreferenceMethod = getUpdatePreferenceMethod = 
              io.grpc.MethodDescriptor.<org.grpc.generated.Userprofile.preference, org.grpc.generated.Userprofile.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UpdateService", "updatePreference"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc.generated.Userprofile.preference.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc.generated.Userprofile.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new UpdateServiceMethodDescriptorSupplier("updatePreference"))
                  .build();
          }
        }
     }
     return getUpdatePreferenceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.grpc.generated.Userprofile.interests,
      org.grpc.generated.Userprofile.Response> getUpdateInterestsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateInterests",
      requestType = org.grpc.generated.Userprofile.interests.class,
      responseType = org.grpc.generated.Userprofile.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.grpc.generated.Userprofile.interests,
      org.grpc.generated.Userprofile.Response> getUpdateInterestsMethod() {
    io.grpc.MethodDescriptor<org.grpc.generated.Userprofile.interests, org.grpc.generated.Userprofile.Response> getUpdateInterestsMethod;
    if ((getUpdateInterestsMethod = UpdateServiceGrpc.getUpdateInterestsMethod) == null) {
      synchronized (UpdateServiceGrpc.class) {
        if ((getUpdateInterestsMethod = UpdateServiceGrpc.getUpdateInterestsMethod) == null) {
          UpdateServiceGrpc.getUpdateInterestsMethod = getUpdateInterestsMethod = 
              io.grpc.MethodDescriptor.<org.grpc.generated.Userprofile.interests, org.grpc.generated.Userprofile.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UpdateService", "updateInterests"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc.generated.Userprofile.interests.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc.generated.Userprofile.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new UpdateServiceMethodDescriptorSupplier("updateInterests"))
                  .build();
          }
        }
     }
     return getUpdateInterestsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.grpc.generated.Userprofile.nameOrPasswordRequest,
      org.grpc.generated.Userprofile.Response> getUpdatePasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updatePassword",
      requestType = org.grpc.generated.Userprofile.nameOrPasswordRequest.class,
      responseType = org.grpc.generated.Userprofile.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.grpc.generated.Userprofile.nameOrPasswordRequest,
      org.grpc.generated.Userprofile.Response> getUpdatePasswordMethod() {
    io.grpc.MethodDescriptor<org.grpc.generated.Userprofile.nameOrPasswordRequest, org.grpc.generated.Userprofile.Response> getUpdatePasswordMethod;
    if ((getUpdatePasswordMethod = UpdateServiceGrpc.getUpdatePasswordMethod) == null) {
      synchronized (UpdateServiceGrpc.class) {
        if ((getUpdatePasswordMethod = UpdateServiceGrpc.getUpdatePasswordMethod) == null) {
          UpdateServiceGrpc.getUpdatePasswordMethod = getUpdatePasswordMethod = 
              io.grpc.MethodDescriptor.<org.grpc.generated.Userprofile.nameOrPasswordRequest, org.grpc.generated.Userprofile.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UpdateService", "updatePassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc.generated.Userprofile.nameOrPasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc.generated.Userprofile.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new UpdateServiceMethodDescriptorSupplier("updatePassword"))
                  .build();
          }
        }
     }
     return getUpdatePasswordMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UpdateServiceStub newStub(io.grpc.Channel channel) {
    return new UpdateServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UpdateServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UpdateServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UpdateServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UpdateServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UpdateServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void updatefirstName(org.grpc.generated.Userprofile.nameOrPasswordRequest request,
        io.grpc.stub.StreamObserver<org.grpc.generated.Userprofile.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdatefirstNameMethod(), responseObserver);
    }

    /**
     */
    public void updatelastLast(org.grpc.generated.Userprofile.nameOrPasswordRequest request,
        io.grpc.stub.StreamObserver<org.grpc.generated.Userprofile.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdatelastLastMethod(), responseObserver);
    }

    /**
     */
    public void updateContact(org.grpc.generated.Userprofile.nameOrPasswordRequest request,
        io.grpc.stub.StreamObserver<org.grpc.generated.Userprofile.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateContactMethod(), responseObserver);
    }

    /**
     */
    public void updateAddress(org.grpc.generated.Userprofile.Address request,
        io.grpc.stub.StreamObserver<org.grpc.generated.Userprofile.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAddressMethod(), responseObserver);
    }

    /**
     */
    public void updatePreference(org.grpc.generated.Userprofile.preference request,
        io.grpc.stub.StreamObserver<org.grpc.generated.Userprofile.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdatePreferenceMethod(), responseObserver);
    }

    /**
     */
    public void updateInterests(org.grpc.generated.Userprofile.interests request,
        io.grpc.stub.StreamObserver<org.grpc.generated.Userprofile.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateInterestsMethod(), responseObserver);
    }

    /**
     */
    public void updatePassword(org.grpc.generated.Userprofile.nameOrPasswordRequest request,
        io.grpc.stub.StreamObserver<org.grpc.generated.Userprofile.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdatePasswordMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUpdatefirstNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.grpc.generated.Userprofile.nameOrPasswordRequest,
                org.grpc.generated.Userprofile.Response>(
                  this, METHODID_UPDATEFIRST_NAME)))
          .addMethod(
            getUpdatelastLastMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.grpc.generated.Userprofile.nameOrPasswordRequest,
                org.grpc.generated.Userprofile.Response>(
                  this, METHODID_UPDATELAST_LAST)))
          .addMethod(
            getUpdateContactMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.grpc.generated.Userprofile.nameOrPasswordRequest,
                org.grpc.generated.Userprofile.Response>(
                  this, METHODID_UPDATE_CONTACT)))
          .addMethod(
            getUpdateAddressMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.grpc.generated.Userprofile.Address,
                org.grpc.generated.Userprofile.Response>(
                  this, METHODID_UPDATE_ADDRESS)))
          .addMethod(
            getUpdatePreferenceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.grpc.generated.Userprofile.preference,
                org.grpc.generated.Userprofile.Response>(
                  this, METHODID_UPDATE_PREFERENCE)))
          .addMethod(
            getUpdateInterestsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.grpc.generated.Userprofile.interests,
                org.grpc.generated.Userprofile.Response>(
                  this, METHODID_UPDATE_INTERESTS)))
          .addMethod(
            getUpdatePasswordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.grpc.generated.Userprofile.nameOrPasswordRequest,
                org.grpc.generated.Userprofile.Response>(
                  this, METHODID_UPDATE_PASSWORD)))
          .build();
    }
  }

  /**
   */
  public static final class UpdateServiceStub extends io.grpc.stub.AbstractStub<UpdateServiceStub> {
    private UpdateServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UpdateServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdateServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UpdateServiceStub(channel, callOptions);
    }

    /**
     */
    public void updatefirstName(org.grpc.generated.Userprofile.nameOrPasswordRequest request,
        io.grpc.stub.StreamObserver<org.grpc.generated.Userprofile.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdatefirstNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatelastLast(org.grpc.generated.Userprofile.nameOrPasswordRequest request,
        io.grpc.stub.StreamObserver<org.grpc.generated.Userprofile.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdatelastLastMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateContact(org.grpc.generated.Userprofile.nameOrPasswordRequest request,
        io.grpc.stub.StreamObserver<org.grpc.generated.Userprofile.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateContactMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAddress(org.grpc.generated.Userprofile.Address request,
        io.grpc.stub.StreamObserver<org.grpc.generated.Userprofile.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePreference(org.grpc.generated.Userprofile.preference request,
        io.grpc.stub.StreamObserver<org.grpc.generated.Userprofile.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdatePreferenceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateInterests(org.grpc.generated.Userprofile.interests request,
        io.grpc.stub.StreamObserver<org.grpc.generated.Userprofile.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateInterestsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePassword(org.grpc.generated.Userprofile.nameOrPasswordRequest request,
        io.grpc.stub.StreamObserver<org.grpc.generated.Userprofile.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdatePasswordMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UpdateServiceBlockingStub extends io.grpc.stub.AbstractStub<UpdateServiceBlockingStub> {
    private UpdateServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UpdateServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdateServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UpdateServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.grpc.generated.Userprofile.Response updatefirstName(org.grpc.generated.Userprofile.nameOrPasswordRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdatefirstNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.grpc.generated.Userprofile.Response updatelastLast(org.grpc.generated.Userprofile.nameOrPasswordRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdatelastLastMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.grpc.generated.Userprofile.Response updateContact(org.grpc.generated.Userprofile.nameOrPasswordRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateContactMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.grpc.generated.Userprofile.Response updateAddress(org.grpc.generated.Userprofile.Address request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.grpc.generated.Userprofile.Response updatePreference(org.grpc.generated.Userprofile.preference request) {
      return blockingUnaryCall(
          getChannel(), getUpdatePreferenceMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.grpc.generated.Userprofile.Response updateInterests(org.grpc.generated.Userprofile.interests request) {
      return blockingUnaryCall(
          getChannel(), getUpdateInterestsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.grpc.generated.Userprofile.Response updatePassword(org.grpc.generated.Userprofile.nameOrPasswordRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdatePasswordMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UpdateServiceFutureStub extends io.grpc.stub.AbstractStub<UpdateServiceFutureStub> {
    private UpdateServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UpdateServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdateServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UpdateServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.grpc.generated.Userprofile.Response> updatefirstName(
        org.grpc.generated.Userprofile.nameOrPasswordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdatefirstNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.grpc.generated.Userprofile.Response> updatelastLast(
        org.grpc.generated.Userprofile.nameOrPasswordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdatelastLastMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.grpc.generated.Userprofile.Response> updateContact(
        org.grpc.generated.Userprofile.nameOrPasswordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateContactMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.grpc.generated.Userprofile.Response> updateAddress(
        org.grpc.generated.Userprofile.Address request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.grpc.generated.Userprofile.Response> updatePreference(
        org.grpc.generated.Userprofile.preference request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdatePreferenceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.grpc.generated.Userprofile.Response> updateInterests(
        org.grpc.generated.Userprofile.interests request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateInterestsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.grpc.generated.Userprofile.Response> updatePassword(
        org.grpc.generated.Userprofile.nameOrPasswordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdatePasswordMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPDATEFIRST_NAME = 0;
  private static final int METHODID_UPDATELAST_LAST = 1;
  private static final int METHODID_UPDATE_CONTACT = 2;
  private static final int METHODID_UPDATE_ADDRESS = 3;
  private static final int METHODID_UPDATE_PREFERENCE = 4;
  private static final int METHODID_UPDATE_INTERESTS = 5;
  private static final int METHODID_UPDATE_PASSWORD = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UpdateServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UpdateServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPDATEFIRST_NAME:
          serviceImpl.updatefirstName((org.grpc.generated.Userprofile.nameOrPasswordRequest) request,
              (io.grpc.stub.StreamObserver<org.grpc.generated.Userprofile.Response>) responseObserver);
          break;
        case METHODID_UPDATELAST_LAST:
          serviceImpl.updatelastLast((org.grpc.generated.Userprofile.nameOrPasswordRequest) request,
              (io.grpc.stub.StreamObserver<org.grpc.generated.Userprofile.Response>) responseObserver);
          break;
        case METHODID_UPDATE_CONTACT:
          serviceImpl.updateContact((org.grpc.generated.Userprofile.nameOrPasswordRequest) request,
              (io.grpc.stub.StreamObserver<org.grpc.generated.Userprofile.Response>) responseObserver);
          break;
        case METHODID_UPDATE_ADDRESS:
          serviceImpl.updateAddress((org.grpc.generated.Userprofile.Address) request,
              (io.grpc.stub.StreamObserver<org.grpc.generated.Userprofile.Response>) responseObserver);
          break;
        case METHODID_UPDATE_PREFERENCE:
          serviceImpl.updatePreference((org.grpc.generated.Userprofile.preference) request,
              (io.grpc.stub.StreamObserver<org.grpc.generated.Userprofile.Response>) responseObserver);
          break;
        case METHODID_UPDATE_INTERESTS:
          serviceImpl.updateInterests((org.grpc.generated.Userprofile.interests) request,
              (io.grpc.stub.StreamObserver<org.grpc.generated.Userprofile.Response>) responseObserver);
          break;
        case METHODID_UPDATE_PASSWORD:
          serviceImpl.updatePassword((org.grpc.generated.Userprofile.nameOrPasswordRequest) request,
              (io.grpc.stub.StreamObserver<org.grpc.generated.Userprofile.Response>) responseObserver);
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

  private static abstract class UpdateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UpdateServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.grpc.generated.Userprofile.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UpdateService");
    }
  }

  private static final class UpdateServiceFileDescriptorSupplier
      extends UpdateServiceBaseDescriptorSupplier {
    UpdateServiceFileDescriptorSupplier() {}
  }

  private static final class UpdateServiceMethodDescriptorSupplier
      extends UpdateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UpdateServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UpdateServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UpdateServiceFileDescriptorSupplier())
              .addMethod(getUpdatefirstNameMethod())
              .addMethod(getUpdatelastLastMethod())
              .addMethod(getUpdateContactMethod())
              .addMethod(getUpdateAddressMethod())
              .addMethod(getUpdatePreferenceMethod())
              .addMethod(getUpdateInterestsMethod())
              .addMethod(getUpdatePasswordMethod())
              .build();
        }
      }
    }
    return result;
  }
}
