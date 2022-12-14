package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import com.sabi.logistics.core.enums.PaidStatus;
import com.sabi.logistics.core.enums.PaymentChannel;
import com.sabi.logistics.core.enums.PaymentStatus;
import com.sabi.logistics.core.enums.ReturnStatus;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
    private Long qty;
    private int qtyReturned;
    private int qtyDelivered;
//    private long invoiceId;
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

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    private String deliveryCode;

    private Boolean finalDropOff;

    @Enumerated(EnumType.STRING)
    private ReturnStatus returnStatus;

    @Enumerated(EnumType.STRING)
    private PaidStatus paidStatus;
    @Enumerated(EnumType.STRING)
    private PaymentChannel paymentChannel;
    private String paymentVerificationPicture;

    @Transient
    private List<DropOffItem> dropOffItem;
    @Transient
    private List<InvoicePayment> invoicePayment;
    private String deliveryOverrideCodeHash;
    private String paymentOverrideCodeHash;
    private String creditCodeHash;

    @Transient
    private List<DropOffInvoice> dropOffInvoice;

}
