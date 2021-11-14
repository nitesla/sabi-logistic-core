package com.sabi.logistics.core.models;


import com.fasterxml.jackson.annotation.JsonInclude;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
public class State extends CoreEntity {


    private String name;
    private Long countryId;

    @Transient
    private String countryName;


    public State(String name, Long countryId) {
        this.name = name;
        this.countryId = countryId;
    }
}
