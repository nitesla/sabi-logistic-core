package com.sabi.logistics.core.dto.request;

import com.sabi.logistics.core.enums.ReturnStatus;
import lombok.Data;

import java.util.List;

@Data
public class DropOffUpdateRequestDto {
    private Long dropOffId;
    private ReturnStatus returnedStatus;
    private List<DropOffItemUpdateRequestDto> dropOffItems;
}
