package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import com.sabi.logistics.core.enums.TransAction;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class DriverWallet extends CoreEntity {

    private Long driverId;
    private LocalDateTime lastTransactionDate;
    private BigDecimal balance;
    private BigDecimal previousAmount;
    private BigDecimal amount;
    private TransAction action;
}
