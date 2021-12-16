package com.sabi.logistics.core.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DropOffItemRequestDto {
    private Long id;
    private String status;
    private LocalDateTime deliveryDate;
    private Long orderItemId;
    private Long dropOffId;
    private BigDecimal amountCollected;
    private Integer qtyGoodsReturned;
    private Integer qtyGoodsDelivered;
    private String reasonForReturn;
    private Long thirdPartyProductId;
    private String productName;
}
