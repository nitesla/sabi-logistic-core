package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import com.sabi.logistics.core.enums.DriverType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Transient;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class DriverAsset extends CoreEntity {

    private Long partnerAssetId;
    private String partnerAssetName;
    private Long driverId;
    private String driverName;
//    private Long partnerId;
    private String partnerName;
//    private Long partnerAssetTypeId;
    private String assetTypeName;
    private DriverType driverType;
    @Transient
    private String firstName;
    @Transient
    private String lastName;
    @Transient
    private String email;
    @Transient
    private String phoneNumber;
    @Transient
    private String assetType;
}
