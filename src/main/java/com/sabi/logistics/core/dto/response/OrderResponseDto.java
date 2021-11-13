package com.sabi.logistics.core.dto.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.sabi.logistics.core.models.OrderItem;
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
public class OrderResponseDto {

    private Long id;
    private Long wareHouseID;
    private String wareHouseName;
    private String referenceNo;
    private String deliveryStatus;
    private String customerName;
    private String customerPhone;
    private String deliveryAddress;
    private LocalDateTime dateDelivered;
    private LocalDateTime expectedDeliveryDate;
    private String barCode;
    private String QRcode;
    private double totalAmount;
    private int totalQuantity;
    private LocalDateTime createdDate;
    private OrderItem orderItem;


}
