package com.sabi.logistics.core.dto.response;

import com.sabi.logistics.core.dto.request.TripAssetDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DashboardResponseDto {
    private Long partnerId;
    private Integer totalCompletedTrips;
    private Double totalEarnings;
    private Integer outstandingTrips;
    private Double outstandingAmount;

    private Integer incomingTrip;
    private Integer completedTrip;
    private Integer cancelledTrip;
    private Integer ongoingTrip;

    private Integer availablePartnerAsset;
    private Integer inTransitPartnerAsset;


    private List<TripAssetDto> tripAsset;


}
