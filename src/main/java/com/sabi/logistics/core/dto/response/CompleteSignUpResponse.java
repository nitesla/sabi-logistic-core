package com.sabi.logistics.core.dto.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CompleteSignUpResponse {

    private Long partnerId;
    private String name;
    private String address;
    private String phone;
    private String email;
    private LocalDateTime registrationDate;
    private long userId;
    private String userEmail;
    private String firstName;
    private String lastName;
    private String userPhone;
    private String userName;




//    private List<PartnerCategories> categories;
//    private List<PartnerAssetType> assets;
//    private List<PartnerLocation> locations;
}
