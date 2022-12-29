package com.jmvv.back.security.jwt;

import java.security.KeyPair;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.UUID;

import com.nimbusds.jose.jwk.RSAKey;

public class Jwks {
    private Jwks(){};
    public static RSAKey generatorRsaKey() {
        KeyPair keyPair = KeyGeneratorUtils.generatorRsaKey();
        RSAPublicKey rsaPublicKey=(RSAPublicKey) keyPair.getPublic();
        RSAPrivateKey rsaPrivateKey = (RSAPrivateKey)keyPair.getPrivate();
        return new RSAKey
                    .Builder(rsaPublicKey)
                    .privateKey(rsaPrivateKey)
                    .keyID(UUID.randomUUID().toString())
                    .build();
    }
}
