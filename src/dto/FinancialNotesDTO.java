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
@EqualsAndHashCode
@ToString
public class FinancialNotesDTO {

    @JsonProperty("FinNotes")
    private String finNotes;

    @JsonProperty("FinRegVatTax")
    private String finRegVatTax;

    @JsonProperty("FinLandTransferTax")
    private String finLandTransferTax;

    @JsonProperty("FinCommunityCost")
    private String finCommunityCost;

    @JsonProperty("FinCommunityCostPending")
    private String finCommunityCostPending;

    @JsonProperty("FinAgeOfProperty")
    private String finAgeOfProperty;

    @JsonProperty("FinQualification")
    private String finQualification;


}
