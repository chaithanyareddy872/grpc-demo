package org.example.utility;

import io.grpc.CallCredentials;
import io.grpc.Metadata;
import io.grpc.Status;

import java.util.concurrent.Executor;

import static io.grpc.Metadata.ASCII_STRING_MARSHALLER;

public class BearerToken extends CallCredentials {

    private String token;

    public BearerToken(String token) {
        this.token = token;
    }

    @Override
    public void applyRequestMetadata(RequestInfo requestInfo, Executor executor, MetadataApplier metadataApplier) {
        executor.execute(()->{
            try {
                Metadata headers=new Metadata();
                headers.put(Metadata.Key.of("Authorization", ASCII_STRING_MARSHALLER),token);
                metadataApplier.apply(headers);
            }catch (Throwable e){
                metadataApplier.fail(Status.UNAUTHENTICATED.withCause(e));
            }
        });
    }

    @Override
    public void thisUsesUnstableApi() {

    }
}
