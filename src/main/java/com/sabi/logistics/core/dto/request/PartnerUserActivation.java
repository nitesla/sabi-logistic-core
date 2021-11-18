package com.sabi.logistics.core.dto.request;

import lombok.Data;

@Data
public class PartnerUserActivation {
    private String email;
    private String activationUrl;
}
