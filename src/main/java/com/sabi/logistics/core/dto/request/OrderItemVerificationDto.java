package com.sabi.logistics.core.dto.request;

import com.sabi.logistics.core.enums.VerificationStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderItemVerificationDto {
    @NotBlank(message = "TripRequest Reference can not be blank")
    private String tripRequestReference;

    @NotBlank(message = "Order Reference can not be blank")
    private String orderReference;

    @NotBlank(message = "Payment Reference can not be blank")
    private String paymentReference;

    private VerificationStatus verificationStatus;

    @NotNull(message = "Amount Paid can not be empty")
    @DecimalMin(value = "0.0", message = "Amount Paid can not be less than 0.0")
    private BigDecimal amountPaid ;
}
