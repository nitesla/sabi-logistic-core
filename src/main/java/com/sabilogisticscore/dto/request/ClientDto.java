package com.sabilogisticscore.dto.request;

import lombok.Data;

@Data
public class ClientDto {

    private Long id;
    private Long UserId;
    private boolean isActive;
}
