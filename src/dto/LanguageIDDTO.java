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
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class LanguageIDDTO {

    @JacksonXmlProperty(isAttribute = true, localName = "LanguageID")
    private Integer languageID;
}
