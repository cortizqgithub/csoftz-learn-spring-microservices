/*----------------------------------------------------------------------------*/
/* Source File:   LICENSE.JAVA                                                */
/* Copyright (c), 2022 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Jun.20/2022  COQ  File created.
 -----------------------------------------------------------------------------*/
package com.csoftz.optimagrowth.license.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class License {
    private int id;
    private String licenseId;
    private String description;
    private String organizationId;
    private String productName;
    private String licenseType;
}
