package com.sabi.logistics.core.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeliveryItemRequestDto {
    private Long id;

    @NotNull(message = "Delivery ID can not be blank")
    @Min(message = "Delivery ID can not be less than 0", value = 1)
    private Long deliveryID;

    @NotNull(message = "Trip Request ID can not be blank")
    @Min(message = "Trip Request ID can not be less than 0", value = 1)
    private Long tripRequestID;

    @NotBlank(message = "Status can not be blank")
    private String status;

    @NotNull
    private LocalDateTime deliveryDate;



}
