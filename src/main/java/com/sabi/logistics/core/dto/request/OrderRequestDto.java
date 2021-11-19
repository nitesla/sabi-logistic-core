package com.sabi.logistics.core.dto.request;

import com.sabi.logistics.core.models.OrderItem;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderRequestDto {
    private Long id;

    @NotNull(message = "WareHouse Id can not be blank")
    @Min(message = "WareHouse Id can not be less than 1", value = 1)
    private Long wareHouseID;

//    @NotNull(message = "Reference No can not be blank")
//    @Min(message = "Reference No can not be less than 0", value = 1)
//    private String referenceNo;

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

//    @NotBlank(message = "BarCode can not be blank")
//    private String barCode;
//
//    @NotBlank(message = "QRcode can not be blank")
//    private String QRcode;

    @NotNull(message = "Total Amount can not be empty")
    @DecimalMin(value = "0.0", message = "Total Amount can not be less than 0.0")
    private Double totalAmount;

    @NotNull(message = "Total Quantity can not be empty")
    @Min(message = "Total Quantity can not be less than 0", value = 1)
    private Integer totalQuantity;

    private OrderItem orderItem;

}
