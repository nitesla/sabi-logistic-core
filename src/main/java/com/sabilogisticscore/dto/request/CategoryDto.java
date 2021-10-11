package com.sabilogisticscore.dto.request;

import lombok.Data;

@Data
public class CategoryDto {

    private Long id;
    private String name;
    private String image;
    private String description;
    private boolean hasAsset;
    private boolean hasWareHouse;
}
