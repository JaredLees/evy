package com.evy.core.utils;

import com.evy.core.sandbox.TenantConstants;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Date;

/**
 * @author Jonny
 * @Description:
 * @date 2018/4/10下午5:18
 */
public class JWTUtil {
    /**
     * 解析jwt
     */
    public static Claims parseJWT(String jsonWebToken, String base64Security){
        try
        {
            Claims claims = Jwts.parser()
                    .setSigningKey(DatatypeConverter.parseBase64Binary(base64Security))
                    .parseClaimsJws(jsonWebToken).getBody();
            return claims;
        }
        catch(Exception ex)
        {
            return null;
        }
    }

    /**
     * 构建jwt
     * @param userId 用户id
     * @param clientId
     * @param issuer
     * @param TTLMillis 过期时间
     * @param base64Security base64密码
     * @return
     */
    public static String createJWT(long dbid,
                                   String userId,
                                   String clientId,
                                   String issuer,
                                   long TTLMillis,
                                   String base64Security)
    {
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);

        //生成签名密钥
        byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(base64Security);
        Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());

        //添加构成JWT的参数
        JwtBuilder builder = Jwts.builder().setHeaderParam("type", "jwtToken")
                .claim(TenantConstants.TENANT_ID, dbid)
                .claim(TenantConstants.USER_ID, userId)
                .setIssuer(issuer)
                .setAudience(clientId)
                .signWith(signatureAlgorithm, signingKey);
        //添加Token过期时间
        if (TTLMillis >= 0) {
            long expMillis = nowMillis + TTLMillis;
            Date exp = new Date(expMillis);
            builder.setExpiration(exp).setNotBefore(now);
        }

        //生成JWT
        return builder.compact();
    }
}
