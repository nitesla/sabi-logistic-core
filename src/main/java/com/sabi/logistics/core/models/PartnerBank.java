package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Transient;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class PartnerBank extends CoreEntity {


    private Long partnerId;
    private Long bankId;
    private String accountNumber;
    @Transient
    private String bankName;
}
