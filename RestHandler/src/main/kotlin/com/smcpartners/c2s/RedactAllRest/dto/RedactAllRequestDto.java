package com.smcpartners.c2s.RedactAllRest.dto;

import java.util.Optional;

public class RedactAllRequestDto {
    private byte[] document;
    private Optional<String> homeCommunityId = Optional.empty();
    private Optional<String> messageId = Optional.empty();

    public RedactAllRequestDto(byte[] document, Optional<String> homeCommunityId, Optional<String> messageId){
        this.document = document;
        this.homeCommunityId = homeCommunityId;
        this.messageId = messageId;

    }

    public byte[] getDocument() {
        return document;
    }

    public void setDocument(byte[] document) {
        this.document = document;
    }

    public Optional<String> getHomeCommunityId() {
        return homeCommunityId;
    }

    public void setHomeCommunityId(Optional<String> homeCommunityId) {
        this.homeCommunityId = homeCommunityId;
    }

    public Optional<String> getMessageId() {
        return messageId;
    }

    public void setMessageId(Optional<String> messageId) {
        this.messageId = messageId;
    }
}
