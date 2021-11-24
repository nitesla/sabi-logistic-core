package com.sabi.logistics.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Transient;
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
    @SerializedName("QRCode")
    @JsonProperty("QRCode")
    private String qrCode;

    private int weight;
    private LocalDateTime deliveryDate;
    private LocalDateTime dateDelivered;
    private long wareHouseId;
    private String wareHouseAddress;
    private Integer dropOff;
    @Transient
    private String partnerName;
    @Transient
    private String partnerAssetName;
    @Transient
    private String driverName;
    @Transient
    private String driverAssistantName;
}
