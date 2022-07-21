package com.sabi.logistics.core.models;


import com.sabi.framework.models.CoreEntity;
import com.sabi.logistics.core.enums.PaymentChannel;
import com.sabi.logistics.core.enums.PaymentStatus;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;

@EqualsAndHashCode(callSuper=false)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class DropOffInvoice extends CoreEntity {

    private Long invoiceId;
    private Long dropOffId;
    private BigDecimal amount;
    private String status;
    private BigDecimal amountCollected;
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
    private String deliveryAddress;
    @Enumerated(EnumType.STRING)
    private PaymentChannel paymentChannel;
}
