package com.sabi.logistics.core.dto.request;


import lombok.Data;

@Data
public class ValidateOTPRequest {
    private String registrationToken;
    private Long updatedBy;
    private Boolean isActive;
}
