package br.com.aquila.jwt.security;

public class SecurityConstants {
    public static final String SECRET = "SecretKeyToGenJTWs";
    public static final long EXPIRATION_TIME = 864_000_000; // 10 dias
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/login";
    public static final String STATUS_URL = "/status"; 
}
