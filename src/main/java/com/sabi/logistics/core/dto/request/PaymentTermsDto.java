package com.sabi.logistics.core.dto.request;


import lombok.Data;

@Data
public class PaymentTermsDto {

    private Long id;

    private Long partnerAssetTypeId;

    private Integer days;
}
