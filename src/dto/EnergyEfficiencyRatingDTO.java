package com.debuggerme.remaxsouth.synccrawler.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class EnergyEfficiencyRatingDTO {

    @JacksonXmlProperty(isAttribute = true, localName = "Rating")
    private String rating;

    @JacksonXmlProperty(isAttribute = true, localName = "EnergyTypeCode")
    private Integer energyTypeCode;

    @JsonProperty("EnergyPerformance")
    private String energyPerformance;

    @JsonProperty("EnergyRatingUOMcode")
    private EnergyRatingUOMcodeDTO energyRatingUOMcodeDTO;

    @JsonProperty("RatingValue")
    private String ratingValue;

    @JsonProperty("IncludesEnergyForWarmWater")
    private Boolean includesEnergyForWarmWater;

    @JsonProperty("ElectricityConsumption")
    private ElectricityConsumptionDTO electricityConsumptionDTO;

    @JsonProperty("EnergyCertificateType")
    private EnergyCertificateTypeDTO energyCertificateTypeDTO;
}
