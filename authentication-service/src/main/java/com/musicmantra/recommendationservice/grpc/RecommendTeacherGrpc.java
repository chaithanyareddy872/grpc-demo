package com.musicmantra.recommendationservice.grpc;

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
    comments = "Source: recommendteacher.proto")
public final class RecommendTeacherGrpc {

  private RecommendTeacherGrpc() {}

  public static final String SERVICE_NAME = "RecommendTeacher";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.musicmantra.recommendationservice.grpc.Recommendteacher.recommendationRequest,
      com.musicmantra.recommendationservice.grpc.Recommendteacher.recommendationResponse> getGetRecommendedTeacherMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getRecommendedTeacher",
      requestType = com.musicmantra.recommendationservice.grpc.Recommendteacher.recommendationRequest.class,
      responseType = com.musicmantra.recommendationservice.grpc.Recommendteacher.recommendationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.musicmantra.recommendationservice.grpc.Recommendteacher.recommendationRequest,
      com.musicmantra.recommendationservice.grpc.Recommendteacher.recommendationResponse> getGetRecommendedTeacherMethod() {
    io.grpc.MethodDescriptor<com.musicmantra.recommendationservice.grpc.Recommendteacher.recommendationRequest, com.musicmantra.recommendationservice.grpc.Recommendteacher.recommendationResponse> getGetRecommendedTeacherMethod;
    if ((getGetRecommendedTeacherMethod = RecommendTeacherGrpc.getGetRecommendedTeacherMethod) == null) {
      synchronized (RecommendTeacherGrpc.class) {
        if ((getGetRecommendedTeacherMethod = RecommendTeacherGrpc.getGetRecommendedTeacherMethod) == null) {
          RecommendTeacherGrpc.getGetRecommendedTeacherMethod = getGetRecommendedTeacherMethod = 
              io.grpc.MethodDescriptor.<com.musicmantra.recommendationservice.grpc.Recommendteacher.recommendationRequest, com.musicmantra.recommendationservice.grpc.Recommendteacher.recommendationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "RecommendTeacher", "getRecommendedTeacher"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.musicmantra.recommendationservice.grpc.Recommendteacher.recommendationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.musicmantra.recommendationservice.grpc.Recommendteacher.recommendationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RecommendTeacherMethodDescriptorSupplier("getRecommendedTeacher"))
                  .build();
          }
        }
     }
     return getGetRecommendedTeacherMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RecommendTeacherStub newStub(io.grpc.Channel channel) {
    return new RecommendTeacherStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RecommendTeacherBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RecommendTeacherBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RecommendTeacherFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RecommendTeacherFutureStub(channel);
  }

  /**
   */
  public static abstract class RecommendTeacherImplBase implements io.grpc.BindableService {

    /**
     */
    public void getRecommendedTeacher(com.musicmantra.recommendationservice.grpc.Recommendteacher.recommendationRequest request,
        io.grpc.stub.StreamObserver<com.musicmantra.recommendationservice.grpc.Recommendteacher.recommendationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRecommendedTeacherMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetRecommendedTeacherMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.musicmantra.recommendationservice.grpc.Recommendteacher.recommendationRequest,
                com.musicmantra.recommendationservice.grpc.Recommendteacher.recommendationResponse>(
                  this, METHODID_GET_RECOMMENDED_TEACHER)))
          .build();
    }
  }

  /**
   */
  public static final class RecommendTeacherStub extends io.grpc.stub.AbstractStub<RecommendTeacherStub> {
    private RecommendTeacherStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RecommendTeacherStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecommendTeacherStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RecommendTeacherStub(channel, callOptions);
    }

    /**
     */
    public void getRecommendedTeacher(com.musicmantra.recommendationservice.grpc.Recommendteacher.recommendationRequest request,
        io.grpc.stub.StreamObserver<com.musicmantra.recommendationservice.grpc.Recommendteacher.recommendationResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetRecommendedTeacherMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RecommendTeacherBlockingStub extends io.grpc.stub.AbstractStub<RecommendTeacherBlockingStub> {
    private RecommendTeacherBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RecommendTeacherBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecommendTeacherBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RecommendTeacherBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.musicmantra.recommendationservice.grpc.Recommendteacher.recommendationResponse> getRecommendedTeacher(
        com.musicmantra.recommendationservice.grpc.Recommendteacher.recommendationRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetRecommendedTeacherMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RecommendTeacherFutureStub extends io.grpc.stub.AbstractStub<RecommendTeacherFutureStub> {
    private RecommendTeacherFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RecommendTeacherFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecommendTeacherFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RecommendTeacherFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_RECOMMENDED_TEACHER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RecommendTeacherImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RecommendTeacherImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_RECOMMENDED_TEACHER:
          serviceImpl.getRecommendedTeacher((com.musicmantra.recommendationservice.grpc.Recommendteacher.recommendationRequest) request,
              (io.grpc.stub.StreamObserver<com.musicmantra.recommendationservice.grpc.Recommendteacher.recommendationResponse>) responseObserver);
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

  private static abstract class RecommendTeacherBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RecommendTeacherBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.musicmantra.recommendationservice.grpc.Recommendteacher.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RecommendTeacher");
    }
  }

  private static final class RecommendTeacherFileDescriptorSupplier
      extends RecommendTeacherBaseDescriptorSupplier {
    RecommendTeacherFileDescriptorSupplier() {}
  }

  private static final class RecommendTeacherMethodDescriptorSupplier
      extends RecommendTeacherBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RecommendTeacherMethodDescriptorSupplier(String methodName) {
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
      synchronized (RecommendTeacherGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RecommendTeacherFileDescriptorSupplier())
              .addMethod(getGetRecommendedTeacherMethod())
              .build();
        }
      }
    }
    return result;
  }
}
