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
public class MortgageDTO {

    @JsonProperty("MortBank")
    private String mortBank;

    @JsonProperty("MortCurrentMortgage")
    private String mortCurrentMortgage;

    @JsonProperty("MortDownPayment")
    private String mortDownPayment;

    @JsonProperty("MortTypeKey")
    private MortTypeKeyDTO mortTypeKeyDTO;

    @JsonProperty("MortYearsPending")
    private String mortYearsPending;

    @JsonProperty("MortPayment")
    private String mortPayment;

    @JsonProperty("MortAmountPending")
    private String mortAmountPending;

    @JsonProperty("MortPaymentPeriod")
    private MortPaymentPeriodDTO mortPaymentPeriodDTO;


}
