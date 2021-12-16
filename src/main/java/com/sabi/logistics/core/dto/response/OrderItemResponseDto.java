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
    private String deliveryStatus;
    private Long orderId;
    private LocalDateTime dateDelivered;
    private String productName;
    private Integer qty;
    private LocalDateTime expectedDeliveryDate;
    private Integer weight;
    private Integer height;
    private Integer length;
    private Long wareHouseId;
    private String wareHouseName;
    private Long thirdPartyProductId;
}
