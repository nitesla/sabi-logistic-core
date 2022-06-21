package com.sabi.logistics.core.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DropOffInvoiceRequestDto {
    private Long id;
    private Long invoiceId;
    private Long dropOffId;
    private BigDecimal amount;
    private String status;
    private BigDecimal amountCollected;
}
