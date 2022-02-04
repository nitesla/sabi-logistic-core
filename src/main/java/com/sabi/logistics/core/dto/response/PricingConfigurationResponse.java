package com.sabi.logistics.core.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PricingConfigurationResponse {
    private Long id;
    private Long partnerId;
    private String routeType;
    private Long arrivalStateId;
    private String locationPreference;
    private BigDecimal pricePerParameter;
    private BigDecimal pricePerWeight;
    private BigDecimal pricePerDistance;
    private BigDecimal pricePerTime;
    private Boolean hasPreferentialPricing;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Boolean isActive;
    private Long createdBy;
    private Long updatedBy;
    private String tripType;
    private Long departureStateId;
    private String stateName;
    private String departureStateName;
    private String startingLocation;
    private Set<String> destinationLocations;

    private List<PricingItemsResponse> pricingItems;
}
