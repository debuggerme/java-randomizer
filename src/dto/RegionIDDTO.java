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
@EqualsAndHashCode
@ToString
public class RegionIDDTO {

    @JacksonXmlProperty(isAttribute = true, localName = "RegionID")
    private Integer regionID;
}
