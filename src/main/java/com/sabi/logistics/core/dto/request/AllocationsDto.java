package com.sabi.logistics.core.dto.request;

import com.sabi.logistics.core.models.AllocationHistory;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class AllocationsDto {

    private Long id;
    private Long wareHouseId;
    private String name;
    private Long blockTypeId;
    private String status;
    private Long clientId;
    private LocalDateTime expirationDate;
    private LocalDateTime startDate;
    private List<AllocationHistory> historys;
}
