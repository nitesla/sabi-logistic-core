package com.sabi.logistics.core.dto.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 *
 * This class collects the request and map it to the entity class
 */

@Data
public class ProductRequestDto {
    private Long id;

    private Long thirdPartyId;

    @NotBlank(message = "Name can not be blank")
    private String name;

    private Double totalStock;

    private Double stockSold;
}
