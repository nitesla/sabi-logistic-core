package com.sabi.logistics.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import com.sabi.framework.models.CoreEntity;
import com.sabi.logistics.core.enums.Party;
import com.sabi.logistics.core.enums.PaymentStatus;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "`Order`")
public class Order extends CoreEntity {

    private String referenceNo;
    private String deliveryStatus;
    private String customerName;
    private String customerPhone;
    private String deliveryAddress;
    private LocalDateTime dateDelivered;
    private LocalDateTime expectedDeliveryDate;
    private String barCode;
    private Boolean hasMultipleDeliveryAddress;
    @Enumerated(EnumType.STRING)
    private Party sourceParty;
    @Enumerated(EnumType.STRING)
    private Party destinationParty;
    @SerializedName("QRCode")
    @JsonProperty("QRCode")
    private String qrCode;
    private double totalAmount;
    private Long totalQuantity;
    private double tax;
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
    private Long thirdPartyOrderId;
    private String orderNumber;
    

}
