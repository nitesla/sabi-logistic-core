package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class TripRequestResponse extends CoreEntity {

    @Column(nullable = false)
    private String status;
    private long partnerId;
    private String driverStatus;
    private long driverId;
    private long tripRequestId;
    private LocalDateTime responseDate;
    private String rejectReason;
    private String additionalInfo;
}
