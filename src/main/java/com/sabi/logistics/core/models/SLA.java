package com.sabi.logistics.core.models;


import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class SLA  extends CoreEntity {
    private String name;
    private long slaDuration;
    private long triggerDuration;
}
