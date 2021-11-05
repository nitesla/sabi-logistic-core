package com.sabi.logistics.core.dto.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeliveryResponseDto {

    private Long id;
    private long partnerAssetID;
    private long orderItemID;
    private String status;
    private long driverID;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private long driverAssistantID;
    private LocalDateTime createdDate;


}
