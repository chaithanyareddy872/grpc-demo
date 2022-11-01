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
    comments = "Source: sessionCreate.proto")
public final class SessionServiceGrpc {

  private SessionServiceGrpc() {}

  public static final String SERVICE_NAME = "SessionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.grpc.generated.SessionCreate.SessionRequest,
      org.grpc.generated.SessionCreate.SessionResponse> getSessionCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sessionCreate",
      requestType = org.grpc.generated.SessionCreate.SessionRequest.class,
      responseType = org.grpc.generated.SessionCreate.SessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.grpc.generated.SessionCreate.SessionRequest,
      org.grpc.generated.SessionCreate.SessionResponse> getSessionCreateMethod() {
    io.grpc.MethodDescriptor<org.grpc.generated.SessionCreate.SessionRequest, org.grpc.generated.SessionCreate.SessionResponse> getSessionCreateMethod;
    if ((getSessionCreateMethod = SessionServiceGrpc.getSessionCreateMethod) == null) {
      synchronized (SessionServiceGrpc.class) {
        if ((getSessionCreateMethod = SessionServiceGrpc.getSessionCreateMethod) == null) {
          SessionServiceGrpc.getSessionCreateMethod = getSessionCreateMethod = 
              io.grpc.MethodDescriptor.<org.grpc.generated.SessionCreate.SessionRequest, org.grpc.generated.SessionCreate.SessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SessionService", "sessionCreate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc.generated.SessionCreate.SessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc.generated.SessionCreate.SessionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SessionServiceMethodDescriptorSupplier("sessionCreate"))
                  .build();
          }
        }
     }
     return getSessionCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.grpc.generated.SessionCreate.GetSessionRequest,
      org.grpc.generated.SessionCreate.GetSessionResponse> getGetSessionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getSessions",
      requestType = org.grpc.generated.SessionCreate.GetSessionRequest.class,
      responseType = org.grpc.generated.SessionCreate.GetSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.grpc.generated.SessionCreate.GetSessionRequest,
      org.grpc.generated.SessionCreate.GetSessionResponse> getGetSessionsMethod() {
    io.grpc.MethodDescriptor<org.grpc.generated.SessionCreate.GetSessionRequest, org.grpc.generated.SessionCreate.GetSessionResponse> getGetSessionsMethod;
    if ((getGetSessionsMethod = SessionServiceGrpc.getGetSessionsMethod) == null) {
      synchronized (SessionServiceGrpc.class) {
        if ((getGetSessionsMethod = SessionServiceGrpc.getGetSessionsMethod) == null) {
          SessionServiceGrpc.getGetSessionsMethod = getGetSessionsMethod = 
              io.grpc.MethodDescriptor.<org.grpc.generated.SessionCreate.GetSessionRequest, org.grpc.generated.SessionCreate.GetSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SessionService", "getSessions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc.generated.SessionCreate.GetSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc.generated.SessionCreate.GetSessionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SessionServiceMethodDescriptorSupplier("getSessions"))
                  .build();
          }
        }
     }
     return getGetSessionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.grpc.generated.SessionCreate.SessionNameRequest,
      org.grpc.generated.SessionCreate.SessionResponse> getUpdateSessionNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateSessionName",
      requestType = org.grpc.generated.SessionCreate.SessionNameRequest.class,
      responseType = org.grpc.generated.SessionCreate.SessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.grpc.generated.SessionCreate.SessionNameRequest,
      org.grpc.generated.SessionCreate.SessionResponse> getUpdateSessionNameMethod() {
    io.grpc.MethodDescriptor<org.grpc.generated.SessionCreate.SessionNameRequest, org.grpc.generated.SessionCreate.SessionResponse> getUpdateSessionNameMethod;
    if ((getUpdateSessionNameMethod = SessionServiceGrpc.getUpdateSessionNameMethod) == null) {
      synchronized (SessionServiceGrpc.class) {
        if ((getUpdateSessionNameMethod = SessionServiceGrpc.getUpdateSessionNameMethod) == null) {
          SessionServiceGrpc.getUpdateSessionNameMethod = getUpdateSessionNameMethod = 
              io.grpc.MethodDescriptor.<org.grpc.generated.SessionCreate.SessionNameRequest, org.grpc.generated.SessionCreate.SessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SessionService", "updateSessionName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc.generated.SessionCreate.SessionNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc.generated.SessionCreate.SessionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SessionServiceMethodDescriptorSupplier("updateSessionName"))
                  .build();
          }
        }
     }
     return getUpdateSessionNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.grpc.generated.SessionCreate.SessionTimingRequest,
      org.grpc.generated.SessionCreate.SessionResponse> getUpdateSessionTimingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateSessionTimings",
      requestType = org.grpc.generated.SessionCreate.SessionTimingRequest.class,
      responseType = org.grpc.generated.SessionCreate.SessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.grpc.generated.SessionCreate.SessionTimingRequest,
      org.grpc.generated.SessionCreate.SessionResponse> getUpdateSessionTimingsMethod() {
    io.grpc.MethodDescriptor<org.grpc.generated.SessionCreate.SessionTimingRequest, org.grpc.generated.SessionCreate.SessionResponse> getUpdateSessionTimingsMethod;
    if ((getUpdateSessionTimingsMethod = SessionServiceGrpc.getUpdateSessionTimingsMethod) == null) {
      synchronized (SessionServiceGrpc.class) {
        if ((getUpdateSessionTimingsMethod = SessionServiceGrpc.getUpdateSessionTimingsMethod) == null) {
          SessionServiceGrpc.getUpdateSessionTimingsMethod = getUpdateSessionTimingsMethod = 
              io.grpc.MethodDescriptor.<org.grpc.generated.SessionCreate.SessionTimingRequest, org.grpc.generated.SessionCreate.SessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SessionService", "updateSessionTimings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc.generated.SessionCreate.SessionTimingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc.generated.SessionCreate.SessionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SessionServiceMethodDescriptorSupplier("updateSessionTimings"))
                  .build();
          }
        }
     }
     return getUpdateSessionTimingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.grpc.generated.SessionCreate.SessionFeesRequest,
      org.grpc.generated.SessionCreate.SessionResponse> getUpdateSessionFeesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateSessionFees",
      requestType = org.grpc.generated.SessionCreate.SessionFeesRequest.class,
      responseType = org.grpc.generated.SessionCreate.SessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.grpc.generated.SessionCreate.SessionFeesRequest,
      org.grpc.generated.SessionCreate.SessionResponse> getUpdateSessionFeesMethod() {
    io.grpc.MethodDescriptor<org.grpc.generated.SessionCreate.SessionFeesRequest, org.grpc.generated.SessionCreate.SessionResponse> getUpdateSessionFeesMethod;
    if ((getUpdateSessionFeesMethod = SessionServiceGrpc.getUpdateSessionFeesMethod) == null) {
      synchronized (SessionServiceGrpc.class) {
        if ((getUpdateSessionFeesMethod = SessionServiceGrpc.getUpdateSessionFeesMethod) == null) {
          SessionServiceGrpc.getUpdateSessionFeesMethod = getUpdateSessionFeesMethod = 
              io.grpc.MethodDescriptor.<org.grpc.generated.SessionCreate.SessionFeesRequest, org.grpc.generated.SessionCreate.SessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SessionService", "updateSessionFees"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc.generated.SessionCreate.SessionFeesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc.generated.SessionCreate.SessionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SessionServiceMethodDescriptorSupplier("updateSessionFees"))
                  .build();
          }
        }
     }
     return getUpdateSessionFeesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.grpc.generated.SessionCreate.DeleteSessionRequest,
      org.grpc.generated.SessionCreate.DeleteSessionResponse> getDeleteSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteSession",
      requestType = org.grpc.generated.SessionCreate.DeleteSessionRequest.class,
      responseType = org.grpc.generated.SessionCreate.DeleteSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.grpc.generated.SessionCreate.DeleteSessionRequest,
      org.grpc.generated.SessionCreate.DeleteSessionResponse> getDeleteSessionMethod() {
    io.grpc.MethodDescriptor<org.grpc.generated.SessionCreate.DeleteSessionRequest, org.grpc.generated.SessionCreate.DeleteSessionResponse> getDeleteSessionMethod;
    if ((getDeleteSessionMethod = SessionServiceGrpc.getDeleteSessionMethod) == null) {
      synchronized (SessionServiceGrpc.class) {
        if ((getDeleteSessionMethod = SessionServiceGrpc.getDeleteSessionMethod) == null) {
          SessionServiceGrpc.getDeleteSessionMethod = getDeleteSessionMethod = 
              io.grpc.MethodDescriptor.<org.grpc.generated.SessionCreate.DeleteSessionRequest, org.grpc.generated.SessionCreate.DeleteSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SessionService", "deleteSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc.generated.SessionCreate.DeleteSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc.generated.SessionCreate.DeleteSessionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SessionServiceMethodDescriptorSupplier("deleteSession"))
                  .build();
          }
        }
     }
     return getDeleteSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.grpc.generated.SessionCreate.SessionByIdRequest,
      org.grpc.generated.SessionCreate.SessionResponse> getGetSessionByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getSessionById",
      requestType = org.grpc.generated.SessionCreate.SessionByIdRequest.class,
      responseType = org.grpc.generated.SessionCreate.SessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.grpc.generated.SessionCreate.SessionByIdRequest,
      org.grpc.generated.SessionCreate.SessionResponse> getGetSessionByIdMethod() {
    io.grpc.MethodDescriptor<org.grpc.generated.SessionCreate.SessionByIdRequest, org.grpc.generated.SessionCreate.SessionResponse> getGetSessionByIdMethod;
    if ((getGetSessionByIdMethod = SessionServiceGrpc.getGetSessionByIdMethod) == null) {
      synchronized (SessionServiceGrpc.class) {
        if ((getGetSessionByIdMethod = SessionServiceGrpc.getGetSessionByIdMethod) == null) {
          SessionServiceGrpc.getGetSessionByIdMethod = getGetSessionByIdMethod = 
              io.grpc.MethodDescriptor.<org.grpc.generated.SessionCreate.SessionByIdRequest, org.grpc.generated.SessionCreate.SessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SessionService", "getSessionById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc.generated.SessionCreate.SessionByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc.generated.SessionCreate.SessionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SessionServiceMethodDescriptorSupplier("getSessionById"))
                  .build();
          }
        }
     }
     return getGetSessionByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SessionServiceStub newStub(io.grpc.Channel channel) {
    return new SessionServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SessionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SessionServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SessionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SessionServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SessionServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sessionCreate(org.grpc.generated.SessionCreate.SessionRequest request,
        io.grpc.stub.StreamObserver<org.grpc.generated.SessionCreate.SessionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSessionCreateMethod(), responseObserver);
    }

    /**
     */
    public void getSessions(org.grpc.generated.SessionCreate.GetSessionRequest request,
        io.grpc.stub.StreamObserver<org.grpc.generated.SessionCreate.GetSessionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSessionsMethod(), responseObserver);
    }

    /**
     */
    public void updateSessionName(org.grpc.generated.SessionCreate.SessionNameRequest request,
        io.grpc.stub.StreamObserver<org.grpc.generated.SessionCreate.SessionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateSessionNameMethod(), responseObserver);
    }

    /**
     */
    public void updateSessionTimings(org.grpc.generated.SessionCreate.SessionTimingRequest request,
        io.grpc.stub.StreamObserver<org.grpc.generated.SessionCreate.SessionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateSessionTimingsMethod(), responseObserver);
    }

    /**
     */
    public void updateSessionFees(org.grpc.generated.SessionCreate.SessionFeesRequest request,
        io.grpc.stub.StreamObserver<org.grpc.generated.SessionCreate.SessionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateSessionFeesMethod(), responseObserver);
    }

    /**
     */
    public void deleteSession(org.grpc.generated.SessionCreate.DeleteSessionRequest request,
        io.grpc.stub.StreamObserver<org.grpc.generated.SessionCreate.DeleteSessionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteSessionMethod(), responseObserver);
    }

    /**
     */
    public void getSessionById(org.grpc.generated.SessionCreate.SessionByIdRequest request,
        io.grpc.stub.StreamObserver<org.grpc.generated.SessionCreate.SessionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSessionByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSessionCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.grpc.generated.SessionCreate.SessionRequest,
                org.grpc.generated.SessionCreate.SessionResponse>(
                  this, METHODID_SESSION_CREATE)))
          .addMethod(
            getGetSessionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.grpc.generated.SessionCreate.GetSessionRequest,
                org.grpc.generated.SessionCreate.GetSessionResponse>(
                  this, METHODID_GET_SESSIONS)))
          .addMethod(
            getUpdateSessionNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.grpc.generated.SessionCreate.SessionNameRequest,
                org.grpc.generated.SessionCreate.SessionResponse>(
                  this, METHODID_UPDATE_SESSION_NAME)))
          .addMethod(
            getUpdateSessionTimingsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.grpc.generated.SessionCreate.SessionTimingRequest,
                org.grpc.generated.SessionCreate.SessionResponse>(
                  this, METHODID_UPDATE_SESSION_TIMINGS)))
          .addMethod(
            getUpdateSessionFeesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.grpc.generated.SessionCreate.SessionFeesRequest,
                org.grpc.generated.SessionCreate.SessionResponse>(
                  this, METHODID_UPDATE_SESSION_FEES)))
          .addMethod(
            getDeleteSessionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.grpc.generated.SessionCreate.DeleteSessionRequest,
                org.grpc.generated.SessionCreate.DeleteSessionResponse>(
                  this, METHODID_DELETE_SESSION)))
          .addMethod(
            getGetSessionByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.grpc.generated.SessionCreate.SessionByIdRequest,
                org.grpc.generated.SessionCreate.SessionResponse>(
                  this, METHODID_GET_SESSION_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class SessionServiceStub extends io.grpc.stub.AbstractStub<SessionServiceStub> {
    private SessionServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SessionServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SessionServiceStub(channel, callOptions);
    }

    /**
     */
    public void sessionCreate(org.grpc.generated.SessionCreate.SessionRequest request,
        io.grpc.stub.StreamObserver<org.grpc.generated.SessionCreate.SessionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSessionCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSessions(org.grpc.generated.SessionCreate.GetSessionRequest request,
        io.grpc.stub.StreamObserver<org.grpc.generated.SessionCreate.GetSessionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSessionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateSessionName(org.grpc.generated.SessionCreate.SessionNameRequest request,
        io.grpc.stub.StreamObserver<org.grpc.generated.SessionCreate.SessionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateSessionNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateSessionTimings(org.grpc.generated.SessionCreate.SessionTimingRequest request,
        io.grpc.stub.StreamObserver<org.grpc.generated.SessionCreate.SessionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateSessionTimingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateSessionFees(org.grpc.generated.SessionCreate.SessionFeesRequest request,
        io.grpc.stub.StreamObserver<org.grpc.generated.SessionCreate.SessionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateSessionFeesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteSession(org.grpc.generated.SessionCreate.DeleteSessionRequest request,
        io.grpc.stub.StreamObserver<org.grpc.generated.SessionCreate.DeleteSessionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSessionById(org.grpc.generated.SessionCreate.SessionByIdRequest request,
        io.grpc.stub.StreamObserver<org.grpc.generated.SessionCreate.SessionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSessionByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SessionServiceBlockingStub extends io.grpc.stub.AbstractStub<SessionServiceBlockingStub> {
    private SessionServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SessionServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SessionServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.grpc.generated.SessionCreate.SessionResponse sessionCreate(org.grpc.generated.SessionCreate.SessionRequest request) {
      return blockingUnaryCall(
          getChannel(), getSessionCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.grpc.generated.SessionCreate.GetSessionResponse getSessions(org.grpc.generated.SessionCreate.GetSessionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSessionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.grpc.generated.SessionCreate.SessionResponse updateSessionName(org.grpc.generated.SessionCreate.SessionNameRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateSessionNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.grpc.generated.SessionCreate.SessionResponse updateSessionTimings(org.grpc.generated.SessionCreate.SessionTimingRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateSessionTimingsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.grpc.generated.SessionCreate.SessionResponse updateSessionFees(org.grpc.generated.SessionCreate.SessionFeesRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateSessionFeesMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.grpc.generated.SessionCreate.DeleteSessionResponse deleteSession(org.grpc.generated.SessionCreate.DeleteSessionRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.grpc.generated.SessionCreate.SessionResponse getSessionById(org.grpc.generated.SessionCreate.SessionByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSessionByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SessionServiceFutureStub extends io.grpc.stub.AbstractStub<SessionServiceFutureStub> {
    private SessionServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SessionServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SessionServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.grpc.generated.SessionCreate.SessionResponse> sessionCreate(
        org.grpc.generated.SessionCreate.SessionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSessionCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.grpc.generated.SessionCreate.GetSessionResponse> getSessions(
        org.grpc.generated.SessionCreate.GetSessionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSessionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.grpc.generated.SessionCreate.SessionResponse> updateSessionName(
        org.grpc.generated.SessionCreate.SessionNameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateSessionNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.grpc.generated.SessionCreate.SessionResponse> updateSessionTimings(
        org.grpc.generated.SessionCreate.SessionTimingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateSessionTimingsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.grpc.generated.SessionCreate.SessionResponse> updateSessionFees(
        org.grpc.generated.SessionCreate.SessionFeesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateSessionFeesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.grpc.generated.SessionCreate.DeleteSessionResponse> deleteSession(
        org.grpc.generated.SessionCreate.DeleteSessionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.grpc.generated.SessionCreate.SessionResponse> getSessionById(
        org.grpc.generated.SessionCreate.SessionByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSessionByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SESSION_CREATE = 0;
  private static final int METHODID_GET_SESSIONS = 1;
  private static final int METHODID_UPDATE_SESSION_NAME = 2;
  private static final int METHODID_UPDATE_SESSION_TIMINGS = 3;
  private static final int METHODID_UPDATE_SESSION_FEES = 4;
  private static final int METHODID_DELETE_SESSION = 5;
  private static final int METHODID_GET_SESSION_BY_ID = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SessionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SessionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SESSION_CREATE:
          serviceImpl.sessionCreate((org.grpc.generated.SessionCreate.SessionRequest) request,
              (io.grpc.stub.StreamObserver<org.grpc.generated.SessionCreate.SessionResponse>) responseObserver);
          break;
        case METHODID_GET_SESSIONS:
          serviceImpl.getSessions((org.grpc.generated.SessionCreate.GetSessionRequest) request,
              (io.grpc.stub.StreamObserver<org.grpc.generated.SessionCreate.GetSessionResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SESSION_NAME:
          serviceImpl.updateSessionName((org.grpc.generated.SessionCreate.SessionNameRequest) request,
              (io.grpc.stub.StreamObserver<org.grpc.generated.SessionCreate.SessionResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SESSION_TIMINGS:
          serviceImpl.updateSessionTimings((org.grpc.generated.SessionCreate.SessionTimingRequest) request,
              (io.grpc.stub.StreamObserver<org.grpc.generated.SessionCreate.SessionResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SESSION_FEES:
          serviceImpl.updateSessionFees((org.grpc.generated.SessionCreate.SessionFeesRequest) request,
              (io.grpc.stub.StreamObserver<org.grpc.generated.SessionCreate.SessionResponse>) responseObserver);
          break;
        case METHODID_DELETE_SESSION:
          serviceImpl.deleteSession((org.grpc.generated.SessionCreate.DeleteSessionRequest) request,
              (io.grpc.stub.StreamObserver<org.grpc.generated.SessionCreate.DeleteSessionResponse>) responseObserver);
          break;
        case METHODID_GET_SESSION_BY_ID:
          serviceImpl.getSessionById((org.grpc.generated.SessionCreate.SessionByIdRequest) request,
              (io.grpc.stub.StreamObserver<org.grpc.generated.SessionCreate.SessionResponse>) responseObserver);
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

  private static abstract class SessionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SessionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.grpc.generated.SessionCreate.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SessionService");
    }
  }

  private static final class SessionServiceFileDescriptorSupplier
      extends SessionServiceBaseDescriptorSupplier {
    SessionServiceFileDescriptorSupplier() {}
  }

  private static final class SessionServiceMethodDescriptorSupplier
      extends SessionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SessionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SessionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SessionServiceFileDescriptorSupplier())
              .addMethod(getSessionCreateMethod())
              .addMethod(getGetSessionsMethod())
              .addMethod(getUpdateSessionNameMethod())
              .addMethod(getUpdateSessionTimingsMethod())
              .addMethod(getUpdateSessionFeesMethod())
              .addMethod(getDeleteSessionMethod())
              .addMethod(getGetSessionByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
