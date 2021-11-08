package com.sabi.logistics.core.models;


import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class Driver extends CoreEntity {

    private String name;
    private Long partnerAssetId;
    private Long partnerId;
    private Long userId;
}
