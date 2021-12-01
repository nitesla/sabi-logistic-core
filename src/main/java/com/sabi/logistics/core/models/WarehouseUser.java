package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Transient;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class WarehouseUser extends CoreEntity {
    private long wareHouseId;
    private long userId;
    @Transient
    private String firstName;
    @Transient
    private String lastName;
    @Transient
    private String middleName;
    @Transient
    private String username;
    @Transient
    private String email;
    @Transient
    private String phone;
    @Transient
    private String wareHouseName;
    @Transient
    private Long roleId;
    @Transient
    private String roleName;

}
