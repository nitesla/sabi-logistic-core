package com.sabi.logistics.core.dto.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PartnerBankResponseDto {

    private Long id;

    private Long partnerId;

    private String partnerName;

    private Long bankId;

    private String bankName;

    private String accountNumber;

    private LocalDateTime createdDate;

    private LocalDateTime updatedDate;

    private Long createdBy;

    private Long updatedBy;

    private Boolean isActive;


    private Boolean isDefault;
}
