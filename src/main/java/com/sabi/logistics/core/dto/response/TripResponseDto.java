package com.sabi.logistics.core.dto.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.sabi.logistics.core.models.RequestResponse;
import com.sabi.logistics.core.models.TripItem;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TripResponseDto {

    private Long id;
    private Long partnerID;
    private String partnerName;
    private String referenceNo;
    private String status;
    private Long partnerAssetID;
    private String partnerAssetName;
    private String deliveryStatus;
    private Long driverID;
    private String driverName;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Long driverAssistantID;
    private String barCode;
    private String QRCode;
    private TripItem tripItem;
    private RequestResponse requestResponse;


}
