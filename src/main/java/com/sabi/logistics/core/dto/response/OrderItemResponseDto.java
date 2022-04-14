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
/**
 Description: disables JsonInclude to return null values for the qa and frontend to observe
 Date:       14/04/2022
 Author:     Afam Okonkwo
 */
//@JsonInclude(JsonInclude.Include.NON_NULL)
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
    private String thirdPartyProductId;
    private Long inventoryId;
    private String customerName;
    private String customerPhone;
    private String deliveryAddress;
    private BigDecimal unitPrice;
    private BigDecimal totalPrice;
    private LocalDateTime acceptedDate;
    private LocalDateTime createdDate;
    private String referenceNo;
}
