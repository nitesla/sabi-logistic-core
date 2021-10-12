package com.sabilogisticscore.dto.request;

import lombok.Data;

@Data
public class PartnerLocationDto {

    private Long id;
    private Long partnerId;
    private Long stateId;
    private int wareHouses;
}
