package com.sabilogisticscore.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategoryResponseDto {



    private Long id;
    private String name;
    private String image;
    private String description;
    private boolean hasAsset;
    private boolean hasWareHouse;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;
}
