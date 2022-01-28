package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;
import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class PricingItems extends CoreEntity {
    private Long pricingConfigurationId;
    private Long partnerAssetTypeId;
    private BigDecimal price;
}
