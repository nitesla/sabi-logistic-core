package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import com.sabi.logistics.core.enums.PaymentChannel;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class DropOffInvoicePayment extends CoreEntity {

    private Long dropOffInvoiceId;
    private Long invoicePaymentId;
    @Transient
    private DropOffInvoice dropOffInvoice;
    @Transient
    private InvoicePayment invoicePayment;
    

}
