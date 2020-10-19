package com.debuggerme.remaxsouth.synccrawler.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Jamith Nimantha
 */

@Setter
@Getter
@ToString
@EqualsAndHashCode
public class PropertyTypeDTO {

    @JacksonXmlProperty(isAttribute = true, localName = "PropertyType")
    private Integer propertyType;
}
