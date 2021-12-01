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
    private long orderID;
    private LocalDateTime dateDelivered;
    private String name;
    private int qty;
    private LocalDateTime expectedDeliveryDate;
    private int weight;
    private int height;
    private int length;
    private Long wareHouseID;
    private String wareHouseName;
}
