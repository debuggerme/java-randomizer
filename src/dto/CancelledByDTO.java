package com.debuggerme.remaxsouth.synccrawler.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author bossmanlk
 * @project remaxsouth_crawler
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class CancelledByDTO {

    @JacksonXmlProperty(isAttribute = true, localName = "CancelledBy")
    private String cancelledBy;

}
