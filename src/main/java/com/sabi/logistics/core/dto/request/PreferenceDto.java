package com.sabi.logistics.core.dto.request;

import lombok.Data;

@Data
public class PreferenceDto {

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
}
