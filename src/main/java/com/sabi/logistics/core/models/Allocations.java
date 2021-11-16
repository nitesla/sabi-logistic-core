package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class Allocations extends CoreEntity {

    private Long wareHouseId;
    private String name;
    private Long blockTypeId;
    private String status;
    private Long clientId;
    private LocalDateTime expirationDate;
    private LocalDateTime startDate;


}
