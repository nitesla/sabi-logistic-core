package com.sabi.logistics.core.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PreferenceResponseDto {

    private Boolean userGetBlocked;
    private Boolean userIsDeactivated;
    private Boolean recieveNewPayment;
    private Boolean cancelledPayment;
    private Boolean newTripRequest;
    private Boolean acceptTripByDriver;
    private Boolean completeTripByDriver;
    private Boolean cancelledTrip;
    private Boolean problemWithTrip;
    private Boolean sabiToSendTripDirectlyToAvailableDrivers;
    private Long partnerId;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;
}
