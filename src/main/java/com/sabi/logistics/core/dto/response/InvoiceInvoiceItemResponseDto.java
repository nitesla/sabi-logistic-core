package com.sabi.logistics.core.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import com.sabi.logistics.core.enums.Party;
import com.sabi.logistics.core.enums.PaymentStatus;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InvoiceInvoiceItemResponseDto {

    private Long id;
    private String referenceNo;
    private String deliveryStatus;
    private String customerName;
    private String customerPhone;
    private String deliveryAddress;
    private LocalDateTime dateDelivered;
    private LocalDateTime expectedDeliveryDate;
    private String barCode;
    @SerializedName("QRCode")
    @JsonProperty("QRCode")
    private String qrCode;
    private double totalAmount;
    private int totalQuantity;
    private LocalDateTime createdDate;
    private List<InvoiceItemResponseDto> invoiceItem;
    private double tax;
    private PaymentStatus paymentStatus;
    private String orderNumber;
    private String invoiceNumber;
    private Party sourceParty;
    private Party destinationParty;
    private Boolean hasMultipleDeliveryAddress;
}
