package com.debuggerme.remaxsouth.synccrawler.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class DevelopmentDTO {
    @JsonProperty("DevelopmentName")
    private String developmentName;

    @JsonProperty("DevelopmentLogo")
    private String developmentLogo;
}
