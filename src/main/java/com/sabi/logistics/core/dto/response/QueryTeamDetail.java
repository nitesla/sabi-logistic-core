package com.sabi.logistics.core.dto.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryTeamDetail {
    private String phone;
    private String email;
    private LocalDateTime lastLogin;
    private LocalDateTime registrationDate;
    private String location;
}
