package com.sabi.logistics.core.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sabi.logistics.core.enums.TransAction;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WalletTransactionResponseDto {

    private Long id;
    private  Long driverWalletId;
    private Long dropOffId;
    private BigDecimal amount;
    private TransAction action;
    private BigDecimal previousBalance;
    private BigDecimal balance;
    private LocalDateTime actionDate;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
}
