package com.sabi.logistics.core.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class RouteLocationResponse {
    private Long stateId;
    private String name;
    private Boolean hasToll;
    private BigDecimal tollRate;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Boolean isActive;
    private Long createdBy;
    private Long updatedBy;
}
