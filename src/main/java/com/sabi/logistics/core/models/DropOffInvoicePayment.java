package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Transient;

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
