package com.sabi.logistics.core.dto.request;

import lombok.Data;

@Data
public class DriverDto {

    private Long id;
    private String name;
    private Long partnerAssetId;
    private Long userId;
}
