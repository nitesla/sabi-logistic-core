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
public class DeliveryItem extends CoreEntity {

    @Column(nullable = false)
    private long deliveryID;
    private long tripRequestID;
    private String status;
    private LocalDateTime deliveryDate;

}
