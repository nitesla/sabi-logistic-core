package com.sabi.logistics.core.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RouteLocationResponse {
    private Long id;
    private Long stateId;
    private Long countryId;
    private String countryName;
    private String name;
    private Boolean hasToll;
//    private BigDecimal tollRate;
    private String stateName;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Boolean isActive;
    private Long createdBy;
    private Long updatedBy;
}
