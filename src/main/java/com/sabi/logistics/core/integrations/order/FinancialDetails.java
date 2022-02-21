package com.sabi.logistics.core.integrations.order;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FinancialDetails {

    private int subTotal;
    private int deliveryCharge;
    private int serviceCharge;
    private int totalPrice;
    private int deliveredValue;
}
