package com.sabi.logistics.core.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderItemRequestDto {
    private Long id;

//    @NotNull(message = "Reference No can not be blank")
//    @Min(message = "Reference No can not be less than 0", value = 1)
//    private String referenceNo;

    @NotBlank(message = "Delivery Status can not be blank")
    private String deliveryStatus;

    @NotNull(message = "Partner Asset Id can not be blank")
    @Min(message = "Partner Asset Id can not be less than 0", value = 1)
    private Long partnerAssetID;

    @NotBlank(message = "Name can not be empty")
    private String name;

    @NotNull(message = "Qty can not be empty")
    @Min(message = "Qty can not be less than 0", value = 1)
    private Integer qty;
}
