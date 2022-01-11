package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class DropOff extends CoreEntity {

    private long tripRequestId;
    private BigDecimal totalAmount;
    private BigDecimal amountCollected;
    private int qty;
    private int qtyReturned;
    private int qtyDelivered;
    private long orderId;
    private String phoneNo;
    private String email;
    private String deliveryAddress;
    private String deliveryStatus;
    private LocalDateTime deliveredDate;
    private String reasonForReturn;
    private String otp;
    private String customerRating;
    private String driverRating;
    private String serviceRating;

    private LocalDateTime deliveryDate;
    private LocalDateTime driverArriverTime;
    @Transient
    private String customerName;
    @Transient
    private String customerPhone;

    private String paymentStatus;

    @Transient
    private List<DropOffItem> dropOffItem;
}
