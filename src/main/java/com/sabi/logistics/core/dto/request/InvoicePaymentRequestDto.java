package com.sabi.logistics.core.dto.request;

import com.sabi.logistics.core.enums.PaymentChannel;
import lombok.*;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class InvoicePaymentRequestDto {

    private Long id;
    private Long invoiceId;
    private PaymentChannel paymentChannel;
    @DecimalMin(value = "0.0", message = "Total Amount cannot be less than 0.0")
    private BigDecimal totalAmount;
    @DecimalMin(value = "0.0", message = "Amount Collected cannot be less than 0.0")
    private BigDecimal amountCollected;
    @DecimalMin(value = "0.0", message = "Balance Before cannot be less than 0.0")
    private BigDecimal balanceBefore;
    @DecimalMin(value = "0.0", message = "Balance After cannot be less than 0.0")
    private BigDecimal balanceAfter;
    private String proofOfPayment;
    @NotBlank(message = "paymentReference cannot be blank")
    private String paymentReference;
    private LocalDateTime paymentDate;
    

}
