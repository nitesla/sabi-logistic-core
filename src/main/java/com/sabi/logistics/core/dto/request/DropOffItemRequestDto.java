package com.sabi.logistics.core.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DropOffItemRequestDto {
    private Long id;
    @NotBlank(message = "status can not be empty")
    private String status;
    private LocalDateTime deliveryDate;
    @NotNull(message = "orderItemId can not be blank")
    @Min(message = "orderItemId can not be less than 1", value = 1)
    private Long orderItemId;
    private Long dropOffId;
    private BigDecimal amountCollected;
    private Integer qtyGoodsReturned;
    private Integer qtyGoodsDelivered;
    private String reasonForReturn;
    private Long thirdPartyProductId;
    private String productName;
    private Boolean finalDropOff;
}
