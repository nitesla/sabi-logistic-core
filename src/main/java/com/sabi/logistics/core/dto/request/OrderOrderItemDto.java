package com.sabi.logistics.core.dto.request;

import com.sabi.logistics.core.enums.Party;
import com.sabi.logistics.core.enums.PaymentStatus;
import lombok.Data;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class OrderOrderItemDto {

    private Long id;
    @NotBlank(message = "Delivery Status can not be blank")
    private String deliveryStatus;

    @NotBlank(message = "Customer Name can not be empty")
    private String customerName;

    @NotBlank(message = "Customer Phone can not be empty")
    private String customerPhone;

    @NotBlank(message = "Delivery Address can not be empty")
    private String deliveryAddress;

    private LocalDateTime dateDelivered;

    private LocalDateTime expectedDeliveryDate;

    @NotNull(message = "Total Amount can not be empty")
    @DecimalMin(value = "0.0", message = "Total Amount can not be less than 0.0")
    private Double totalAmount;

    @NotNull(message = "Total Quantity can not be empty")
    @Min(message = "Total Quantity can not be less than 0", value = 1)
    private Integer totalQuantity;

    private Double tax;

    private PaymentStatus paymentStatus;

    @NotBlank(message = "Order Number can not be empty")
    private String orderNumber;

    private Party sourceparty;
    private Party destinationparty;
    private Boolean hasMultipleDeliveryAddress;

    List<OrderItemRequestDto> OrderItemRequestDto;
}
