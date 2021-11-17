package com.sabi.logistics.core.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PartnerUserRequestDto {

    private Long id;
    private Long roleId;
    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private String phone;
    private String userType;


}
