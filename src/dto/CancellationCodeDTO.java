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
@EqualsAndHashCode
@ToString
public class CancellationCodeDTO {

    @JacksonXmlProperty(isAttribute = true, localName = "CancellationCode")
    private Integer cancellationCode;
}
