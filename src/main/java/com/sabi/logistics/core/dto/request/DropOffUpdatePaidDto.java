package com.sabi.logistics.core.dto.request;

import lombok.Data;

@Data
public class DropOffUpdatePaidDto {
    private Long dropOffId;
    private String paidStatus;
}
