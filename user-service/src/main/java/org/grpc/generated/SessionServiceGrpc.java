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
  }

  private static final int METHODID_SESSION_CREATE = 0;
  private static final int METHODID_GET_SESSIONS = 1;

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
              .build();
        }
      }
    }
    return result;
  }
}
