package com.sabi.logistics.core.dto.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Transient;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
/**
 Description: disables JsonInclude to return null values for the qa and frontend to observe
 Date:       06/04/2022
 Author:     Afam Okonkwo
 */
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentTermsResponseDto {

    private Long id;

    private Long partnerAssetTypeId;

    private String partnerAssetTypeName;

    /**
     Description: Includes 'partnerName' property to PaymentTerms
     Date:       06/04/2022
     Author:     Afam Okonkwo
     */
    private String partnerName;

    /**
     Description: Includes 'image' and 'companyName' properties under PaymentTerms
     Date:       14/04/2022
     Author:     Afam Okonkwo
     */
    private String image;

    private String companyName;

    private Integer days;

    private LocalDateTime createdDate;

    private LocalDateTime updatedDate;

    private Long createdBy;

    private Long updatedBy;

    private Boolean isActive;
}
