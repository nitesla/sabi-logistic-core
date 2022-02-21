package com.sabi.logistics.core.integrations.order;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlacedBy {
    private String name;
    private String phoneNumber;
    private String spacesAccountId;
    private boolean flag;
}
