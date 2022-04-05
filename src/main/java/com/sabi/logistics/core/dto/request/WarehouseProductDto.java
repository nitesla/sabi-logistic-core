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
    /**
     Description: Add 'image' and 'category' properties to WarehouseProduct
     Date:       4/5/2022
     Author:     Afam Okonkwo
     */
    private String image;
    private String category;
}
