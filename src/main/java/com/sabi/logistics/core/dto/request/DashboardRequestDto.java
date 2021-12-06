package com.sabi.logistics.core.dto.request;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DashboardRequestDto {
    private Long partnerId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
