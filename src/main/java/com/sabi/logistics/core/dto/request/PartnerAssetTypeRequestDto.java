package com.sabi.logistics.core.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PartnerAssetTypeRequestDto {
    private Long Id;
    @NotNull(message = "Partner Id can not be empty")
    @Min(value = 1, message = "Partner Id can not be lower than 0")
    private Long partnerId;
    @NotNull(message = "AssetType Id can not be empty")
    @Min(value = 1, message = "AsseType Id can not be lower than 0")
    private Long assetTypeId;
    @NotNull(message = "Total can not be empty")
    private Integer total;
}
