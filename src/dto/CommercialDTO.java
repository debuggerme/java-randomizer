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
public class CommercialDTO {

    @JsonProperty("CommPropertyType")
    private CommPropertyTypeDTO commPropertyTypeDTO;

    @JsonProperty("CommCategoryCode")
    private String commCategoryCode;

    @JsonProperty("CommLotSize")
    private String commLotSize;

    @JsonProperty("CommLotSizeDimensions")
    private String commLotSizeDimensions;

    @JsonProperty("CommCubicVolume")
    private String commCubicVolume;

    @JsonProperty("CommNumberOfOffices")
    private String commNumberOfOffices;

    @JsonProperty("CommNumberOfFloors")
    private String commNumberOfFloors;

    @JsonProperty("CommTotalNumberOfRooms")
    private String commTotalNumberOfRooms;

    @JsonProperty("CommBuildingFrontage")
    private String commBuildingFrontage;

    @JsonProperty("CommClearanceHeight")
    private String commClearanceHeight;

    @JsonProperty("CommElevators")
    private String commElevators;

    @JsonProperty("CommFutureUse")
    private String commFutureUse;

    @JsonProperty("CommIncomePerYear")
    private String commIncomePerYear;

    @JsonProperty("CommLand")
    private String commLand;

    @JsonProperty("CommLeaseArea")
    private String commLeaseArea;

    @JsonProperty("CommManufacturingSpace")
    private String commManufacturingSpace;

    @JsonProperty("CommMinOrMaxTerm")
    private String commMinOrMaxTerm;

    @JsonProperty("CommOfficeSpace")
    private String commOfficeSpace;

    @JsonProperty("CommParking")
    private String commParking;

    @JsonProperty("CommPossessionDate")
    private String commPossessionDate;

    @JsonProperty("CommPresentUse")
    private String commPresentUse;

    @JsonProperty("CommPricePerArea")
    private String commPricePerArea;

    @JsonProperty("CommResidualStock")
    private String commResidualStock;

    @JsonProperty("CommResidualStockValue")
    private String commResidualStockValue;

    @JsonProperty("CommRetailSpace")
    private String commRetailSpace;

    @JsonProperty("CommTotalArea")
    private String commTotalArea;

    @JsonProperty("CommTypeOfGoods")
    private String commTypeOfGoods;

    @JsonProperty("CommUseableArea")
    private String commUseableArea;

    @JsonProperty("CommWarehouseSpace")
    private String commWarehouseSpace;

    @JsonProperty("CommYearBuilt")
    private String commYearBuilt;

    @JsonProperty("CommZoning")
    private String commZoning;

}
