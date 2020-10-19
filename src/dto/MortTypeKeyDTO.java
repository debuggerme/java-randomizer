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
@ToString
@EqualsAndHashCode
public class MortTypeKeyDTO {

    @JacksonXmlProperty(isAttribute = true, localName = "MortTypeKey")
    private Integer mortTypeKey;
}
