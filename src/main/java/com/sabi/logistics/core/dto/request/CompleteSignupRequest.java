package com.sabi.logistics.core.dto.request;


import com.sabi.logistics.core.models.PartnerAssetType;
import com.sabi.logistics.core.models.PartnerCategories;
import com.sabi.logistics.core.models.PartnerLocation;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class CompleteSignupRequest {
    private Long id;
    private String name;
    private Long lgaId;
    private String address;
    private String phone;
    private boolean isRegistered;
    private String cac;
    private int employeeCount;
    private String email;
    private String webSite;
    private LocalDateTime registrationDate = LocalDateTime.now();
    private String registrationToken;
    private String registrationTokenExpiration;
    private List<PartnerCategories> categories;
    private List<PartnerAssetType> assets;
    private List<PartnerLocation> locations;
}
