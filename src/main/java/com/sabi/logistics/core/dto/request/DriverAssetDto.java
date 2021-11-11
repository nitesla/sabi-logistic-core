package com.sabi.logistics.core.dto.request;

import lombok.Data;

@Data
public class DriverAssetDto {

    private Long id;
    private String name;
    private Long partnerAssetId;
    private Long driverId;
    private Long partnerId;
    private Long partnerAssetTypeId;
}
