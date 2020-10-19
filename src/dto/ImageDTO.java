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
public class ImageDTO {

    @JsonProperty("FileName")
    private String fileName;

    @JsonProperty("SequenceNumber")
    private String sequenceNumber;

    @JsonProperty("IsDefault")
    private String isDefault;

    @JsonProperty("ImageName")
    private String imageName;

    @JsonProperty("HasLargeImage")
    private String hasLargeImage;
}
