package code.security.jwt;

import io.jsonwebtoken.*;

import java.util.Date;
import java.util.UUID;

public class Test {
    private String signiture = "admin";


    //生成JWTToken
    @org.junit.Test
    public void jwtToken(){

        JwtBuilder builder = Jwts.builder();
        String token = builder.setHeaderParam("type", "JWT")
                .setHeaderParam("alg", "HS256")
                .claim("name", "tom")
                .claim("role", "admin")
                .setSubject("admin-test")
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 12))
                .setId(UUID.randomUUID().toString())
                .signWith(SignatureAlgorithm.HS256, signiture)
                .compact();

        System.out.println(token);


    }

    //解析Token
    @org.junit.Test
    public void Test(){
        String token = "eyJ0eXBlIjoiSldUIiwiYWxnIjoiSFMyNTYifQ.eyJuYW1lIjoidG9tIiwicm9sZSI6ImFkbWluIiwic3ViIjoiYWRtaW4tdGVzdCIsImV4cCI6MTY3OTE4NzYzNywianRpIjoiMzQzNzM0MTAtNGU3MS00MWUwLWE3NDYtN2I1NmM4YTI4ZWU1In0.6gdw6tJWwPbBV5MhSCTFmID7IHq4_O3Vmc7Dbvwlc8k";
        JwtParser parser = Jwts.parser();
        Jws<Claims> claimsJws = parser.setSigningKey(signiture).parseClaimsJws(token);
        Claims body = claimsJws.getBody();
        System.out.println(body.get("name"));
        System.out.println(body.get("role"));
        System.out.println(body.getId());
        System.out.println(body.getSubject());


    }
}
