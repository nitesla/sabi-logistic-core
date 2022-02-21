package com.sabi.logistics.core.dto.request;

import lombok.Data;

@Data
public class RejectReasonDto {

    private Long id;
    private String name;
    private Boolean additionalInfo;
}
