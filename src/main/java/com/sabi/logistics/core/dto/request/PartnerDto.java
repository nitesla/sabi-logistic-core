package com.sabi.logistics.core.dto.request;

import lombok.Data;



@Data
public class PartnerDto {

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
    private String registrationToken;
    private String registrationTokenExpiration;
}
