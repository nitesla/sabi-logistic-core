package com.sabi.logistics.core.dto.request;

import lombok.Data;

@Data
public class AdminAuthDto {
    private String userId;

    private  String applicationCode;

    private String authKey;
}
