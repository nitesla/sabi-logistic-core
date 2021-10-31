package com.sabi.logistics.core.dto.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderItemResponseDto {

    private Long id;
    private String referenceNo;
    private String deliveryStatus;
    private long partnerAssetID;
    private LocalDateTime DateDelivered = LocalDateTime.now();
    private String name;
    private int qty;
}
