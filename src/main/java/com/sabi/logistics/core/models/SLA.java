package com.sabi.logistics.core.models;


import com.sabi.framework.models.CoreEntity;
import com.sabi.logistics.core.enums.SlaName;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class SLA  extends CoreEntity {
    @Enumerated(EnumType.STRING)
    private SlaName slaName;
    private Long slaDuration;
    private Long triggerDuration;
}
