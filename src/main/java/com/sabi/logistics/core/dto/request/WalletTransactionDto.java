package com.sabi.logistics.core.dto.request;

import com.sabi.logistics.core.enums.TransAction;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class WalletTransactionDto {

    private Long id;
    private  Long driverWalletId;
    private Long dropOffId;
    private BigDecimal amount;
    private TransAction action;
    private BigDecimal previousBalance;
    private BigDecimal balance;
    private LocalDateTime actionDate;
}
