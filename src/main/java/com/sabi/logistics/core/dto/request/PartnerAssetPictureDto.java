package com.sabi.logistics.core.dto.request;

import lombok.Data;

@Data
public class PartnerAssetPictureDto {


    private Long id;
    private Long partnerAssetId;
    private String pictureType;
    private String image;
}
