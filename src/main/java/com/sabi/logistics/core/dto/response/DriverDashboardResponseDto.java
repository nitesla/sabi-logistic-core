package com.sabi.logistics.core.dto.response;

import com.sabi.logistics.core.dto.request.TripAssetDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DriverDashboardResponseDto {
    private Long partnerId;
    private Long driverId;
    private String driverName;
    private String partnerName;
    private BigInteger totalCompletedTrips;
    private BigInteger totalFailedTrips;
    private BigInteger totalPartiallyCompletedTrips;


}
