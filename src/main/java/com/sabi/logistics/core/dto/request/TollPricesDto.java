package com.sabi.logistics.core.dto.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class TollPricesDto {

    private Long id;
    private Long routeLocationId;
    private BigDecimal tollRate;
    private Long assestTypeId;
}
