package com.Mecatronique.Faissal.service.impl;

import com.Mecatronique.Faissal.service.JWTService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;
import java.util.function.Function;
@Service
public class JWTServiceImpl implements JWTService {
    public String generateToken(UserDetails userDetails){
        return Jwts.builder().setSubject(userDetails.getUsername())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() +1000 * 60 * 24))
                .signWith(getSiginKey() , SignatureAlgorithm.HS256)
                .compact();
    }
    private <T> T extractClaim (String token, Function<Claims, T> claimsResolvers) {
        final Claims claims = extractAllClaims (token);
        return claimsResolvers.apply(claims);
    }
    public String extractUserName(String token){
        return extractClaim(token,Claims::getSubject);

    }
    private Key getSiginKey(){
        byte[] key = Decoders.BASE64.decode("413F4428472B4B625065536856605970337336763979244226452948404D6351");
        return Keys.hmacShaKeyFor(key);
    }
    private Claims extractAllClaims(String token) {
        return Jwts.parserBuilder().setSigningKey(getSiginKey()).build().parseClaimsJws(token).getBody();
    }

    public boolean isTokenValid(String token , UserDetails userDetails){
        final String username = extractUserName(token);
        return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
    }
    public boolean isTokenExpired(String token){
        return extractClaim(token, Claims::getExpiration).before(new Date());
    }
}
