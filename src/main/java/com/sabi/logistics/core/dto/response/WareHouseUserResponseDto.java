package com.sabi.logistics.core.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WareHouseUserResponseDto {
    private Long id;
    private long wareHouseId;
    private String wareHouseName;
    private long userId;
    private String firstName;
    private String lastName;
    private String middleName;
    private String username;
    private String email;
    private String phone;
    private Long roleId;
    private String roleName;
    /**
     Description: Add 'image' and 'category' properties to WarehouseProduct
     Date:       4/5/2022
     Author:     Afam Okonkwo
     */
    private String image;
    private String category;
}
