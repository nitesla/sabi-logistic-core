package com.sabi.logistics.core.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RouteLocationTollPriceResponse {

    private Long id;
    private Long stateId;
    private String name;
    private Boolean hasToll;
    //    private BigDecimal tollRate;
    private String stateName;
    private List<TollPricesResponseDto> tollPricesResponseDtos;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Boolean isActive;
    private Long createdBy;
    private Long updatedBy;
}
