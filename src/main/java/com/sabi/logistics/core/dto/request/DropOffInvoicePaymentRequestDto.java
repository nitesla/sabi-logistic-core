package com.sabi.logistics.core.dto.request;

import com.sabi.logistics.core.enums.SlaName;
import lombok.Data;

@Data
public class DropOffInvoicePaymentRequestDto {

    private Long id;
    private Long dropOffInvoiceId;
    private Long invoicePaymentId;
}
