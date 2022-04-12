package com.sabi.logistics.core.dto.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BrandResponseDto {
    private long id;
    private String name;
    /**
    Description: Add image properties to Brand
    Date:       4/5/2022
    Author:     Afam Okonkwo
     */
    private String image;
    private boolean isActive;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
}
