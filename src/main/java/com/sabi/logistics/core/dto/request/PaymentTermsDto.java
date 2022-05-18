package com.sabi.logistics.core.dto.request;


import lombok.Data;

@Data
public class PaymentTermsDto {

    private Long id;

    private Long partnerAssetTypeId;

    private Integer days;

    /**
     Description: Includes 'image' property from PaymentTerms
     Date:       17/05/2022
     Author:     Afam Okonkwo
     */
    private String companyName;
}
