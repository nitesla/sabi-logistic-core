package com.sabi.logistics.core.dto.response;

import com.sabi.logistics.core.models.PartnerAssetPicture;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PartnerAssetResponseDto {
    private Long id;
    private String name;
    private Long partnerAssetTypeId;
    private Long driverId;
    private String driverName;
    private String plateNo;
    private Double length;
    private Double width;
    private Double height;
    private Double volume;
    private String contactPerson;
    private String status;
    private Boolean isActive;
    private Double weight;
    private Long colorId;
    private String colorName;
    private Boolean hasCover;
    private Boolean isOwner;
    private String tonnageType;
    private Long brandId;
    private String brandName;
    private String assetTypeName;
    private String partnerName;
    private Long driverAssistantId;
    private String driverAssistantName;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private List<PartnerAssetPicture> partnerAssetPictures;
}
