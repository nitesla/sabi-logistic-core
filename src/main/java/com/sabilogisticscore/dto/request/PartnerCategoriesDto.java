package com.sabilogisticscore.dto.request;

import lombok.Data;

@Data
public class PartnerCategoriesDto {

    private Long id;
    private Long partnerId;
    private boolean isActive;
    private Long categoryId;
}
