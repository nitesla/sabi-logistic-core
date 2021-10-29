package com.sabi.logistics.core.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AllocationResponseDto {

    private Long id;
    private Long wareHouseId;
    private String name;
    private Long blockTypeId;
    private String status;
    private Long clientId;
    private LocalDateTime expirationDate;
    private LocalDateTime startDate;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;
}
