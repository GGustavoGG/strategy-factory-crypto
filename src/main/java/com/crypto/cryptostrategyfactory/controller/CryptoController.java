package com.crypto.cryptostrategyfactory.controller;

import com.crypto.cryptostrategyfactory.model.dto.DataCryptDTO;
import com.crypto.cryptostrategyfactory.service.CryptoService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crypto")
@Slf4j
@AllArgsConstructor
public class CryptoController {

    private CryptoService cryptoService;

    @PostMapping("/encrypt")
    public ResponseEntity<DataCryptDTO> cryptData(@RequestBody DataCryptDTO dataCryptDTO){
        log.info(dataCryptDTO.getData(), dataCryptDTO.getCryptoTypeEnum().name());
        return ResponseEntity.status(HttpStatus.OK).body(cryptoService.crypt(dataCryptDTO));
    }

    @PostMapping("/decrypt")
    public ResponseEntity<DataCryptDTO> decryptData(@RequestBody DataCryptDTO dataCryptDTO){
        log.info(dataCryptDTO.getData(), dataCryptDTO.getCryptoTypeEnum().name());
        return ResponseEntity.status(HttpStatus.OK).body(cryptoService.decrypt(dataCryptDTO));
    }
}
