package com.sabi.logistics.core.dto.request;

import com.sabi.logistics.core.models.PartnerAssetType;
import lombok.Data;

import java.util.List;

@Data
public class ExternalPartnerSignUp {



    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String name;
    private String password;
    private List<PartnerAssetType> assets;










}
