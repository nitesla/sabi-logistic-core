package com.sabi.logistics.core.dto.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.sabi.logistics.core.enums.SlaName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class SLAResponseDto {

    private Long id;

    private SlaName slaName;
    private Long slaDuration;
    private Long triggerDuration;

    private LocalDateTime createdDate;

    private LocalDateTime updatedDate;

    private Long createdBy;

    private Long updatedBy;

    private Boolean isActive;
}
