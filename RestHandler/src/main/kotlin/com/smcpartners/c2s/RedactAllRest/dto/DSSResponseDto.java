package com.smcpartners.c2s.RedactAllRest.dto;

public class DSSResponseDto {

    private byte[] segmentedDocument;
    private byte[] tryPolicyDocument;
    private String encoding;
    private boolean isCCDADocument;

    public DSSResponseDto(byte[] segmentedDocument, byte[] tryPolicyDocument, String encoding, boolean isCCDADocument) {
        this.segmentedDocument = segmentedDocument;
        this.tryPolicyDocument = tryPolicyDocument;
        this.encoding = encoding;
        this.isCCDADocument = isCCDADocument;
    }

    public byte[] getSegmentedDocument() {
        return segmentedDocument;
    }

    public void setSegmentedDocument(byte[] segmentedDocument) {
        this.segmentedDocument = segmentedDocument;
    }

    public byte[] getTryPolicyDocument() {
        return tryPolicyDocument;
    }

    public void setTryPolicyDocument(byte[] tryPolicyDocument) {
        this.tryPolicyDocument = tryPolicyDocument;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public boolean isCCDADocument() {
        return isCCDADocument;
    }

    public void setCCDADocument(boolean CCDADocument) {
        isCCDADocument = CCDADocument;
    }
}
