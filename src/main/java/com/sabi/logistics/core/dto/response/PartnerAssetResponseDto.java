package com.sabi.logistics.core.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PartnerAssetResponseDto {
    private long id;
    private String name;
    private long partnerAssetTypeId;
    private long driverId;
    private String plateNo;
    private double length;
    private double width;
    private double height;
    private double volume;
    private String contactPerson;
    private String status;
    private boolean isActive;
    private double weight;
    private long colorId;
    private boolean hasCover;
    private boolean isOwner;
    private String tonnageType;
    private long brandId;
    private String assetTypeName;
    private String partnerName;
    private Long driverAssistantId;
    private LocalDateTime createdDate;

    private LocalDateTime updatedDate;

    private Long createdBy;

    private Long updatedBy;
}
