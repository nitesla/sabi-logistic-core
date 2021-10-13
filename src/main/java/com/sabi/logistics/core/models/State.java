package com.sabi.logistics.core.models;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * This class is responsible for persisting to the database
 */

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class State extends CoreEntity {

    @Column(nullable = false)
    private String name;




}
