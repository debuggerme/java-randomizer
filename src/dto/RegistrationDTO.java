package com.debuggerme.remaxsouth.synccrawler.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class RegistrationDTO {

    @JsonProperty("RegReference")
    private String regReference;

    @JsonProperty("RegNotary")
    private String regNotary;

    @JsonProperty("RegCouncil")
    private String regCouncil;

    @JsonProperty("RegDate")
    private String regDate;

    @JsonProperty("RegProtocol")
    private String regProtocol;

    @JsonProperty("RegVolume")
    private String regVolume;

    @JsonProperty("RegBook")
    private String regBook;

    @JsonProperty("RegFolio")
    private String regFolio;

    @JsonProperty("RegisterByVendor")
    private String registerByVendor;

    @JsonProperty("RegDateRequested")
    private String regDateRequested;
}
