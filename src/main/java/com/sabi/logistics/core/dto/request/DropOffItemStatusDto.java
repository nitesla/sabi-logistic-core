package com.sabi.logistics.core.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DropOffItemStatusDto {
    private Long id;
    private String status;
    private Integer qtyGoodsDelivered;
}
