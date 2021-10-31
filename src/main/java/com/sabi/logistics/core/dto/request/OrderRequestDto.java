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
public class OrderRequestDto {
    private Long id;

    @NotNull(message = "WareHouse Id can not be blank")
    @Min(message = "WareHouse Id can not be less than 0", value = 1)
    private Long wareHouseID;

    @NotNull(message = "Delivery Partner Id can not be blank")
    @Min(message = "Delivery Partner Id can not be less than 0", value = 1)
    private Long deliveryPartnerID;

//    private String referenceNo;

    @NotBlank(message = "Delivery Status can not be blank")
    private String deliveryStatus;

    @NotBlank(message = "Customer Name can not be empty")
    private String customerName;

    @NotBlank(message = "Customer Phone can not be empty")
    private String customerPhone;

    @NotBlank(message = "Delivery Address can not be empty")
    private String deliveryAddress;
}
