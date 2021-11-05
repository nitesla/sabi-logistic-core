package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class AllocationHistory extends CoreEntity {

    private Long allocationId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Long clientId;
    private BigDecimal totalAmount;
    private BigDecimal amountPaid;
    private BigDecimal balance;
}
