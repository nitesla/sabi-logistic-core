package com.sabi.logistics.core.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PartnerCategoriesDto {

    private Long id;
    private Long partnerId;
    private Long categoryId;
    private boolean isActive;
}
