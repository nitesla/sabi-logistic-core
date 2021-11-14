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
public class DeliveryRequestDto {
    private Long id;

    @NotNull(message = "Partner Asset ID can not be blank")
    @Min(message = "Partner Asset ID can not be less than 1", value = 1)
    private Long partnerAssetID;

    @NotNull(message = "Order Item ID can not be blank")
    @Min(message = "Order Item ID can not be less than 1", value = 1)
    private Long orderItemID;

    @NotBlank(message = "Status can not be blank")
    private String status;

    @NotNull(message = "driverID can not be blank")
    @Min(message = "driverID can not be less than 1", value = 1)
    private Long driverID;

    @NotNull
    private LocalDateTime startTime;

    @NotNull
    private LocalDateTime endTime;

    @NotNull(message = "Driver Assistant ID can not be blank")
    @Min(message = "Driver Assistant ID can not be less than 1", value = 1)
    private Long driverAssistantID;

}
