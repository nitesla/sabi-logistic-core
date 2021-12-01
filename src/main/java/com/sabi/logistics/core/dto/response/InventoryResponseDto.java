package com.sabi.logistics.core.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.beans.Transient;
import java.math.BigDecimal;
import java.security.Timestamp;
import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InventoryResponseDto {

    private Long id;
    private Long thirdPartyId;
    private String productName;
    private int qty;
    private BigDecimal totalAmount;
    private Long wareHouseId;
    private String warehouseName;
    private String status;
    private String deliveryPartnerName;
    private String deliveryPartnerEmail;
    private String deliveryPartnerPhone;
    private Long partnerId;
    private LocalDateTime deliveryDate;
    private LocalDateTime dateShipped;
    private Long shippingId;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;
}
