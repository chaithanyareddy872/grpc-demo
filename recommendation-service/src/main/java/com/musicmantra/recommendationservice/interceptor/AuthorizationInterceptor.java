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

        final String auth_token=metadata.get(Metadata.Key.of("Authorization",Metadata.ASCII_STRING_MARSHALLER));

        Claims claims= Jwts.parser()
                .setSigningKey(DatatypeConverter.parseBase64Binary("Yn2kjibddFAWtnPJ2AFlL8WXmohJMCvigQggaEypa5E="))
                .parseClaimsJws(auth_token)
                .getBody();

        if(!claims.getAudience().equals("student") && !claims.getExpiration().before(Date.from(Instant.now()))){
            throw new StatusRuntimeException(Status.PERMISSION_DENIED);
        }
        return serverCallHandler.startCall(serverCall,metadata);
    }
}
