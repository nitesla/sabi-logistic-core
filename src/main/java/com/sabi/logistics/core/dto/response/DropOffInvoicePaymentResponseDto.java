package com.sabi.logistics.core.dto.response;

import com.sabi.logistics.core.models.DropOffInvoice;
import com.sabi.logistics.core.models.InvoicePayment;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Transient;
import java.time.LocalDateTime;

@Data
@Builder

public class DropOffInvoicePaymentResponseDto {
    private Long id;
    private Long dropOffInvoiceId;
    private Long invoicePaymentId;
    private DropOffInvoice dropOffInvoice;
    private InvoicePayment invoicePayment;
    private boolean isActive;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
}
