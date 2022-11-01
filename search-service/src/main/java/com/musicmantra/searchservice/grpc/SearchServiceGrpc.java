package com.musicmantra.searchservice.grpc;

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
    comments = "Source: SearchService.proto")
public final class SearchServiceGrpc {

  private SearchServiceGrpc() {}

  public static final String SERVICE_NAME = "SearchService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchRequest,
      com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "search",
      requestType = com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchRequest.class,
      responseType = com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchRequest,
      com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse> getSearchMethod() {
    io.grpc.MethodDescriptor<com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchRequest, com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse> getSearchMethod;
    if ((getSearchMethod = SearchServiceGrpc.getSearchMethod) == null) {
      synchronized (SearchServiceGrpc.class) {
        if ((getSearchMethod = SearchServiceGrpc.getSearchMethod) == null) {
          SearchServiceGrpc.getSearchMethod = getSearchMethod = 
              io.grpc.MethodDescriptor.<com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchRequest, com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SearchService", "search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SearchServiceMethodDescriptorSupplier("search"))
                  .build();
          }
        }
     }
     return getSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchGenreInstrumentRequest,
      com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse> getSearchByGenreInstrumentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "searchByGenreInstrument",
      requestType = com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchGenreInstrumentRequest.class,
      responseType = com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchGenreInstrumentRequest,
      com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse> getSearchByGenreInstrumentMethod() {
    io.grpc.MethodDescriptor<com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchGenreInstrumentRequest, com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse> getSearchByGenreInstrumentMethod;
    if ((getSearchByGenreInstrumentMethod = SearchServiceGrpc.getSearchByGenreInstrumentMethod) == null) {
      synchronized (SearchServiceGrpc.class) {
        if ((getSearchByGenreInstrumentMethod = SearchServiceGrpc.getSearchByGenreInstrumentMethod) == null) {
          SearchServiceGrpc.getSearchByGenreInstrumentMethod = getSearchByGenreInstrumentMethod = 
              io.grpc.MethodDescriptor.<com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchGenreInstrumentRequest, com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SearchService", "searchByGenreInstrument"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchGenreInstrumentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SearchServiceMethodDescriptorSupplier("searchByGenreInstrument"))
                  .build();
          }
        }
     }
     return getSearchByGenreInstrumentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.musicmantra.searchservice.grpc.SearchServiceOuterClass.serachFeeRequest,
      com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse> getSearchByFeesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "searchByFees",
      requestType = com.musicmantra.searchservice.grpc.SearchServiceOuterClass.serachFeeRequest.class,
      responseType = com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.musicmantra.searchservice.grpc.SearchServiceOuterClass.serachFeeRequest,
      com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse> getSearchByFeesMethod() {
    io.grpc.MethodDescriptor<com.musicmantra.searchservice.grpc.SearchServiceOuterClass.serachFeeRequest, com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse> getSearchByFeesMethod;
    if ((getSearchByFeesMethod = SearchServiceGrpc.getSearchByFeesMethod) == null) {
      synchronized (SearchServiceGrpc.class) {
        if ((getSearchByFeesMethod = SearchServiceGrpc.getSearchByFeesMethod) == null) {
          SearchServiceGrpc.getSearchByFeesMethod = getSearchByFeesMethod = 
              io.grpc.MethodDescriptor.<com.musicmantra.searchservice.grpc.SearchServiceOuterClass.serachFeeRequest, com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SearchService", "searchByFees"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.musicmantra.searchservice.grpc.SearchServiceOuterClass.serachFeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SearchServiceMethodDescriptorSupplier("searchByFees"))
                  .build();
          }
        }
     }
     return getSearchByFeesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchCityRequest,
      com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse> getSearchByCityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "searchByCity",
      requestType = com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchCityRequest.class,
      responseType = com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchCityRequest,
      com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse> getSearchByCityMethod() {
    io.grpc.MethodDescriptor<com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchCityRequest, com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse> getSearchByCityMethod;
    if ((getSearchByCityMethod = SearchServiceGrpc.getSearchByCityMethod) == null) {
      synchronized (SearchServiceGrpc.class) {
        if ((getSearchByCityMethod = SearchServiceGrpc.getSearchByCityMethod) == null) {
          SearchServiceGrpc.getSearchByCityMethod = getSearchByCityMethod = 
              io.grpc.MethodDescriptor.<com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchCityRequest, com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SearchService", "searchByCity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchCityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SearchServiceMethodDescriptorSupplier("searchByCity"))
                  .build();
          }
        }
     }
     return getSearchByCityMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SearchServiceStub newStub(io.grpc.Channel channel) {
    return new SearchServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SearchServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SearchServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SearchServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SearchServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SearchServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void search(com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchRequest request,
        io.grpc.stub.StreamObserver<com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     */
    public void searchByGenreInstrument(com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchGenreInstrumentRequest request,
        io.grpc.stub.StreamObserver<com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchByGenreInstrumentMethod(), responseObserver);
    }

    /**
     */
    public void searchByFees(com.musicmantra.searchservice.grpc.SearchServiceOuterClass.serachFeeRequest request,
        io.grpc.stub.StreamObserver<com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchByFeesMethod(), responseObserver);
    }

    /**
     */
    public void searchByCity(com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchCityRequest request,
        io.grpc.stub.StreamObserver<com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchByCityMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSearchMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchRequest,
                com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse>(
                  this, METHODID_SEARCH)))
          .addMethod(
            getSearchByGenreInstrumentMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchGenreInstrumentRequest,
                com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse>(
                  this, METHODID_SEARCH_BY_GENRE_INSTRUMENT)))
          .addMethod(
            getSearchByFeesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.musicmantra.searchservice.grpc.SearchServiceOuterClass.serachFeeRequest,
                com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse>(
                  this, METHODID_SEARCH_BY_FEES)))
          .addMethod(
            getSearchByCityMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchCityRequest,
                com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse>(
                  this, METHODID_SEARCH_BY_CITY)))
          .build();
    }
  }

  /**
   */
  public static final class SearchServiceStub extends io.grpc.stub.AbstractStub<SearchServiceStub> {
    private SearchServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SearchServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SearchServiceStub(channel, callOptions);
    }

    /**
     */
    public void search(com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchRequest request,
        io.grpc.stub.StreamObserver<com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchByGenreInstrument(com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchGenreInstrumentRequest request,
        io.grpc.stub.StreamObserver<com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSearchByGenreInstrumentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchByFees(com.musicmantra.searchservice.grpc.SearchServiceOuterClass.serachFeeRequest request,
        io.grpc.stub.StreamObserver<com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSearchByFeesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchByCity(com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchCityRequest request,
        io.grpc.stub.StreamObserver<com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSearchByCityMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SearchServiceBlockingStub extends io.grpc.stub.AbstractStub<SearchServiceBlockingStub> {
    private SearchServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SearchServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SearchServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse> search(
        com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse> searchByGenreInstrument(
        com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchGenreInstrumentRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSearchByGenreInstrumentMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse> searchByFees(
        com.musicmantra.searchservice.grpc.SearchServiceOuterClass.serachFeeRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSearchByFeesMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse> searchByCity(
        com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchCityRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSearchByCityMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SearchServiceFutureStub extends io.grpc.stub.AbstractStub<SearchServiceFutureStub> {
    private SearchServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SearchServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SearchServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SEARCH = 0;
  private static final int METHODID_SEARCH_BY_GENRE_INSTRUMENT = 1;
  private static final int METHODID_SEARCH_BY_FEES = 2;
  private static final int METHODID_SEARCH_BY_CITY = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SearchServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SearchServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH:
          serviceImpl.search((com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchRequest) request,
              (io.grpc.stub.StreamObserver<com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse>) responseObserver);
          break;
        case METHODID_SEARCH_BY_GENRE_INSTRUMENT:
          serviceImpl.searchByGenreInstrument((com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchGenreInstrumentRequest) request,
              (io.grpc.stub.StreamObserver<com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse>) responseObserver);
          break;
        case METHODID_SEARCH_BY_FEES:
          serviceImpl.searchByFees((com.musicmantra.searchservice.grpc.SearchServiceOuterClass.serachFeeRequest) request,
              (io.grpc.stub.StreamObserver<com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse>) responseObserver);
          break;
        case METHODID_SEARCH_BY_CITY:
          serviceImpl.searchByCity((com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchCityRequest) request,
              (io.grpc.stub.StreamObserver<com.musicmantra.searchservice.grpc.SearchServiceOuterClass.searchResponse>) responseObserver);
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

  private static abstract class SearchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SearchServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.musicmantra.searchservice.grpc.SearchServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SearchService");
    }
  }

  private static final class SearchServiceFileDescriptorSupplier
      extends SearchServiceBaseDescriptorSupplier {
    SearchServiceFileDescriptorSupplier() {}
  }

  private static final class SearchServiceMethodDescriptorSupplier
      extends SearchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SearchServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SearchServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SearchServiceFileDescriptorSupplier())
              .addMethod(getSearchMethod())
              .addMethod(getSearchByGenreInstrumentMethod())
              .addMethod(getSearchByFeesMethod())
              .addMethod(getSearchByCityMethod())
              .build();
        }
      }
    }
    return result;
  }
}
