package com.smcpartners.c2s.RedactAllRest.dto;

public class RedactAllResponseDto {
    private byte[] document;

    public RedactAllResponseDto(byte[] document){
        this.document = document;
    }

    public byte[] getDocument() {
        return document;
    }

    public void setDocument(byte[] document) {
        this.document = document;
    }
}
