package com.sabi.logistics.core.integrations.order;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatusQuantity {
    private int status;
    private String statusDesc;
    private int quantity;
    private String date;
}
