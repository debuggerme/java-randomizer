package com.debuggerme.remaxsouth.synccrawler.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class PropertyDescriptionDTO {

    @JsonProperty("LanguageID")
    private LanguageIDDTO languageIDDTO;

    @JsonProperty("DescriptionText")
    private String descriptionText;

    @JsonProperty("DescriptionType")
    private DescriptionTypeDTO descriptionTypeDTO;
}
