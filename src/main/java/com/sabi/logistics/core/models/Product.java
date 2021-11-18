package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;

;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity

public class Product extends CoreEntity {

    @Column(nullable = false)
    private long thirdPartyId;
    private String name;
    private double totalStock;
    private double stockSold;

}
