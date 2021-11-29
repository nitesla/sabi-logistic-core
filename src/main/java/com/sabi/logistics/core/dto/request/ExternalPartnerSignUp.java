package com.sabi.logistics.core.dto.request;

import com.sabi.logistics.core.models.PartnerAssetType;
import com.sabi.logistics.core.models.PartnerLocation;
import lombok.Data;

import java.util.List;

@Data
public class ExternalPartnerSignUp {


    private String supplierCategoryId;
    private String address;
    private String email;
    private String lgaId;
    private String firstName;
    private String lastName;
    private String password;
    private String name;
    private String phone;
    private String webSite;
    private List<PartnerAssetType> assets;
    private List<PartnerLocation> locations;

//    private String deliveryType;




}
