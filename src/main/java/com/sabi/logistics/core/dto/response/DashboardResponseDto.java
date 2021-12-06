package com.sabi.logistics.core.dto.response;

import com.sabi.logistics.core.dto.request.TripAssetDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DashboardResponseDto {
    private Long id;
    private Long partnerId;
    private LocalDateTime date;
    private Long assetTypeId;
    private Integer totalCompletedTrips;
    private Double totalEarnings;
    private Integer outstandingTrips;
    private Double outstandingAmount;

    private Integer incomingTrip;
    private Integer completedTrip;
    private Integer cancelledTrip;
    private Integer outgoingTrip;
    private String assetTypeName;
    private Long tripRequestId;

    private List<TripAssetDto> tripAsset;


}
