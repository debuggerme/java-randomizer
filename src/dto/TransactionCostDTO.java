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
@EqualsAndHashCode
@ToString
public class TransactionCostDTO {

    @JacksonXmlProperty(isAttribute = true, localName = "TransactionCost")
    private Integer transactionCost;
}
