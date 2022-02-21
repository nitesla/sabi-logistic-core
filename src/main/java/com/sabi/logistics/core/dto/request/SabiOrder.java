package com.sabi.logistics.core.dto.request;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
@Data
public class SabiOrder{
    private Long id;
    private Object userId;
    private String userName;
    private String email;
    private String phoneNumber;
    private String orderNumber;
    private String location;
    private String deliveryState;
    private Object deliveryPackageReference;
    private String placedFor;
    private Object pickupPackageReference;
    private long totalPrice;
    private long subTotal;
    private long serviceFee;
    private long deliveryFee;
    private long noOfItems;
    private Object createdDate;
    private long orderStatus;
    private long fulfilmentStatus;
    private Object orderItems;
    private List<Object> admincomments;
    private List<Object> customercomments;
    private String deliveryNote;
    private String partnerReference;
    private String orderInvoice;
    private long orderCancelledReason;
    private String orderReferalCode;
    private long packedCount;
    private long deliveredCount;
    private long cancelledCount;
    private long orderChannel;
    private boolean hasGroupBuyOrderItem;
    private long agentComissionType;
    private String agentUserId;
    private String agentPhoneNumber;
    private boolean orderPlacedBy;
    private String transactionReference;
    private long paymentMethod;
    private String paymentMethodDescription;
    private boolean isNewCustomer;
    private long orderFlag;
}

