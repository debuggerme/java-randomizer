package com.debuggerme.remaxsouth.synccrawler.dto;

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
public class MortPaymentPeriodDTO {

    @JacksonXmlProperty(isAttribute = true, localName = "MortPaymentPeriod")
    private Integer mortPaymentPeriod;
}
