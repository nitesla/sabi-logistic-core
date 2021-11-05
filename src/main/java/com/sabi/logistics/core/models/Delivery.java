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
public class Delivery extends CoreEntity {

    @Column(nullable = false)
    private long partnerAssetID;
    private long orderItemID;
    private String status;
    private long driverID;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private long driverAssistantID;
}
