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
public class AppraisalDTO {

    @JsonProperty("SequenceNumber")
    private String sequenceNumber;

    @JsonProperty("AppraisalValue")
    private String appraisalValue;

    @JsonProperty("AppraisalCompany")
    private String appraisalCompany;

    @JsonProperty("AppraisalDate")
    private String appraisalDate;

    @JsonProperty("PropertyAge")
    private String propertyAge;

    @JsonProperty("Qualification")
    private String qualification;
}
