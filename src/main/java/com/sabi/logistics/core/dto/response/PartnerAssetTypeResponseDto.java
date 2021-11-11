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
public class PartnerAssetTypeResponseDto {
    //ID
    //PartnerID
    //AssetTypeID
    //Total
    //Total
    //IsActive
    private long Id;
    private long partnerId;
    private long assetTypeId;
    private int total;
    private String assetTypeName;
    private String partnerName;
    private boolean isActive;
    private LocalDateTime createdDate;

    private LocalDateTime updatedDate;

    private Long createdBy;

    private Long updatedBy;
}
