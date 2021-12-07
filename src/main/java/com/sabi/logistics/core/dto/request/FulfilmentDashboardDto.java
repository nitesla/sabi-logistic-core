package com.sabi.logistics.core.dto.request;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class FulfilmentDashboardDto {

    private Long id;
    private Long partnerId;
    private LocalDateTime date;
    private Long wareHouseId;
    private Integer processedOrders;
    private Integer pendingDeliveries;
    private Integer productInventory;
    private BigDecimal totalAmount;
}
