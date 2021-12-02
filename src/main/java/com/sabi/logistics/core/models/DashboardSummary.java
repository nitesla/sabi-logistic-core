package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;
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
    private long assetTypeId;
    private Integer totalCompletedTrips;
    private double totalEarnings;
    private Integer outstandingTrips;
    private double outstandingAmount;
}
