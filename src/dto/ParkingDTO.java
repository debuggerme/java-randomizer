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
@EqualsAndHashCode
@ToString
public class ParkingDTO {

    @JacksonXmlProperty(isAttribute = true, localName = "ParkingCost")
    private String parkingCost;

    @JacksonXmlProperty(isAttribute = true, localName = "ParkingCostCode")
    private Integer parkingCostCode;
}
