package com.crypto.cryptostrategyfactory.service;

import com.crypto.cryptostrategyfactory.crypto.DataCryptoStrategyFactory;
import com.crypto.cryptostrategyfactory.model.dto.DataCryptDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CryptoService {

    private DataCryptoStrategyFactory dataCryptoStrategyFactory;

    public DataCryptDTO crypt(DataCryptDTO dataToCrypt) {
        String encryptData = dataCryptoStrategyFactory.getStrategy(dataToCrypt.getCryptoTypeEnum()).crypt(dataToCrypt.getData());
        return new DataCryptDTO(encryptData, dataToCrypt.getCryptoTypeEnum());
    }

    public DataCryptDTO decrypt(DataCryptDTO dataToCrypt) {
        String encryptData = dataCryptoStrategyFactory.getStrategy(dataToCrypt.getCryptoTypeEnum()).decrypt(dataToCrypt.getData());
        return new DataCryptDTO(encryptData, dataToCrypt.getCryptoTypeEnum());
    }
}
