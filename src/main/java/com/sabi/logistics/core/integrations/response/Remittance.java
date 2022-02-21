package com.sabi.logistics.core.integrations.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Remittance {

    private String approvalBy;
    private String approvalDate;
    private int orderId;
    private String paymentMethod;
    private String transactionReference;
    private String partnerReference;
    private int amountPaid;
    private String paymentDate;
    private String createdBy;
    private String approvalStatus;
    private String comment;
    private String receiptURL;
}
