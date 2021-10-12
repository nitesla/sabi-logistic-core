package com.sabilogisticscore.models;

import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class BlockType extends CoreEntity {

    private Long id;
    private String name;
    private double lengths;
    private double width;
    private double height;
    private boolean isActive;
    private double price;
}
