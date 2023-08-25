package com.crypto.cryptostrategyfactory.model.dto;

import com.crypto.cryptostrategyfactory.model.enums.CryptoTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class DataCryptDTO implements Serializable {

    private String data;

    private CryptoTypeEnum cryptoTypeEnum;
}
