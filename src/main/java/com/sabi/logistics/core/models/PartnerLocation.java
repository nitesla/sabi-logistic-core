package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;



@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class PartnerLocation extends CoreEntity {

    private Long partnerId;
    private Long stateId;
    private int wareHouses;
    private String stateName;
}
