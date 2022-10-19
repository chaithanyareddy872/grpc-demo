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

        if (auth_token == null) {
            throw new StatusRuntimeException(Status.UNAVAILABLE);
        }

        Claims claims = Jwts.parser()
                .setSigningKey(DatatypeConverter.parseBase64Binary("Yn2kjibddFAWtnPJ2AFlL8WXmohJMCvigQggaEypa5E="))
                .parseClaimsJws(auth_token)
                .getBody();

        System.out.println(claims.getExpiration().after(Date.from(Instant.now())));

        if (!claims.getAudience().equals("student")) {
            throw new StatusRuntimeException(Status.PERMISSION_DENIED);
        } else if (!claims.getExpiration().after(Date.from(Instant.now()))) {
            throw new StatusRuntimeException(Status.DEADLINE_EXCEEDED);
        }

        return serverCallHandler.startCall(serverCall, metadata);

    }
}

