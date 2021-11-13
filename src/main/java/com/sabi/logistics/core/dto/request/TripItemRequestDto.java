package com.sabi.logistics.core.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TripItemRequestDto {
    private Long id;
    private Long tripRequestID;
    private String status;
    private LocalDateTime deliveryDate;
    private Long orderItemID;
}
