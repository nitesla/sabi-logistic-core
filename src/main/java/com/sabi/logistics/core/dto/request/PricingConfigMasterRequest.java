package com.sabi.logistics.core.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PricingConfigMasterRequest {

    private Long id;
    @NotNull(message = "Partner id can not be null")
    private Long partnerId;
    @NotBlank(message = "Route type is required")
    private String routeType;
    private Long stateId;
    @NotBlank(message = "Location Preference is required")
    private String locationPreference;
    @NotNull(message = "Price per parameter is required")
    @DecimalMin(message = "Price per parameter can not be negative values", value = "0.0")
    private BigDecimal pricePerParameter;
    @NotNull(message = "Price per weight is required")
    @DecimalMin(message = "Price per weight can not be negative values", value = "0.0")
    private BigDecimal pricePerWeight;
    @NotNull(message = "Price per distance is required")
    @DecimalMin(message = "Price per distance can not be negative values", value = "0.0")
    private BigDecimal pricePerDistance;
    @NotNull(message = "Price per time is required")
    @DecimalMin(message = "Price per time can not be negative values", value = "0.0")
    private BigDecimal pricePerTime;
    private Boolean hasPreferentialPricing;
    private String tripType;
    private Long departureStateId;

    private List<PricingItemsRequest> pricingItems;
}
