package com.crypto.cryptostrategyfactory.crypto.impl;

import com.crypto.cryptostrategyfactory.crypto.CryptoStrategy;
import com.crypto.cryptostrategyfactory.model.enums.CryptoTypeEnum;
import org.springframework.stereotype.Component;

import javax.crypto.*;

@Component
public class CaesarCipherStrategy implements CryptoStrategy {

    private static final int SHIFT = 3;

    @Override
    public String crypt(String data) {
        return encrypt(data, SHIFT);
    }

    @Override
    public String decrypt(String data) {
        return encrypt(data, 26 - SHIFT);
    }

    @Override
    public boolean find(CryptoTypeEnum cryptoStrategy) {
        return CryptoTypeEnum.CAESAR_CIPHER_CRYPTO.equals(cryptoStrategy);
    }

    public static String encrypt(String plaintext, int shift) {
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < plaintext.length(); i++) {
            char c = plaintext.charAt(i);
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                c = (char) (base + (c - base + shift) % 26);
            }
            encryptedText.append(c);
        }

        return encryptedText.toString();
    }
}
