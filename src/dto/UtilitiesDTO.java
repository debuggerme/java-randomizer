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
public class UtilitiesDTO {

    @JacksonXmlProperty(isAttribute = true, localName = "UtilitiesFee")
    private String utilitiesFee;

    @JacksonXmlProperty(isAttribute = true, localName = "UtilitiesCode")
    private Integer utilitiesCode;
}
