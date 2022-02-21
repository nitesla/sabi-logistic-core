package com.sabi.logistics.core.integrations.order;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Product {

    private BigDecimal agentSellingPrice;
    private BigDecimal groupBuyBulkPrice;
    private String groupBuyId;
    private int groupBuySplitId;
    private String itemId;
    private int quantity;
}
