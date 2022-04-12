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

    /**
     Description: Includes 'partnerName' property to PaymentTerms
     Date:       06/04/2022
     Author:     Afam Okonkwo
     */
    @Transient
    private String partnerName;
}
