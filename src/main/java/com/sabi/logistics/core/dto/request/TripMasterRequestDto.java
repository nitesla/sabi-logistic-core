package com.sabi.logistics.core.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TripMasterRequestDto {
    private Long id;
    private Long partnerId;
    private Long partnerAssetId;
    @NotBlank(message = "Status can not be blank")
    private String status;
    private String deliveryStatus;
    private Long driverAssistantUserId;
    private Long driverUserId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Integer weight;
    private LocalDateTime deliveryDate;
    private LocalDateTime dateDelivered;
    private Long wareHouseId;
    private String rejectReason;
    private String wareHouseAddress;

    private List<DropOffMasterRequestDto> dropOff;



}
