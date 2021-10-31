package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class OrderItem extends CoreEntity {

    @Column(nullable = false)
    private String referenceNo;
    private String deliveryStatus;
    private long partnerAssetID;
    private LocalDateTime DateDelivered = LocalDateTime.now();
    private String name;
    private int qty;
}
