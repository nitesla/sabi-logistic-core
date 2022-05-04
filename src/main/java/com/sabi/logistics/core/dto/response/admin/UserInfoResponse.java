package com.sabi.logistics.core.dto.response.admin;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserInfoResponse {

    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private Long userId;
    private String applicationCode;
    private Object actionDate;
    private String token;
    private String authKeyExpirationDate;

}
