package com.sabi.logistics.core.models;


import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class SLANotifier extends CoreEntity {
    private Long slaId;
    private String name;
    private String email;
    @Transient
    private String slaName;
}
