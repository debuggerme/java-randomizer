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
public class PropertyCategoryDTO {

    @JacksonXmlProperty(isAttribute = true, localName = "PropertyCategory")
    private Integer propertyCategory;
}
