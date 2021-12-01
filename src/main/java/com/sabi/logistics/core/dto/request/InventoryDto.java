package com.sabi.logistics.core.dto.request;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class InventoryDto {

    private Long id;
    private Long thirdPartyId;
    private String productName;
    private int qty;
    private BigDecimal totalAmount;
    private Long wareHouseId;
    private String status;
    private String deliveryPartnerName;
    private String deliveryPartnerEmail;
    private String deliveryPartnerPhone;
    private Long partnerId;
    private LocalDateTime deliveryDate;
    private LocalDateTime dateShipped;
    private Long shippingId;


}
