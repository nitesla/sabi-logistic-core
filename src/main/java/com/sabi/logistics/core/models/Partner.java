package com.sabi.logistics.core.models;


import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Transient;
import java.time.LocalDateTime;


@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class Partner extends CoreEntity {

    @Column(updatable= false)
    private long userId;
    private String name;
    private Long lgaId;
    private Long stateId;
    private Long countryId;
    private String address;
    private String phone;
    private boolean isRegistered;
    private String cac;
    private int employeeCount;
    private String email;
    private String webSite;
    private LocalDateTime registrationDate = LocalDateTime.now();
    private String registrationToken;
    private String registrationTokenExpiration;
    private Long supplierId;

    private String lgaName;

    private String stateName;

    private String countryName;


}
