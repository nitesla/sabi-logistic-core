package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class Inventory extends CoreEntity {


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
    @Transient
    private String warehouseName;
}
