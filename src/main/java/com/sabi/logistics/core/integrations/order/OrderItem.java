package com.sabi.logistics.core.integrations.order;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderItem {
    private String productName;
    private String productId;
    private int unitPrice;
    private String productImageUrl;
    private int quantity;
    private int orderItemId;
    private List<StatusQuantity> statusQuantities;
}

