package com.stackroute;

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
    comments = "Source: user.proto")
public final class FeedbackServiceGrpc {

  private FeedbackServiceGrpc() {}

  public static final String SERVICE_NAME = "FeedbackService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.stackroute.User.FeedbackReq,
      com.stackroute.User.FeedbackResp> getFeedbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "feedback",
      requestType = com.stackroute.User.FeedbackReq.class,
      responseType = com.stackroute.User.FeedbackResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.User.FeedbackReq,
      com.stackroute.User.FeedbackResp> getFeedbackMethod() {
    io.grpc.MethodDescriptor<com.stackroute.User.FeedbackReq, com.stackroute.User.FeedbackResp> getFeedbackMethod;
    if ((getFeedbackMethod = FeedbackServiceGrpc.getFeedbackMethod) == null) {
      synchronized (FeedbackServiceGrpc.class) {
        if ((getFeedbackMethod = FeedbackServiceGrpc.getFeedbackMethod) == null) {
          FeedbackServiceGrpc.getFeedbackMethod = getFeedbackMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.User.FeedbackReq, com.stackroute.User.FeedbackResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "FeedbackService", "feedback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.User.FeedbackReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.User.FeedbackResp.getDefaultInstance()))
                  .setSchemaDescriptor(new FeedbackServiceMethodDescriptorSupplier("feedback"))
                  .build();
          }
        }
     }
     return getFeedbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stackroute.User.getfeedbackReq,
      com.stackroute.User.getfeedbackResp> getGetFeedbackforSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getFeedbackforSession",
      requestType = com.stackroute.User.getfeedbackReq.class,
      responseType = com.stackroute.User.getfeedbackResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.stackroute.User.getfeedbackReq,
      com.stackroute.User.getfeedbackResp> getGetFeedbackforSessionMethod() {
    io.grpc.MethodDescriptor<com.stackroute.User.getfeedbackReq, com.stackroute.User.getfeedbackResp> getGetFeedbackforSessionMethod;
    if ((getGetFeedbackforSessionMethod = FeedbackServiceGrpc.getGetFeedbackforSessionMethod) == null) {
      synchronized (FeedbackServiceGrpc.class) {
        if ((getGetFeedbackforSessionMethod = FeedbackServiceGrpc.getGetFeedbackforSessionMethod) == null) {
          FeedbackServiceGrpc.getGetFeedbackforSessionMethod = getGetFeedbackforSessionMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.User.getfeedbackReq, com.stackroute.User.getfeedbackResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "FeedbackService", "getFeedbackforSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.User.getfeedbackReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.User.getfeedbackResp.getDefaultInstance()))
                  .setSchemaDescriptor(new FeedbackServiceMethodDescriptorSupplier("getFeedbackforSession"))
                  .build();
          }
        }
     }
     return getGetFeedbackforSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stackroute.User.RatingReq,
      com.stackroute.User.RatingResp> getGetRatingforSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getRatingforSession",
      requestType = com.stackroute.User.RatingReq.class,
      responseType = com.stackroute.User.RatingResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.User.RatingReq,
      com.stackroute.User.RatingResp> getGetRatingforSessionMethod() {
    io.grpc.MethodDescriptor<com.stackroute.User.RatingReq, com.stackroute.User.RatingResp> getGetRatingforSessionMethod;
    if ((getGetRatingforSessionMethod = FeedbackServiceGrpc.getGetRatingforSessionMethod) == null) {
      synchronized (FeedbackServiceGrpc.class) {
        if ((getGetRatingforSessionMethod = FeedbackServiceGrpc.getGetRatingforSessionMethod) == null) {
          FeedbackServiceGrpc.getGetRatingforSessionMethod = getGetRatingforSessionMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.User.RatingReq, com.stackroute.User.RatingResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "FeedbackService", "getRatingforSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.User.RatingReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.User.RatingResp.getDefaultInstance()))
                  .setSchemaDescriptor(new FeedbackServiceMethodDescriptorSupplier("getRatingforSession"))
                  .build();
          }
        }
     }
     return getGetRatingforSessionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FeedbackServiceStub newStub(io.grpc.Channel channel) {
    return new FeedbackServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FeedbackServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FeedbackServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FeedbackServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FeedbackServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class FeedbackServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void feedback(com.stackroute.User.FeedbackReq request,
        io.grpc.stub.StreamObserver<com.stackroute.User.FeedbackResp> responseObserver) {
      asyncUnimplementedUnaryCall(getFeedbackMethod(), responseObserver);
    }

    /**
     */
    public void getFeedbackforSession(com.stackroute.User.getfeedbackReq request,
        io.grpc.stub.StreamObserver<com.stackroute.User.getfeedbackResp> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFeedbackforSessionMethod(), responseObserver);
    }

    /**
     */
    public void getRatingforSession(com.stackroute.User.RatingReq request,
        io.grpc.stub.StreamObserver<com.stackroute.User.RatingResp> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRatingforSessionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFeedbackMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.User.FeedbackReq,
                com.stackroute.User.FeedbackResp>(
                  this, METHODID_FEEDBACK)))
          .addMethod(
            getGetFeedbackforSessionMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.stackroute.User.getfeedbackReq,
                com.stackroute.User.getfeedbackResp>(
                  this, METHODID_GET_FEEDBACKFOR_SESSION)))
          .addMethod(
            getGetRatingforSessionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.User.RatingReq,
                com.stackroute.User.RatingResp>(
                  this, METHODID_GET_RATINGFOR_SESSION)))
          .build();
    }
  }

  /**
   */
  public static final class FeedbackServiceStub extends io.grpc.stub.AbstractStub<FeedbackServiceStub> {
    private FeedbackServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FeedbackServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedbackServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FeedbackServiceStub(channel, callOptions);
    }

    /**
     */
    public void feedback(com.stackroute.User.FeedbackReq request,
        io.grpc.stub.StreamObserver<com.stackroute.User.FeedbackResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFeedbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFeedbackforSession(com.stackroute.User.getfeedbackReq request,
        io.grpc.stub.StreamObserver<com.stackroute.User.getfeedbackResp> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetFeedbackforSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRatingforSession(com.stackroute.User.RatingReq request,
        io.grpc.stub.StreamObserver<com.stackroute.User.RatingResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRatingforSessionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FeedbackServiceBlockingStub extends io.grpc.stub.AbstractStub<FeedbackServiceBlockingStub> {
    private FeedbackServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FeedbackServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedbackServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FeedbackServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.stackroute.User.FeedbackResp feedback(com.stackroute.User.FeedbackReq request) {
      return blockingUnaryCall(
          getChannel(), getFeedbackMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.stackroute.User.getfeedbackResp> getFeedbackforSession(
        com.stackroute.User.getfeedbackReq request) {
      return blockingServerStreamingCall(
          getChannel(), getGetFeedbackforSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stackroute.User.RatingResp getRatingforSession(com.stackroute.User.RatingReq request) {
      return blockingUnaryCall(
          getChannel(), getGetRatingforSessionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FeedbackServiceFutureStub extends io.grpc.stub.AbstractStub<FeedbackServiceFutureStub> {
    private FeedbackServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FeedbackServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedbackServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FeedbackServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.User.FeedbackResp> feedback(
        com.stackroute.User.FeedbackReq request) {
      return futureUnaryCall(
          getChannel().newCall(getFeedbackMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.User.RatingResp> getRatingforSession(
        com.stackroute.User.RatingReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRatingforSessionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FEEDBACK = 0;
  private static final int METHODID_GET_FEEDBACKFOR_SESSION = 1;
  private static final int METHODID_GET_RATINGFOR_SESSION = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FeedbackServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FeedbackServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FEEDBACK:
          serviceImpl.feedback((com.stackroute.User.FeedbackReq) request,
              (io.grpc.stub.StreamObserver<com.stackroute.User.FeedbackResp>) responseObserver);
          break;
        case METHODID_GET_FEEDBACKFOR_SESSION:
          serviceImpl.getFeedbackforSession((com.stackroute.User.getfeedbackReq) request,
              (io.grpc.stub.StreamObserver<com.stackroute.User.getfeedbackResp>) responseObserver);
          break;
        case METHODID_GET_RATINGFOR_SESSION:
          serviceImpl.getRatingforSession((com.stackroute.User.RatingReq) request,
              (io.grpc.stub.StreamObserver<com.stackroute.User.RatingResp>) responseObserver);
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

  private static abstract class FeedbackServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FeedbackServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.stackroute.User.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FeedbackService");
    }
  }

  private static final class FeedbackServiceFileDescriptorSupplier
      extends FeedbackServiceBaseDescriptorSupplier {
    FeedbackServiceFileDescriptorSupplier() {}
  }

  private static final class FeedbackServiceMethodDescriptorSupplier
      extends FeedbackServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FeedbackServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FeedbackServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FeedbackServiceFileDescriptorSupplier())
              .addMethod(getFeedbackMethod())
              .addMethod(getGetFeedbackforSessionMethod())
              .addMethod(getGetRatingforSessionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
