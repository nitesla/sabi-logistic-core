package com.sabilogisticscore.models;

import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class PartnerLocation extends CoreEntity {

    private Long id;
    private Long privateId;
    private Long stateId;
    private int wareHouses;
}
