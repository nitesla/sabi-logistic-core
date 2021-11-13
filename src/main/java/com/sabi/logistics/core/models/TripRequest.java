package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class TripRequest extends CoreEntity {

    @Column(nullable = false)
    private long partnerID;
    private String referenceNo;
    private String status;
    private long partnerAssetID;
    private String deliveryStatus;
    private long driverID;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private long driverAssistantID;
    private String barCode;
    private String QRCode;
    @OneToOne
    private TripItem tripItem;
    @OneToOne
    private RequestResponse requestResponse;
}
