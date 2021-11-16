package com.sabi.logistics.core.models;


import com.sabi.framework.models.CoreEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class PartnerRole extends CoreEntity {

    private Long partnerId;
    private Long roleId;
}
