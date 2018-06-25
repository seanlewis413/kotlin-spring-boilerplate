package com.smcpartners.c2s.RedactAllRest.dto;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

@Data
@ToString(exclude = "document")
public class DSSRequestDto {

    @NotNull
    protected XacmlResult xacmlResult;

//    protected boolean audited = false;
//
//    protected boolean auditFailureByPass = false;
//
//    protected boolean enableTryPolicyResponse = false;

    @NotEmpty
    private byte[] document;

    @NotBlank
    private String documentEncoding = "UTF-8";

    public DSSRequestDto(XacmlResult xacmlResult, byte[] document) {
//        this.audited = false;
//        this.auditFailureByPass = false;
//        this.enableTryPolicyResponse = false;
        this.xacmlResult = xacmlResult;
        this.document = document;
    }
}