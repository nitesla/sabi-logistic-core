package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class DashboardSummary extends CoreEntity {

    private long partnerId;
    private LocalDateTime date;
    private Long assetTypeId;
    private String deliveryStatus;
//    private Integer totalCompletedTrips;
    private BigDecimal totalEarnings;
//    private Integer outstandingTrips;
    private BigDecimal outstandingAmount;
}
