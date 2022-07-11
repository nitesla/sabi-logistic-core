package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import com.sabi.logistics.core.enums.PaymentChannel;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class InvoicePayment extends CoreEntity {

    private Long invoiceId;
    @Enumerated(EnumType.STRING)
    private PaymentChannel paymentChannel;
    private BigDecimal totalAmount;
    private BigDecimal amountCollected;
    private BigDecimal balanceBefore;
    private BigDecimal balanceAfter;
    private String proofOfPayment;
    private String paymentReference;
    private LocalDateTime paymentDate;
    @Transient
    private Invoice invoice;
    

}
