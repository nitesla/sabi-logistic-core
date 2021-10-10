package com.sabilogisticscore.models;


import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class AssetTypeProperties extends CoreEntity {

    private String name;
    private String image;
    private String description;
}
