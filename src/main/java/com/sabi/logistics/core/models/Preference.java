package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class Preference extends CoreEntity {

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
    private Boolean userIsCreated;
    private Long partnerId;
}
