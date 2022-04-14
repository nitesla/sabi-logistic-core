package com.sabi.logistics.core.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class RouteLocationTollPriceRequest {

    private Long id;
    @NotNull(message = "State id is required")
    private Long stateId;
    @NotNull(message = "country id is required")
    private Long countryId;
    @NotBlank(message = "Name is required")
    private String name;
    @NotBlank(message = "stateName is required")
    private String stateName;
    @NotBlank(message = "countryName is required")
    private String countryName;
    //    @NotBlank(message = "HasToll is required")
    private Boolean hasToll;

    private List<TollPricesDto> tollPricesDtos;
}
