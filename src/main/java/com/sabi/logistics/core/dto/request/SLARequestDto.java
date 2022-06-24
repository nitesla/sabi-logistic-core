package com.sabi.logistics.core.dto.request;

import com.sabi.logistics.core.enums.SlaName;
import lombok.Data;

@Data
public class SLARequestDto {

    private Long id;
    private SlaName slaName;
    private Long slaDuration;
    private Long triggerDuration;
}
