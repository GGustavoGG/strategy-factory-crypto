package com.crypto.cryptostrategyfactory.crypto.impl;

import com.crypto.cryptostrategyfactory.crypto.CryptoStrategy;
import com.crypto.cryptostrategyfactory.model.enums.CryptoTypeEnum;
import org.springframework.stereotype.Component;

@Component
public class DefaultStrategy implements CryptoStrategy {
    @Override
    public String crypt(String data) {
        return data;
    }

    @Override
    public String decrypt(String data) {
        return data;
    }

    @Override
    public boolean find(CryptoTypeEnum cryptoStrategy) {
        return CryptoTypeEnum.DEFAULT.equals(cryptoStrategy);
    }
}
