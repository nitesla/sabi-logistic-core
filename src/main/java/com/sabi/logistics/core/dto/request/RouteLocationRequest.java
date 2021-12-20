package com.sabi.logistics.core.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class RouteLocationRequest {
    private Long id;
    @NotNull(message = "State id is required")
    private Long stateId;
    @NotBlank(message = "Name is required")
    private String name;
    @NotBlank(message = "HasToll is required")
    private Boolean hasToll;
    @NotBlank(message = "TollRate is required")
    @DecimalMin(message = "Toll rate can not be less than 0", value = "0.0")
    private BigDecimal tollRate;
}
