package com.sabi.logistics.core.dto.request;

import com.sabi.logistics.core.enums.VerificationStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderItemRequestDto {
    private Long id;

    @NotBlank(message = "Delivery Status can not be blank")
    private String deliveryStatus;

    @NotNull(message = "orderId can not be blank")
    @Min(message = "orderId can not be less than 1", value = 1)
    private Long orderId;

    private LocalDateTime dateDelivered;

    @NotBlank(message = "Name can not be empty")
    private String productName;

    @NotNull(message = "Qty can not be empty")
    @Min(message = "Qty can not be less than 0", value = 1)
    private Integer qty;


    private LocalDateTime expectedDeliveryDate;

    @NotNull(message = "Weight can not be empty")
    @Min(message = "Weight can not be less than 0", value = 1)
    private Integer weight;

    @NotNull(message = "Height can not be empty")
    @Min(message = "Height can not be less than 0", value = 1)
    private Integer height;

    @NotNull(message = "Length can not be empty")
    @Min(message = "Length can not be less than 0", value = 1)
    private Integer length;

    @NotNull(message = "WareHouse Id can not be blank")
    @Min(message = "WareHouse Id can not be less than 1", value = 1)
    private Long wareHouseId;

    private String thirdPartyProductId;

    @NotNull(message = "unitPrice can not be empty")
    @DecimalMin(value = "0.0", message = "unitPrice can not be less than 0.0")
    private BigDecimal unitPrice;

    @NotNull(message = "Total Price can not be empty")
    @DecimalMin(value = "0.0", message = "Total Price can not be less than 0.0")
    private BigDecimal totalPrice;

    private String paymentReference;

    private VerificationStatus verificationStatus;

    private String deliveryAddress;
}
