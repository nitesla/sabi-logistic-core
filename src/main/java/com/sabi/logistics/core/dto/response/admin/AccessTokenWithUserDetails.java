package com.sabi.logistics.core.dto.response.admin;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sabi.framework.dto.responseDto.PartnersCategoryReturn;
import com.sabi.framework.models.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccessTokenWithUserDetails implements Serializable {
    @JsonProperty("accessToken")
    private String accessToken;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("email")
    private String email;
    @JsonProperty("menu")
    private String menu;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("middleName")
    private String middleName;
    @JsonProperty("lastLogin")
    private LocalDateTime lastLogin;
    @JsonProperty("tokenExpiry")
    private long tokenExpiry;
    @JsonProperty("userId")
    private long userId;
    private Long globalAdminUserId;

    private String globalAdminToken;

    private String applicationCode;
    private String username;

    private LocalDateTime actionDate;

    private String authKeyExpirationDate;

    private List<AdminPermission> permissions;

}

