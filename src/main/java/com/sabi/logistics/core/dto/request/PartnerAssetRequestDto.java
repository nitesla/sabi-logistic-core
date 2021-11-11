package com.sabi.logistics.core.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PartnerAssetRequestDto {
    //ID
    //Name
    //PartnerAssetTypeID
    //DriverID
    //PlateNo
    //Length
    //Width
    //Height
    //Volume
    //ContactPerson
    //Status
    //IsActive
    //Weight
    //ColorID
    //HasCover
    //IsOwner
    //TonnageType
    //BrandID
    private Long id;
    @NotBlank(message = "Name can not be blank")
    private String name;
    @NotNull(message = "PartnerAssetTypeID can not be null")
    @Min(value = 1, message = "Partner Asset Type Id can not be less than zero")
    private Long partnerAssetTypeId;
    @NotNull(message = "Driver id can not be null")
    @Min(value = 1, message = "Driver Id can not be less than zero")
    private Long driverId;
    @NotBlank(message = "Plate number can not be empty")
    private String plateNo;
    @NotNull(message = "length can not be empty")
    @DecimalMin(value = "0.0", message = "length can not be less than 0.0")
    private Double length;
    @NotNull(message = "width can not be empty")
    @DecimalMin(value = "0.0", message = "width can not be less than 0.0")
    private Double width;
    @NotNull(message = "height can not be empty")
    @DecimalMin(value = "0.0", message = "height can not be less than 0.0")
    private Double height;
    @NotNull(message = "volume can not be empty")
    @DecimalMin(value = "0.0", message = "volume can not be less than 0.0")
    private Double volume;
    @NotBlank(message = "ContactPerson  can not be blank")
    private String contactPerson;
    @NotBlank(message = "Status can not be empty")
    private String status;
    @NotNull(message = "weight can not be empty")
    @DecimalMin(value = "0.0", message = "weight can not be less than 0.0")
    private Double weight;
    @NotNull(message = "volume can not be empty")
    @Min(value = 1, message = "Color Id can not be less than 0.0")
    private long colorId;
    @NotNull(message = "hasCover can not be empty")
//    @Pattern(regexp = "^true$|^false$", message = "allowed input: true or false")
    private Boolean hasCover;
    @NotNull(message = "isOwner can not be empty")
//    @Pattern(regexp = "^true$|^false$", message = "allowed input: true or false")
    private Boolean isOwner;
    @NotBlank(message = "Tonnage type can not be null")
    private String tonnageType;
    @NotNull(message = "brand Id can not be null")
    @Min(value = 1, message = "Brand Id can not be less than 0.0")
    private Long brandId;
    @NotNull(message = "driver assistant Id can not be null")
    @Min(value = 1, message = "driver assistant Id can not be less than 0.0")
    private Long driverAssistantId;
}
