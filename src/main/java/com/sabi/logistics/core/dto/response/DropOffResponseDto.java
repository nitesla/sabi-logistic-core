package com.sabi.logistics.core.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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
    private long orderId;
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
