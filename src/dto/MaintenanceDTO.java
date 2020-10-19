package com.debuggerme.remaxsouth.synccrawler.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Jamith Nimantha
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class MaintenanceDTO {

    @JacksonXmlProperty(isAttribute = true, localName = "MaintenanceFee")
    private String maintenanceFee;

    @JacksonXmlProperty(isAttribute = true, localName = "MaintenanceFeeCode")
    private Integer maintenanceFeeCode;
}
