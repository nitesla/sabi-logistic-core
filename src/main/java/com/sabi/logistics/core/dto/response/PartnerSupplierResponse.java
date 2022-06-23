package com.sabi.logistics.core.dto.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PartnerSupplierResponse {

    private Long id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private String phone;
    private String username;
    private Long partnerId;
}
