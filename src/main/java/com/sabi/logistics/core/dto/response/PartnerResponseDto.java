package com.sabi.logistics.core.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PartnerResponseDto {

    private Long id;
    private String name;
    private Long lgaId;
    private String address;
    private String phone;
    private boolean isRegistered;
    private String cac;
    private int employeeCount;
    private String email;
    private String webSite;
    private LocalDateTime registrationDate;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;
}
