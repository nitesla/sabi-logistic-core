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
public class TripRequestResponseReqDto {
    private Long id;
    private Long tripRequestId;
    private String status;
    private Long partnerId;
    private LocalDateTime responseDate;
    private String rejectReason;
}
