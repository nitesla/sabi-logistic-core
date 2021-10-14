package com.sabi.logistics.core.dto.request;

import lombok.Data;

@Data
public class PartnerCategoriesDto {

    private Long id;
    private Long partnerId;
    private Long categoryId;
    private boolean isActive;
}
