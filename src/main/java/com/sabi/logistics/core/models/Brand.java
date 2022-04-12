package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;

@Entity
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Brand extends CoreEntity {
    private String name;

    /*
    Description: Add image properties to Brand
    Date:       4/5/2022
    Author:     Afam Okonkwo
     */
    private String image;
}
