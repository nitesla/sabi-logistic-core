package com.sabi.logistics.core.dto.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import com.sabi.logistics.core.models.DropOff;
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
    private Long partnerId;
    private String partnerName;
    private String referenceNo;
    private String status;
    private Long partnerAssetId;
    private String partnerAssetName;
    private String deliveryStatus;
    private Long driverId;
    private String driverName;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Long driverAssistantId;
    private String driverAssistantName;
    private String barCode;
    @SerializedName("QRCode")
    @JsonProperty("QRCode")
    private String qrCode;
    private List<DropOff> dropOff;
    private List <TripRequestResponse> tripRequestResponse;
    private List <TripItem> tripItem;
    private Integer weight;
    private LocalDateTime deliveryDate;
    private LocalDateTime dateDelivered;
    private Long wareHouseId;
    private String wareHouseAddress;
    private Integer dropOffCount;
    private Long driverAssistantUserId;
    private Long driverUserId;
    private String contactPerson;
    private String contactPhone;
    private String contactEmail;
    private String rejectReason;
//    private String paymentStatus;
    private LocalDateTime driverArriverTime;
    private String driverAssistantPhone;
    private String driverPhone;

    private LocalDateTime assignedDate;
    private LocalDateTime expiredTime;


}
