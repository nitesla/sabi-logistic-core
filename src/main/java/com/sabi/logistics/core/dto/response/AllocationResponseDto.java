package com.sabi.logistics.core.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sabi.logistics.core.models.AllocationHistory;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AllocationResponseDto {

    private Long id;
    private Long wareHouseId;
    private String name;
    private Long blockTypeId;
    private String status;
    private Long clientId;
    private List<AllocationHistory> historys;
    private LocalDateTime expirationDate;
    private LocalDateTime startDate;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;
}
