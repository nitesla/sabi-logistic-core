package com.sabi.logistics.core.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DropOffItemResponseDto {
    private Long id;
    private Long dropOffId;
    private BigDecimal amountCollected;
    private Integer qtyGoodsReturned;
    private Integer qtyGoodsDelivered;
    private String reasonForReturn;
    private Long thirdPartyProductId;
    private String productName;
    private String status;
    private LocalDateTime deliveryDate;
    private Long orderItemId;
    private String orderItemName;
    private String deliveryAddress;
    private Integer qty;
    private String customerName;
    private String customerPhone;
    private Long orderId;

}