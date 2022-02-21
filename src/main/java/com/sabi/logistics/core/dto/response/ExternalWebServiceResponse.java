package com.sabi.logistics.core.dto.response;

import com.sabi.logistics.core.dto.request.SabiOrder;
import lombok.Data;

import java.util.List;

@Data
public class ExternalWebServiceResponse {

    private boolean status;
    private String message;
    private long totalRecords;
    private List<SabiOrder> data;
}
