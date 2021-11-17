package com.sabi.logistics.core.models;


import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper=false)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Driver extends CoreEntity {



    private Long partnerId;
    private Long userId;
}
