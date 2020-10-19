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
public class HeatingDTO {

    @JacksonXmlProperty(isAttribute = true, localName = "HeatingCost")
    private String heatingCost;

    @JacksonXmlProperty(isAttribute = true, localName = "HeatingCostCode")
    private Integer heatingCostCode;

    @JacksonXmlProperty(isAttribute = true, localName = "IsHeatingCostIncluded")
    private Integer isHeatingCostIncluded;
}
