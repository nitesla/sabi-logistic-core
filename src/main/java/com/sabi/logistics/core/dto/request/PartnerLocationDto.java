package com.sabi.logistics.core.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PartnerLocationDto {

    private Long id;
    private Long partnerId;
    private Long stateId;
    private int wareHouses;
}
