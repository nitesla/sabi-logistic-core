package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Transient;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class PartnerAssetType extends CoreEntity {

    private Long partnerId;
    private Long assetTypeId;
    private int total;
    private String assetTypeName;
    private String partnerName;
}
