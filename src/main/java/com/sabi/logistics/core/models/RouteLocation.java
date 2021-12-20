package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import javax.persistence.Entity;
import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class RouteLocation extends CoreEntity {
    private Long stateId;
    private String name;
    private Boolean hasToll;
    private BigDecimal tollRate;
}
