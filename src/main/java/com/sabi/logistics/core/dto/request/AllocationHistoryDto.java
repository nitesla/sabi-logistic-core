package com.sabi.logistics.core.dto.request;

import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
public class AllocationHistoryDto {

    private Long id;
    private Long allocationId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Long clientId;
    private BigDecimal totalAmount;
    private BigDecimal amountPaid;
    private BigDecimal balance;
}
