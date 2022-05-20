package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import com.sabi.logistics.core.enums.VerificationStatus;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
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
    private String thirdPartyProductId;
    private Long inventoryId;
    private long thirdPartyOrderId;

    private BigDecimal unitPrice;

    private BigDecimal totalPrice;
    @Transient
    private String customerName;

    private String customerPhone;
    @Transient
    private String deliveryAddress;
    @Transient
    private LocalDateTime acceptedDate;

    private String paymentReference;
    @Enumerated(EnumType.STRING)
    private VerificationStatus verificationStatus;


}
