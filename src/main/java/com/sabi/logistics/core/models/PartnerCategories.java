package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class PartnerCategories extends CoreEntity{

    private Long id;
    private Long partnerId;
    private boolean isActive;
    private Long categoryId;

}
