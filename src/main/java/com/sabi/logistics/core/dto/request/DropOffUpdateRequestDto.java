package com.sabi.logistics.core.dto.request;

import lombok.Data;

import java.util.List;

@Data
public class DropOffUpdateRequestDto {
    private Long dropOffId;
    private String returnedStatus;
    private List<DropOffItemUpdateRequestDto> dropOffItems;
}
