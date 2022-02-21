package com.sabi.logistics.core.integrations.order;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentInfo {

    private int paymentMethod;
    private Object transactionReference;
    private String paymentMethodDesc;
}
