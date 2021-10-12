package com.sabilogisticscore.models;

import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class Client extends CoreEntity {

    private Long id;
    private Long UserId;
    private boolean isActive;
    private LocalDateTime createDate = LocalDateTime.now();
}
