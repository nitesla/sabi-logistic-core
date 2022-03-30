package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Transient;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class RouteLocation extends CoreEntity {
    private Long stateId;
    private Long countryId;
    private String name;
    private Boolean hasToll;
//    private BigDecimal tollRate;
    private String stateName;

    private String countryName;

    @Transient
    private List<TollPrices> tollPrices;
}
