package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;


@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class PartnerAssetPicture extends CoreEntity {


    private Long partnerAssetId;
    private String pictureType;
    private String image;

}
