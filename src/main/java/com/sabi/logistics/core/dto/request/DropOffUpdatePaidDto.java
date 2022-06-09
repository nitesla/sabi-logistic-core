package com.sabi.logistics.core.dto.request;

import com.sabi.logistics.core.enums.PaidStatus;
import lombok.Data;

@Data
public class DropOffUpdatePaidDto {
    private Long dropOffId;
    private PaidStatus paidStatus;
}
