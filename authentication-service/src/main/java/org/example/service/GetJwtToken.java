package org.example.service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.TextCodec;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.UUID;

public class GetJwtToken {

    public static String getToken(String email){
           Instant now = Instant.now();
        return Jwts.builder()
                .claim("email:", email)
                    .setSubject(email)
                    .setId(UUID.randomUUID().toString())
                    .setIssuedAt(Date.from(now))
                    .setExpiration(Date.from(now.plus(5L, ChronoUnit.MINUTES)))
                    .compact();
    }
}
