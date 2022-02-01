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
public class PricingConfiguration extends CoreEntity {
    private Long partnerId;
    private String routeType;
    private Long stateId;
    private String locationPreference;
    private BigDecimal pricePerParameter;
    private BigDecimal pricePerWeight;
    private BigDecimal pricePerDistance;
    private BigDecimal pricePerTime;
    private Boolean hasPreferentialPricing;

    private String tripType;
    private Long departureStateId;
}
