package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Warehouse extends CoreEntity {

    private long partnerId;
    private long lgaId;
    private long stateId;
    private long countryId;
    private String lgaName;
    private String stateName;
    private String countryName;
    private String address;
    private String contactPerson;
    private String contactPhone;
    private String contactEmail;
    private String longitude;
    private String name;
    private long userId;
    @Transient
    private List<WarehouseProduct> productInfo;
    private String latitude;
    private String owner;
    private double totalStock;
    private double stockSold;
}
