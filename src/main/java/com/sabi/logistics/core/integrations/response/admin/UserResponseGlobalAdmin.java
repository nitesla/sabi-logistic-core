package com.sabi.logistics.core.integrations.response.admin;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import com.sabi.logistics.core.dto.response.admin.*;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserResponseGlobalAdmin {

    private String code;
    private String description;
    private UserInfoResponse data;
}
