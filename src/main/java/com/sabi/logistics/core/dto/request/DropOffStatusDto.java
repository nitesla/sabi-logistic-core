package com.sabi.logistics.core.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DropOffStatusDto {
    private Long id;
    private BigDecimal totalAmount;
    private String deliveryStatus;
    private String deliveryCode;

    private List<DropOffItemRequestDto> dropOffItem;
}
