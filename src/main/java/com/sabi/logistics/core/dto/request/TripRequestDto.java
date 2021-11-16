package com.sabi.logistics.core.dto.request;

import com.sabi.logistics.core.models.TripItem;
import com.sabi.logistics.core.models.TripRequestResponse;
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
public class TripRequestDto {
    private Long id;

    @NotNull(message = "PartnerID can not be blank")
    @Min(message = "PartnerID can not be less than 1", value = 1)
    private Long partnerID;

    @NotNull(message = "partnerAssetID can not be blank")
    @Min(message = "partnerAssetID can not be less than 1", value = 1)
    private Long partnerAssetID;

    @NotBlank(message = "Status can not be blank")
    private String status;

    private String deliveryStatus;
    private Long driverID;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Long driverAssistantID;
    private TripItem tripItem;
    private TripRequestResponse tripRequestResponse;

}
