package com.sabi.logistics.core.dto.request;


import lombok.Data;

@Data
public class PartnerBankDto {

    private Long id;

    private Long partnerId;

    private Long bankId;

    private String accountNumber;
}
