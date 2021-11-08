package com.sabi.logistics.core.models;


import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Transient;

/**
 *
 * This class is responsible for persisting to the database
 */

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class LGA extends CoreEntity {

    @Column(nullable = false)
    private String name;

    private Long stateId;

    @Transient
    private String stateName;

}
