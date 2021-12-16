package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Transient;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class PaymentTerms extends CoreEntity {


    private Long partnerAssetTypeId;
    private Integer days;
    @Transient
    private String partnerAssetTypeName;
}