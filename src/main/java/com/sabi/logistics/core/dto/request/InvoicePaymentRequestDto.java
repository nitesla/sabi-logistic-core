package com.sabi.logistics.core.dto.request;

import com.sabi.framework.models.CoreEntity;
import com.sabi.logistics.core.enums.PaymentChannel;
import com.sabi.logistics.core.models.Invoice;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Transient;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

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
