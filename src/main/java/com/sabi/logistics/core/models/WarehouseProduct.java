package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class WarehouseProduct extends CoreEntity {

    private Long warehouseId;
    private int quantityAvailable;
    private int quantitySold;
    private int quantity;
    private String thirdPartyProductID;
    private String productName;
}
