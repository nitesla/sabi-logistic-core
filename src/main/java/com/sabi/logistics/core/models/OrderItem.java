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
    private String deliveryStatus;
    private LocalDateTime dateDelivered;
    private String productName;
    private int qty;
    private LocalDateTime expectedDeliveryDate;
    private int weight;
    private int height;
    private int length;
    private long orderId;
    private long wareHouseId;
    private long thirdPartyProductId;

}
