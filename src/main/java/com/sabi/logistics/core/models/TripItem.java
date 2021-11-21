package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Transient;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class TripItem extends CoreEntity {

    @Column(nullable = false)
    private String status;
    private LocalDateTime deliveryDate;
    private long orderItemID;
    @Transient
    private String orderItemName;
    private long tripRequestID;
    private String deliveryAddress;
    @Transient
    private int qty;
    @Transient
    private String customerName;
    @Transient
    private String customerPhone;

}
