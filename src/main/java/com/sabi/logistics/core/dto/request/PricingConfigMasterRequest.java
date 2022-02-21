package com.sabi.logistics.core.dto.request;

import com.sabi.logistics.core.enums.DynamicType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.DecimalMin;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PricingConfigMasterRequest {

    private Long id;
    private Long partnerId;
    private String routeType;
    private Long arrivalStateId;
    private String locationPreference;
    @DecimalMin(message = "Price per parameter can not be negative values", value = "0.0")
    private BigDecimal pricePerParameter;
    @DecimalMin(message = "Price per weight can not be negative values", value = "0.0")
    private BigDecimal pricePerWeight;
    @DecimalMin(message = "Price per distance can not be negative values", value = "0.0")
    private BigDecimal pricePerDistance;
    @DecimalMin(message = "Price per time can not be negative values", value = "0.0")
    private BigDecimal pricePerTime;
    private Boolean hasPreferentialPricing;
    private BigDecimal preferentialPrice;
    private String tripType;
    private Long departureStateId;

    private List<PricingItemsRequest> pricingItems;

    private Set<String> startingLocations;
    private Set<String> destinationLocations;

    private DynamicType dynamicType;
}
