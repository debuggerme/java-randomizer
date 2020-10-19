package com.debuggerme.remaxsouth.synccrawler.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class RoomDTO {

    @JsonProperty("RoomType")
    private RoomTypeDTO roomTypeDTO;

    @JsonProperty("RoomDescription")
    private String roomDescription;

    @JsonProperty("RoomDimensions")
    private String roomDimensions;

    @JsonProperty("RoomSize")
    private String roomSize;

}
