package com.sabi.logistics.core.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sabi.logistics.core.enums.TransAction;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DriverWalletResponseDto {

    private Long id;
    private Long driverId;
    private LocalDateTime lastTransactionDate;
    private BigDecimal balance;
    private BigDecimal previousAmount;
    private BigDecimal amount;
    private TransAction action;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
}
