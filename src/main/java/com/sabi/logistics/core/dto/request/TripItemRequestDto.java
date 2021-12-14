package com.sabi.logistics.core.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TripItemRequestDto {
    private Long id;
    private Long thirdPartyProductId;
    private Long tripRequestId;
    private String productName;
    private Integer qty;
    private Integer qtyPickedUp;
}
