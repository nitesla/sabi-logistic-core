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
    private String thirdPartyProductId;
    private String productName;
    private String status;
    private LocalDateTime deliveryDate;
    private long invoiceItemId;
    private Boolean finalDropOff;
    private BigDecimal totalAmount;
    private BigDecimal unitPrice;
    private BigDecimal outstandingAmount;
    @Transient
    private String invoiceItemName;
    private int qty;
    private String customerName;
    private String customerPhone;
    @Transient
    private Long invoiceId;
    @Transient
    private String referenceNo;
    @Transient
    private double tax;
    private String transactionReference;
    private String deliveryAddress;
    @Transient
    private Long dropOffInvoiceId;

}
