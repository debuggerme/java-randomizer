package com.debuggerme.remaxsouth.synccrawler.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jamith Nimantha
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class UploadXML {
    @JsonProperty("Version")
    private String version;
    @JsonProperty("Properties")
    private List<PropertyDTO> properties = new ArrayList<>();
    @JsonProperty("Errors")
    private List<ErrorDTO> errorDTOS = new ArrayList<>();

}
