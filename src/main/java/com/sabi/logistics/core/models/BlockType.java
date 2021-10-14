package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class BlockType extends CoreEntity {


    private String name;
    private double length;
    private double width;
    private double height;
    private double price;
}
