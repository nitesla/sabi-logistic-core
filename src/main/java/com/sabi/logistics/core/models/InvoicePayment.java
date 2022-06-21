package com.sabi.logistics.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import com.sabi.framework.models.CoreEntity;
import com.sabi.logistics.core.enums.Party;
import com.sabi.logistics.core.enums.PaymentChannel;
import com.sabi.logistics.core.enums.PaymentStatus;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

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
