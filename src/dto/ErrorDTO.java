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
class ErrorDTO {
    @JsonProperty("MissingRequiredFields")
    private String missingRequiredFields;
    @JsonProperty("MLSNumber")
    private String mLSNumber;
}
