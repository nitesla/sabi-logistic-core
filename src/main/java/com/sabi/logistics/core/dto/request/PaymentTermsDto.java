package com.sabi.logistics.core.dto.request;


import lombok.Data;

@Data
public class PaymentTermsDto {

    private Long id;

    private Long partnerAssetTypeId;

    private Integer days;

    /**
     Description: Includes 'image' and 'companyName' properties under PaymentTerms
     Date:       14/04/2022
     Author:     Afam Okonkwo
     */
    private String image;

    private String companyName;
}
