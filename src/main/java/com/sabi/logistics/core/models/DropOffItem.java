package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class DropOffItem extends CoreEntity {

    private long dropOffId;
    private BigDecimal amountCollected;
    private int qtyGoodsReturned;
    private int qtyGoodsDelivered;
    private String reasonForReturn;
    private long thirdPartyProductId;
    private String productName;
    private String status;
    private LocalDateTime deliveryDate;
    private long orderItemId;
    @Transient
    private String orderItemName;
    @Transient
    private int qty;
    @Transient
    private String customerName;
    @Transient
    private String customerPhone;
    @Transient
    private Long orderId;
    @Transient
    private String referenceNo;
    @Transient
    private double tax;
    @Transient
    private double totalAmount;

}
