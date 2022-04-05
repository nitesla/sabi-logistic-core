package com.sabi.logistics.core.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BrandRequestDto {
    private Long id;
    @NotBlank(message = "Name can not be blank")
    private String name;
    /**
    Description: Add image properties to Brand
    Date:       4/5/2022
    Author:     Afam Okonkwo
     */
    @NotBlank(message = "image can not be blank")
    private String image;
}
