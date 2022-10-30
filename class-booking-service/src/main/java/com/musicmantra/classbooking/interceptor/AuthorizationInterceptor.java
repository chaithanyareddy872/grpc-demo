package com.musicmantra.classbooking.interceptor;

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

            if (!claims.getExpiration().after(Date.from(Instant.now()))) {
                status = Status.DEADLINE_EXCEEDED.withDescription("Token Expired");
                serverCall.close(status, metadata);
                return new ServerCall.Listener<>() {
                    // noop
                };
            }

            Context context=Context.current().withValue(Constants.CLIENT_TYPE_CONTEXT_KEY,claims.getAudience());

            return Contexts.interceptCall(context,serverCall,metadata,serverCallHandler);

        }

        serverCall.close(status, metadata);
        return new ServerCall.Listener<>() {
            // noop
        };
    }
}
