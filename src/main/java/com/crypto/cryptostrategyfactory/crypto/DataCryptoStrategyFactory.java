package com.crypto.cryptostrategyfactory.crypto;

import com.crypto.cryptostrategyfactory.exception.exceptions.NonExistentStrategyException;
import com.crypto.cryptostrategyfactory.model.enums.CryptoTypeEnum;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DataCryptoStrategyFactory {

    List<CryptoStrategy> strategyList;

    public CryptoStrategy getStrategy(CryptoTypeEnum cryptoTypeEnum) {
        return strategyList.stream().filter(strategy -> strategy.find(cryptoTypeEnum)).findFirst().orElseThrow(NonExistentStrategyException::new);
    }
}
