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
    private String plateNo;
    private double length;
    private double width;
    private double height;
    private double volume;
    private String contactPerson;
    private String status;
//    private boolean isActive;
    private double weight;
    private long colorId;
    private boolean hasCover;
    private boolean isOwner;
    private String tonnageType;
    private long brandId;
    private String assetTypeName;
    private String partnerName;
    private Long driverAssistantId;
}
