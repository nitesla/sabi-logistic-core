package com.sabi.logistics.core.dto.request;

import com.sabi.logistics.core.enums.DriverType;
import lombok.Data;

@Data
public class DriverAssetDto {

    private Long id;
    private String name;
    private Long partnerAssetId;
    private Long driverId;
    private DriverType driverType;
    private String assestTypeName;
//    private String driverName;
//    private Long partnerId;
//    private Long partnerAssetTypeId;
}
