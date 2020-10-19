package com.debuggerme.remaxsouth.synccrawler.dto;

import com.debuggerme.remaxsouth.synccrawler.entity.Feature;
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
public class FeatureDTO {

    @JacksonXmlProperty(isAttribute = true, localName = "FeatureID")
    private Integer featureID;

    public Feature toEntity() {
        Feature feature = new Feature();
        feature.setCode(featureID);
        return feature;
    }


}
