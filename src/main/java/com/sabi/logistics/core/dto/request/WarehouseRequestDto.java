package com.sabi.logistics.core.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WarehouseRequestDto {
    private Long id;
    @NotNull(message = "Partner Id can not be blank")
    @Min(message = "Partner Id can not be less than 0", value = 1L)
    private Long partnerId;
    @NotNull(message = "lga id can not be blank")
    @Min(message = "Lga id can not be less than 0", value = 1L)
    private Long lgaId;
    @Min(message = "State id can not be less than 0", value = 1L)
    private Long stateId;
    @Min(message = "Country id can not be less than 0", value = 1L)
    private Long countryId;
    @NotBlank(message = "Lga can not be blank")
    private String lgaName;
    @NotBlank(message = "State can not be blank")
    private String stateName;
    @NotBlank(message = "Country can not be blank")
    private String countryName;
    @NotBlank(message = "Address can not be blank")
    private String address;
    @NotBlank(message = "Contact person can not be empty")
    private String contactPerson;
    @NotBlank(message = "Contact phone can not be empty")
    private String contactPhone;
    @NotBlank(message = "Contact email can not be empty")
    @Email
    private String contactEmail;
    @NotBlank(message = "longitude can not be blank")
    private String longitude;
    @NotBlank(message = "Latitude can not be blank")
    private String latitude;
    @NotBlank(message = "owner can not be blank")
    private String owner;
    @NotBlank(message = "Name can not be blank")
    private String name;
    @NotNull(message = "User Id can not be null")
    private Long userId;
    private Double totalStock;
    private Double stockSold;
}
