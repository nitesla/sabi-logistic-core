package com.sabi.logistics.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Transient;
import java.time.LocalDateTime;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class PartnerUser extends CoreEntity {
    private long partnerId;
    private long userId;
    private String userType;

    @Transient
    private Long loginAttempts;
    @Transient
    private LocalDateTime failedLoginDate;
    @Transient
    private LocalDateTime lastLogin;
    @Transient
    private Date lockedDate;
    @Transient
    private String firstName;
    @Transient
    private String lastName;
    @Transient
    private String middleName;
    @Transient
    private String username;
    @Transient
    private Long roleId;
    @Transient
    private String roleName;
    @Transient
    private LocalDateTime passwordChangedOn;
    @Transient
    private String email;
    @Transient
    private String phone;






}
