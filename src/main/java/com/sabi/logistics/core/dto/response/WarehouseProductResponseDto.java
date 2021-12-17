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
}
