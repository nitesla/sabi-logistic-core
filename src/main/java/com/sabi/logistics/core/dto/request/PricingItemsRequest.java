package com.sabi.logistics.core.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PricingItemsRequest {
    private Long id;
    @NotNull(message = "Pricing configuration Id is required")
    private Long pricingConfiguartionId;
    @NotNull(message = "AssetTypeId is required")
    private Long assetTypeId;
    @DecimalMin(message = "price can not be negative", value = "0.0")
    @NotNull(message = "Price is required")
    private BigDecimal price;
}
