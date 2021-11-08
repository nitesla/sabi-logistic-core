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
public class OrderItem extends CoreEntity {

    @Column(nullable = false)
    private String referenceNo;
    private String deliveryStatus;
    private long partnerAssetID;
    @Transient
    private String partnerAssetName;
    private LocalDateTime dateDelivered;
    private String name;
    private int qty;
    private LocalDateTime expectedDeliveryDate;
    private int weight;
    private int height;
    private int length;

}
