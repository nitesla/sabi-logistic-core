package com.sabi.logistics.core.dto.response;

import com.sabi.logistics.core.enums.PaymentChannel;
import com.sabi.logistics.core.models.Invoice;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class InvoicePaymentResponseDto {

    private Long id;
    private PaymentChannel paymentChannel;
    private BigDecimal totalAmount;
    private BigDecimal amountCollected;
    private BigDecimal balanceBefore;
    private BigDecimal balanceAfter;
    private String proofOfPayment;
    private Long invoiceId;
    private String paymentReference;
    private LocalDateTime paymentDate;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;
    private Invoice invoice;
}
