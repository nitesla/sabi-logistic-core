package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class FulfilmentDashboard{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long partnerId;
    private LocalDateTime date;
    private Long wareHouseId;
    private Integer processedOrders;
    private Integer pendingDeliveries;
    private Integer productInventory;
    private BigDecimal totalAmount;

    @Transient
    private int incomingRequest;
    @Transient
    private int processedRequest;
    @Transient
    private int canceledRequest;
    @Transient
    private int pendingRequest;
}
