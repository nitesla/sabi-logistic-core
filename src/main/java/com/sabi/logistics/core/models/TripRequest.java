package com.sabi.logistics.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class TripRequest extends CoreEntity {

    private Long partnerId;
    private String referenceNo;
    private String status;
    private Long partnerAssetId;
    private String deliveryStatus;
    private BigDecimal earnings;
    private Long driverId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Long driverAssistantId;
    private String barCode;
    @SerializedName("QRCode")
    @JsonProperty("QRCode")
    private String qrCode;

    private Integer weight;
    private LocalDateTime deliveryDate;
    private LocalDateTime dateDelivered;
//    private String paymentStatus;
    private LocalDateTime driverArriverTime;
    private Long wareHouseId;
    private String rejectReason;
    private String additionalInfo;
    private String wareHouseAddress;
    private String contactPerson;
    private String contactPhone;
    private String contactEmail;
    private Integer dropOffCount;

    private LocalDateTime assignedDate;
    private LocalDateTime expiredTime;

    @Transient
    private Long driverAssistantUserId;
    @Transient
    private Long driverUserId;
    @Transient
    private String partnerName;
    @Transient
    private String partnerAssetName;
    @Transient
    private String driverName;
    @Transient
    private String driverPhone;
    @Transient
    private String driverAssistantName;
    @Transient
    private String driverAssistantPhone;
}
