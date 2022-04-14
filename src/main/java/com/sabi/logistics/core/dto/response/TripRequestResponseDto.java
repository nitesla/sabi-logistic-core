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
public class TripRequestResponseDto {
    private Long id;
    private Long tripRequestId;
    private String status;
    private Long partnerId;
    private String partnerName;
    private LocalDateTime responseDate;
    private String rejectReason;
    private String additionalInfo;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Number totalQtyPickedUp;
    private Boolean isActive;
}
