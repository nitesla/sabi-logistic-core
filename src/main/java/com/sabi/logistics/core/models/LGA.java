package com.sabi.logistics.core.models;


import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Transient;

/**
 *
 * This class is responsible for persisting to the database
 */


@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class LGA extends CoreEntity {


    private String name;

    private Long stateId;


    public LGA(String name, Long stateId) {
        this.name = name;
        this.stateId = stateId;
    }
    @Transient
    private String stateName;

}
