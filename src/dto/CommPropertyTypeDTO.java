package com.debuggerme.remaxsouth.synccrawler.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
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
@EqualsAndHashCode
@ToString
public class CommPropertyTypeDTO {

    @JacksonXmlProperty(isAttribute = true, localName = "CommPropertyType")
    private String commPropertyType;
}
