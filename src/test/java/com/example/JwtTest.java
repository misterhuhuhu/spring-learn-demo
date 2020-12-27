package com.example;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class JwtTest {

    //生成token
    @Test
    void Test1() throws UnsupportedEncodingException {

        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.HOUR, 10);
        final String signal = "%^*&^*&^1";
        Map<String, Object> header = new HashMap<>();
        JWT.create()
                .withHeader(header)//设置head
                .withClaim("userName", "小明")//设置payload
                .withClaim("password", "123")
                .withExpiresAt(instance.getTime())//设置过期时间
                .sign(Algorithm.HMAC256(signal));//设置签名
    }

    //验证token
    @Test
    void Test2() throws UnsupportedEncodingException {
        final String token="12312412313";
        JWTVerifier jwtVerifier=JWT
                .require(Algorithm.HMAC256("123134@!#"))//设置签名
                .build();
        DecodedJWT verify = jwtVerifier.verify(token);//验证token

//        verify.getHeader();//获取head
//        verify.getPayload();//获取payload
        /*
        * 注意： 使用什么类型的值存储，就是用什么类型的取值
        * */
        String userName = verify.getClaim("userName").asString();//获取userName
        String password = verify.getClaim("password").asString();//获取password

//        throw new SignatureVerificationException();//无效签名
//        throw new TokenExpiredException();//token过期
//        throw new AlgorithmMismatchException();//token算法不一致
//        throw new SignatureVerificationException();//无效签名

    }

}
