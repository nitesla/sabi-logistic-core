package com.sabi.logistics.core.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DashBoardSummaryRequest {

    private Long partnerId;
    private Long completedTrips;
    private BigDecimal totalEarnings;
    private LocalDateTime date;
    private Long outStandingTrips;
    private BigDecimal outStandingEarnings;
    private Long assetType;
}
