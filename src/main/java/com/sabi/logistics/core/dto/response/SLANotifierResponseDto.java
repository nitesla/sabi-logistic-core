package com.sabi.logistics.core.dto.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.sabi.logistics.core.models.SLA;
import lombok.Data;

import java.time.LocalDateTime;


@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class SLANotifierResponseDto {


    private Long id;

    private Long slaId;
    private String name;
    private String email;

    private LocalDateTime createdDate;

    private LocalDateTime updatedDate;

    private Long createdBy;

    private Long updatedBy;

    private Boolean isActive;

    private SLA sla;
}
