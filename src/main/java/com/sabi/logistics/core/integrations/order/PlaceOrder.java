package com.sabi.logistics.core.integrations.order;


import com.sabi.logistics.core.integrations.order.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class PlaceOrder {

    private int checkoutUserType;
    private String customerComment;
    private String location;
    private OrderDelivery orderDelivery;
    private List<Product> products;
    @NotNull(message = "Merchant Id is required")
    private Long merchantId;
    @NotNull(message = "Agent Id is required")
    private Long agentId;
}
