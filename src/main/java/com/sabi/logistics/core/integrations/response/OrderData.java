package com.sabi.logistics.core.integrations.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sabi.logistics.core.integrations.order.OrderItem;
import lombok.Data;

import java.util.Date;
import java.util.List;
import com.sabi.logistics.core.integrations.order.*;
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderData {

    private int orderId;
    private Object orderDate;
    private String orderNumber;
    private int numberOfItems;
    private OrderDelivery orderDelivery;
    private Payment payment;
    private CustomerDetails customerDetails;
    private PaymentInfo paymentInfo;
    private List<OrderItem> orderItems;
    private PlacedBy placedBy;
    private List<Remittance> remittances;
    private int totalAmountPaid;
    private int totalUnpaidBalance;
    private FinancialDetails financialDetails;
}
