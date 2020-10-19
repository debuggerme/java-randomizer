package com.debuggerme.remaxsouth.synccrawler.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
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
public class CancellationReasonDTO {

    @JacksonXmlProperty(isAttribute = true, localName = "CancelledBy")
    private CancelledByDTO cancelledByDTO;

    @JacksonXmlProperty(isAttribute = true, localName = "CancellationCode")
    private CancellationCodeDTO cancellationCodeDTO;

}
