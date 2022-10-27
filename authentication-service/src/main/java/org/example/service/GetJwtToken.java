package org.example.service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.TextCodec;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class GetJwtToken {

    public static String getToken(String email,int id,String role) {
        Instant now = Instant.now();
        return Jwts.builder()
                .setId(String.valueOf(id))
                .setSubject(email)
                .setAudience(role)
                .setIssuedAt(Date.from(now))
                .setExpiration(Date.from(now.plus(5, ChronoUnit.MINUTES)))
                .signWith(
                        SignatureAlgorithm.HS256,
                        TextCodec.BASE64.decode("Yn2kjibddFAWtnPJ2AFlL8WXmohJMCvigQggaEypa5E=")
                )
                .compact();
    }
}
