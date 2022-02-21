package com.sabi.logistics.core.integrations.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SingleOrderResponse {

    private boolean status;
    private String message;
    private OrderData data;
}
