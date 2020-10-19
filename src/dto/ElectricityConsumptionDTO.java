package com.debuggerme.remaxsouth.synccrawler.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Jamith Nimantha
 * @project remaxsouth_crawler
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ElectricityConsumptionDTO {

    @JacksonXmlProperty(isAttribute = true, localName = "UOM")
    private Integer uOM;

    @JacksonXmlText
    private String electricityConsumption;
}
