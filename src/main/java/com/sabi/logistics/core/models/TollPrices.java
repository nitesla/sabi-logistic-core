package com.sabi.logistics.core.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class TollPrices extends CoreEntity {

    private Long routeLocationId;
    private BigDecimal tollRate;
    private Long assestTypeId;
}
