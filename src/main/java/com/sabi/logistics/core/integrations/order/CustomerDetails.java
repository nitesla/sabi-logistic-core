package com.sabi.logistics.core.integrations.order;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerDetails {
    private String name;
    private String email;
    private String phoneNumber;
    private boolean isNewCustomer;
}
