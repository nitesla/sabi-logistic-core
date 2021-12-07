package com.sabi.logistics.core.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FulfilmentDashBoardResponseDto {

    private Long id;
    private Long partnerId;
    private LocalDateTime date;
    private Long wareHouseId;
    private Integer processedOrders;
    private Integer pendingDeliveries;
    private Integer productInventory;
    private BigDecimal totalAmount;
}
