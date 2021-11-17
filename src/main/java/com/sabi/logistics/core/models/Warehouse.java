package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Warehouse extends CoreEntity {

    private long partnerId;
    private long lgaId;
    private String lgaName;
    private String stateName;
    private String address;
    private String contactPerson;
    private String contactPhone;
    private String contactEmail;
    private String longitude;
    private String name;
    private long userId;
    private String latitude;
    private String owner;
}
