package com.crypto.cryptostrategyfactory.exception;

import com.crypto.cryptostrategyfactory.exception.exceptions.NonExistentStrategyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NonExistentStrategyException.class)
    public ResponseEntity<String> handle(NonExistentStrategyException exception) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(NonExistentStrategyException.ERRO);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<String> handle(HttpMessageNotReadableException exception) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(NonExistentStrategyException.ERRO);
    }

}

