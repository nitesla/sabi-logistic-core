package com.sabi.logistics.core.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WarehouseResponseDto {

    private Long id;
    private Boolean isActive;
    private Long partnerId;
    private Long lgaId;
    private String address;
    private String contactPerson;
    private String contactPhone;
    private String contactEmail;
    private String longitude;
    private String latitude;
    private String owner;
    private String name;
    private String lgaName;
    private Long stateId;
    private String stateName;
    private Long userId;
    private String wareHouseManager;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Double totalStock;
    private Double stockSold;
    private Double stockLeft;
}
