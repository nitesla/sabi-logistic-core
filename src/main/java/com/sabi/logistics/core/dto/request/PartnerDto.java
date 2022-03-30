package com.sabi.logistics.core.dto.request;

import lombok.Data;

@Data
public class PartnerDto {

    private Long id;
    private String name;
    private Long lgaId;
    private Long stateId;
    private Long countryId;
    private String lga;
    private String state;
    private String country;

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
