package com.sabi.logistics.core.models;


import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class Category extends CoreEntity {

    private String name;
    private String image;
    private String description;
    private boolean hasAsset;
    private boolean hasWareHouse;

}
