package com.sabi.logistics.core.dto.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import com.sabi.logistics.core.models.TripItem;
import com.sabi.logistics.core.models.TripRequestResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;


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
    @SerializedName("QRCode")
    @JsonProperty("QRCode")
    private String qrCode;
    private List<TripItem> tripItem;
    private List <TripRequestResponse> tripRequestResponse;

    private Integer weight;
    private LocalDateTime deliveryDate;
    private LocalDateTime dateDelivered;
    private Long wareHouseId;
    private String wareHouseAddress;
    private Integer pickUp;


}
