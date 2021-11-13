package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "`Order`")
public class Order extends CoreEntity {

    @Column(nullable = false)
    private long wareHouseID;
    private String referenceNo;
    private String deliveryStatus;
    private String customerName;
    private String customerPhone;
    private String deliveryAddress;
    private LocalDateTime dateDelivered;
    private LocalDateTime expectedDeliveryDate;
    private String barCode;
    private String QRcode;
    private double totalAmount;
    private int totalQuantity;
    @OneToOne
    private OrderItem orderItem;

}
