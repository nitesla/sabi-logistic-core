package com.sabi.logistics.core.models;


import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;
import java.math.BigDecimal;

@EqualsAndHashCode(callSuper=false)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class DropOffInvoice extends CoreEntity {

    private Long invoiceId;
    private Long dropOffId;
    private BigDecimal amount;
    private String status;
    private BigDecimal amountCollected;
}
