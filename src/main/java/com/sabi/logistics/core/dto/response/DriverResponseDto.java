package com.sabi.logistics.core.dto.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.time.LocalDateTime;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DriverResponseDto {


    private Long id;
    private String name;
    private Long partnerAssetId;
    private String partnerAssetName;
    private Long partnerId;
    private String partnerName;
    private Long userId;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;
}
