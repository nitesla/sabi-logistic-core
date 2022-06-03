package com.sabi.logistics.core.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sabi.logistics.core.enums.PaymentMode;
import com.sabi.logistics.core.enums.PaymentStatus;
import com.sabi.logistics.core.models.DropOffItem;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DropOffResponseDto {
    private Long id;
    private long tripRequestId;
    private BigDecimal totalAmount;
    private BigDecimal amountCollected;
    private int qty;
    private int qtyReturned;
    private int qtyDelivered;
    private long invoiceId;
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
    private List<DropOffItem> dropOffItem;
    private LocalDateTime deliveryDate;
    private String customerName;
    private String customerPhone;
    private PaymentStatus paymentStatus;
    private LocalDateTime driverArriverTime;
    private String deliveryCode;
    private Boolean finalDropOff;
    private String returnStatus;
    private String paidStatus;
    private PaymentMode paymentMode;
    private String paymentVerificationPicture;
}
