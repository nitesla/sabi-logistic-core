package com.sabi.logistics.core.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PartnerUserRequestDto {
    private Long id;
    @NotNull(message = "partnerId can not be null")
    @Min(value = 1, message = "Partner Id can not be less than zero")
    private Long partnerId;
    @NotNull(message = "User Id can not be null")
    private Long userId;
}
