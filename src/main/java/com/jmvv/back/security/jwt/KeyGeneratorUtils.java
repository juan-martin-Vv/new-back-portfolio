package com.jmvv.back.security.jwt;

import java.security.KeyPair;
import java.security.KeyPairGenerator;

import org.springframework.stereotype.Component;


@Component
final class KeyGeneratorUtils {
    private KeyGeneratorUtils (){}
    static KeyPair generatorRsaKey() {
        KeyPair keyPair;
        try {
            KeyPairGenerator keyPairGenerator= KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048);
            keyPair = keyPairGenerator.generateKeyPair();
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
        System.out.println(keyPair.getPublic());
        return keyPair;
    }
}
