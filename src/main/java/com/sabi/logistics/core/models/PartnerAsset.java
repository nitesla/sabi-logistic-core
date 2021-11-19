package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class PartnerAsset extends CoreEntity {
    private String name;
    private long partnerAssetTypeId;
    private long driverId;
    private String driverName;
    private String plateNo;
    private double length;
    private double width;
    private double height;
    private double volume;
    private String contactPerson;
    private String status;
    private double weight;
    private long colorId;
    private String colorName;
    private boolean hasCover;
    private boolean isOwner;
    private String tonnageType;
    private long brandId;
    private String brandName;
    private String assetTypeName;
    private String partnerName;
    private Long driverAssistantId;
    private String driverAssistantName;
}
