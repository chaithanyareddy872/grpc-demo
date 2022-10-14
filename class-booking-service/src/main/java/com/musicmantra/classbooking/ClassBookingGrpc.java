package com.musicmantra.classbooking;

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
    comments = "Source: BookingMethods.proto")
public final class ClassBookingGrpc {

  private ClassBookingGrpc() {}

  public static final String SERVICE_NAME = "ClassBooking";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.musicmantra.classbooking.postBookingReq,
      com.musicmantra.classbooking.postBookingResp> getPostBookingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "postBooking",
      requestType = com.musicmantra.classbooking.postBookingReq.class,
      responseType = com.musicmantra.classbooking.postBookingResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.musicmantra.classbooking.postBookingReq,
      com.musicmantra.classbooking.postBookingResp> getPostBookingMethod() {
    io.grpc.MethodDescriptor<com.musicmantra.classbooking.postBookingReq, com.musicmantra.classbooking.postBookingResp> getPostBookingMethod;
    if ((getPostBookingMethod = ClassBookingGrpc.getPostBookingMethod) == null) {
      synchronized (ClassBookingGrpc.class) {
        if ((getPostBookingMethod = ClassBookingGrpc.getPostBookingMethod) == null) {
          ClassBookingGrpc.getPostBookingMethod = getPostBookingMethod = 
              io.grpc.MethodDescriptor.<com.musicmantra.classbooking.postBookingReq, com.musicmantra.classbooking.postBookingResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ClassBooking", "postBooking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.musicmantra.classbooking.postBookingReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.musicmantra.classbooking.postBookingResp.getDefaultInstance()))
                  .setSchemaDescriptor(new ClassBookingMethodDescriptorSupplier("postBooking"))
                  .build();
          }
        }
     }
     return getPostBookingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClassBookingStub newStub(io.grpc.Channel channel) {
    return new ClassBookingStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClassBookingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ClassBookingBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClassBookingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ClassBookingFutureStub(channel);
  }

  /**
   */
  public static abstract class ClassBookingImplBase implements io.grpc.BindableService {

    /**
     */
    public void postBooking(com.musicmantra.classbooking.postBookingReq request,
        io.grpc.stub.StreamObserver<com.musicmantra.classbooking.postBookingResp> responseObserver) {
      asyncUnimplementedUnaryCall(getPostBookingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPostBookingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.musicmantra.classbooking.postBookingReq,
                com.musicmantra.classbooking.postBookingResp>(
                  this, METHODID_POST_BOOKING)))
          .build();
    }
  }

  /**
   */
  public static final class ClassBookingStub extends io.grpc.stub.AbstractStub<ClassBookingStub> {
    private ClassBookingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClassBookingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClassBookingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClassBookingStub(channel, callOptions);
    }

    /**
     */
    public void postBooking(com.musicmantra.classbooking.postBookingReq request,
        io.grpc.stub.StreamObserver<com.musicmantra.classbooking.postBookingResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostBookingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ClassBookingBlockingStub extends io.grpc.stub.AbstractStub<ClassBookingBlockingStub> {
    private ClassBookingBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClassBookingBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClassBookingBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClassBookingBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.musicmantra.classbooking.postBookingResp postBooking(com.musicmantra.classbooking.postBookingReq request) {
      return blockingUnaryCall(
          getChannel(), getPostBookingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ClassBookingFutureStub extends io.grpc.stub.AbstractStub<ClassBookingFutureStub> {
    private ClassBookingFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClassBookingFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClassBookingFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClassBookingFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.musicmantra.classbooking.postBookingResp> postBooking(
        com.musicmantra.classbooking.postBookingReq request) {
      return futureUnaryCall(
          getChannel().newCall(getPostBookingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_POST_BOOKING = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ClassBookingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ClassBookingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_POST_BOOKING:
          serviceImpl.postBooking((com.musicmantra.classbooking.postBookingReq) request,
              (io.grpc.stub.StreamObserver<com.musicmantra.classbooking.postBookingResp>) responseObserver);
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

  private static abstract class ClassBookingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClassBookingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.musicmantra.classbooking.BookingMethods.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClassBooking");
    }
  }

  private static final class ClassBookingFileDescriptorSupplier
      extends ClassBookingBaseDescriptorSupplier {
    ClassBookingFileDescriptorSupplier() {}
  }

  private static final class ClassBookingMethodDescriptorSupplier
      extends ClassBookingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ClassBookingMethodDescriptorSupplier(String methodName) {
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
      synchronized (ClassBookingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClassBookingFileDescriptorSupplier())
              .addMethod(getPostBookingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
