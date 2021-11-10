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
public class TripRequestDto {
    private Long id;

    @NotNull(message = "PartnerID can not be blank")
    @Min(message = "PartnerID can not be less than 1", value = 1)
    private Long partnerID;

    @NotNull(message = "Order Item ID can not be blank")
    @Min(message = "Order Item ID can not be less than 1", value = 1)
    private Long orderItemID;

    @NotBlank(message = "Status can not be blank")
    private String status;

}
