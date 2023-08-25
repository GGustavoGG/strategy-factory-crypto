package com.crypto.cryptostrategyfactory.crypto;

import com.crypto.cryptostrategyfactory.model.enums.CryptoTypeEnum;

public interface CryptoStrategy {

    String crypt(String data);

    String decrypt(String data);

    boolean find(CryptoTypeEnum cryptoStrategy);
}
