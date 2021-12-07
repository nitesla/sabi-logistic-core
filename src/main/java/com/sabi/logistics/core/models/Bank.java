package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class Bank extends CoreEntity {


    private String name;
    private String code;

    public Bank(String name, String code) {
        this.name = name;
        this.code = code;
    }
}
