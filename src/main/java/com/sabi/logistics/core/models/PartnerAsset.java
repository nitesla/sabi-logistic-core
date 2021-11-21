package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Transient;

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
    @Transient
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
    @Transient
    private String colorName;
    private Boolean hasCover;
    private Boolean isOwner;
    private String tonnageType;
    private long brandId;
    @Transient
    private String brandName;
    private String assetTypeName;
    private String partnerName;
    private Long driverAssistantId;
    private String driverAssistantName;
}
