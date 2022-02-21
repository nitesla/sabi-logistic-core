package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import com.sabi.logistics.core.enums.DynamicType;
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
    private Long arrivalStateId;
    private String locationPreference;
    private BigDecimal pricePerParameter;
    private BigDecimal pricePerWeight;
    private BigDecimal pricePerDistance;
    private BigDecimal pricePerTime;
    private Boolean hasPreferentialPricing;
    private BigDecimal preferentialPrice;

    private String tripType;
    private Long departureStateId;

    private String startingLocations;
    private String destinationLocations;
    private DynamicType dynamicType;
}
