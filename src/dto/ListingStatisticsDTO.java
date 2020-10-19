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
public class ListingStatisticsDTO {

    @JsonProperty("WebPageViews")
    private String webPageViews;
}
