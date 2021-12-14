package com.sabi.logistics.core.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TripItemResponseDto {
    private Long id;
    private long thirdPartyProductId;
    private long tripRequestId;
    private String productName;
    private int qty;
    private int qtyPickedUp;
}
