package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class TripItem extends CoreEntity {

    private long thirdPartyProductId;
    private long tripRequestId;
    private String productName;
    private int qty;
    private int qtyPickedUp;
}
