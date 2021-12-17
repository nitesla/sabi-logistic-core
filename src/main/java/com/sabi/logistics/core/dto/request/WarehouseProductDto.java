package com.sabi.logistics.core.dto.request;

import lombok.Data;

@Data
public class WarehouseProductDto {

    private Long id;
    private Long warehouseId;
    private int quantityAvailable;
    private int quantitySold;
    private int quantity;
    private String thirdPartyProductID;
    private String productName;
}
