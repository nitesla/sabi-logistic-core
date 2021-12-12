package com.sabi.logistics.core.dto.request;

import com.sabi.logistics.core.enums.TransAction;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class DriverWalletDto {

    private Long id;
    private Long driverId;
    private LocalDateTime lastTransactionDate;
    private BigDecimal balance;
    private BigDecimal previousAmount;
    private BigDecimal amount;
    private TransAction action;
}
