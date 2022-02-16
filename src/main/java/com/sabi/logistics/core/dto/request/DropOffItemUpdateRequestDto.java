package com.sabi.logistics.core.dto.request;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
@Data
public class DropOffItemUpdateRequestDto {
    private Long dropOffItemId;
    private Integer qty;
}
