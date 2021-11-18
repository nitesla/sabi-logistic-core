package com.sabi.logistics.core.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TripRequestDto {
    private Long id;

//    @NotNull(message = "PartnerID can not be blank")
//    @Min(message = "PartnerID can not be less than 1", value = 1)
    private Long partnerID;

//    @NotNull(message = "partnerAssetID can not be blank")
//    @Min(message = "partnerAssetID can not be less than 1", value = 1)
    private Long partnerAssetID;

    @NotBlank(message = "Status can not be blank")
    private String status;

    private String deliveryStatus;
    private Long driverID;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Long driverAssistantID;
//    private TripItem tripItem;
//    private TripRequestResponse tripRequestResponse;

    private Integer weight;
    private LocalDateTime deliveryDate;
    private LocalDateTime dateDelivered;
    private Long wareHouseId;
    private String wareHouseAddress;

}
