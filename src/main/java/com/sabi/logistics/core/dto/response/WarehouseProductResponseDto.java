package com.sabi.logistics.core.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WarehouseProductResponseDto {

    private Long id;
    private Long warehouseId;
    private int quantityAvailable;
    private int quantitySold;
    private int quantity;
    private String thirdPartyProductID;
    private String productName;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    /**
     Description: Add 'image' and 'category' properties to WarehouseProduct
     Date:       4/5/2022
     Author:     Afam Okonkwo
     */
    private String image;
    private String category;
}
