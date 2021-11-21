package com.sabi.logistics.core.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sabi.logistics.core.enums.DriverType;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DriverAssetResponseDto {

    private Long id;
    private String name;
    private Long partnerAssetId;
    private String partnerAssetName;
//    private Long partnerId;
    private String partnerName;
//    private Long partnerAssetTypeId;
    private String assetTypeName;
    private Long driverId;
    private String driverName;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private DriverType driverType;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;
}
