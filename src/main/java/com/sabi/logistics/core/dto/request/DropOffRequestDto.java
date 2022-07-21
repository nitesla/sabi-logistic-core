package com.sabi.logistics.core.dto.request;


import com.sabi.logistics.core.enums.PaidStatus;
import com.sabi.logistics.core.enums.PaymentChannel;
import com.sabi.logistics.core.enums.ReturnStatus;
import com.sabi.logistics.core.models.DropOffInvoice;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DropOffRequestDto {
    private Long id;
    private Long tripRequestId;
    private BigDecimal totalAmount;
    private BigDecimal amountCollected;
    private Integer qty;
    private Integer qtyReturned;
    private Integer qtyDelivered;
//    private Long invoiceId;
    private String phoneNo;
    private String email;
    private String deliveryStatus;
    private LocalDateTime deliveredDate;
    private String reasonForReturn;
    private String otp;
    private String customerRating;
    private String driverRating;
    private String serviceRating;
    private LocalDateTime deliveryDate;
    private LocalDateTime driverArriverTime;
    private String deliveryCode;
    private Boolean finalDropOff;
    private ReturnStatus returnStatus;
    private PaidStatus paidStatus;
    private PaymentChannel paymentChannel;
    private String paymentVerificationPicture;

    private List<DropOffInvoice> dropOffInvoice;

}
