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
public class TripResponseDto {

    private Long id;
    private long partnerID;
    private String partnerName;
    private long orderItemID;
    private String orderItemName;
    private String status;
    private LocalDateTime createdDate;


}
