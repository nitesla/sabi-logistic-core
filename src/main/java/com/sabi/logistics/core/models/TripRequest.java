package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class TripRequest extends CoreEntity {

    @Column(nullable = false)
    private long partnerID;
    private String partnerName;
    private long orderItemID;
    private String orderItemName;
    private String status;
}
