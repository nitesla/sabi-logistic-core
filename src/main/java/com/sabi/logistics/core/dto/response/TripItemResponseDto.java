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
public class TripItemResponseDto{
    private Long id;
    private Long tripRequestID;
    private String status;
    private LocalDateTime deliveryDate;
    private Long orderItemID;
    private String orderItemName;
    private String deliveryAddress;
    private int qty;
    private String customerName;
    private String customerPhone;
    private Long orderId;

}
