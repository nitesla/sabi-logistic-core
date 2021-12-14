package com.sabi.logistics.core.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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
    private Long orderId;
    private String phoneNo;
    private String address;
    private String email;
    private String deliveryStatus;
    private LocalDateTime deliveredDate;
    private String reasonForReturn;
    private String otp;
    private String customerRating;
    private String driverRating;
    private String serviceRating;
}
