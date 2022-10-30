package com.musicmantra.recommendationservice.interceptor;

import io.grpc.*;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

import javax.xml.bind.DatatypeConverter;
import java.time.Instant;
import java.util.Date;

public class AuthorizationInterceptor implements ServerInterceptor {

    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> serverCall, Metadata metadata, ServerCallHandler<ReqT, RespT> serverCallHandler) {

        final String auth_token = metadata.get(Metadata.Key.of("Authorization", Metadata.ASCII_STRING_MARSHALLER));
        Status status = null;

        if (auth_token == null) {
            status = Status.UNAUTHENTICATED.withDescription("Authorization token is missing");
        } else {
            Claims claims = Jwts.parser()
                    .setSigningKey(DatatypeConverter.parseBase64Binary("Yn2kjibddFAWtnPJ2AFlL8WXmohJMCvigQggaEypa5E="))
                    .parseClaimsJws(auth_token)
                    .getBody();
            if (!claims.getAudience().equals("student")) {
                status = Status.PERMISSION_DENIED.withDescription("Permission Denied");
                serverCall.close(status, metadata);
                return new ServerCall.Listener<>() {
                    // noop
                };
            } else if (!claims.getExpiration().after(Date.from(Instant.now()))) {
                status = Status.DEADLINE_EXCEEDED.withDescription("Token Expired");
                serverCall.close(status, metadata);
                return new ServerCall.Listener<>() {
                    // noop
                };
            }

            return serverCallHandler.startCall(serverCall, metadata);

        }

        serverCall.close(status, metadata);
        return new ServerCall.Listener<>() {
            // noop
        };
    }
}

