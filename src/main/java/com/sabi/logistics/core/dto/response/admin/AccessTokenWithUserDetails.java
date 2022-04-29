package com.sabi.logistics.core.dto.response.admin;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sabi.framework.dto.responseDto.PartnersCategoryReturn;
import com.sabi.framework.models.User;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
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
    @JsonProperty("clientId")
    private String clientId;
    @JsonProperty("transactionPinStatus")
    private String transactionPinStatus;
    @JsonProperty("referralCode")
    private String referralCode;
    @JsonProperty("isEmailVerified")
    private String isEmailVerified;
    @JsonProperty("photo")
    private String photo;

    private Long globalAdminUserId;

    private String token;

    private String globalAdminToken;

    private String applicationCode;

    public AccessTokenWithUserDetails(String token, User user, String menu, long tokenExpiry, String clientId, String referralCode, String isEmailVerified, List<PartnersCategoryReturn> partnerCategory) {
        this.accessToken = token;
        this.email = user.getEmail();
        this.phone = user.getPhone();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.middleName = user.getMiddleName();
        this.lastLogin = user.getLastLogin();
        this.photo = user.getPhoto();
        this.menu = menu;
        this.tokenExpiry = tokenExpiry;
        this.userId = user.getId();
        this.clientId = clientId;
        this.transactionPinStatus = user.getTransactionPinStatus();
        this.referralCode = referralCode;
        this.isEmailVerified = isEmailVerified;
    }
}

