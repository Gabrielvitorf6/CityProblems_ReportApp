package com.unipaulistana.CityProblemsReportApp.infrastructure.config;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;

@Component
public class JwtHelper {
    private final String SECRET = "CHAVE FODA PRA KRL ABSURDA";
    private final int TOKEN_EXPIRATION_MS = 1000*60*60*24*2;

    public String generateToken(UserDetails userDetails) {
        return Jwts.builder().setSubject(userDetails.getUsername())
                .setIssuedAt(new Date()).setExpiration(new Date(System.currentTimeMillis() + TOKEN_EXPIRATION_MS))
                .signWith(this.getSigningKey()).compact(); //geralmente temos uma função que termina
        // o build e gera um objeto, nessa api é compact
    }

    public String extractUsername(String token){
        return Jwts.parserBuilder().setSigningKey(this.getSigningKey())
                .build()
                .parseClaimsJws(token).getBody().getSubject();
    }
    public boolean isTokenExpired(String token, UserDetails userDetails) {
        return Jwts.parserBuilder()
                .setSigningKey(this.getSigningKey())
                .build()
                .parseClaimsJws(token)
                .getBody()
                .getExpiration()
                .before(new Date());
    }
    private Key getSigningKey() {
        return Keys.hmacShaKeyFor(SECRET.getBytes());
    }
    public boolean validateToken(String token, UserDetails userDetails) {
        final String username = this.extractUsername(token);
        return username.equals(userDetails.getUsername())
                && !isTokenExpired(token, userDetails);
    }

}
