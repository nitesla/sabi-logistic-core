package com.sabi.logistics.core.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExternalPartnerSignUpResponse {


    private Long id;
    private Long partnerId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String name;
    private String username;
}
