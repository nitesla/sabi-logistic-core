package com.sabi.logistics.core.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sabi.logistics.core.enums.PaymentChannel;
import com.sabi.logistics.core.enums.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DropOffInvoiceResponseDto {
    private Long id;
    private Long invoiceId;
    private Long dropOffId;
    private BigDecimal amount;
    private String status;
    private BigDecimal amountCollected;
    private String deliveryAddress;
    private PaymentStatus paymentStatus;
    private PaymentChannel paymentChannel;

}
