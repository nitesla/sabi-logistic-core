package com.sabi.logistics.core.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;



@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Data
public class DashboardSummary  {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long partnerId;
    private String referenceNo;
    private LocalDateTime date;
    private Long assetTypeId;
    private String deliveryStatus;
    private BigDecimal earnings;

    private Integer totalCompletedTrips;
    private BigDecimal totalEarnings;
    private Integer outstandingTrips;
    private BigDecimal outstandingAmount;
}
