package com.debuggerme.remaxsouth.synccrawler.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author Jamith Nimantha
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class PropertyDTO {

    @JsonProperty("Appraisals")
    List<AppraisalDTO> appraisalDTOS;
    @JsonProperty("IntegratorID")
    private String integratorID;
    @JsonProperty("IntegratorPropertyID")
    private String integratorPropertyID;
    @JsonProperty("IntegratorOfficeID")
    private String integratorOfficeID;

    @JsonProperty("Features")
    List<FeatureDTO> featureDTOS;

    @JsonProperty("Mortgages")
    List<MortgageDTO> mortgageDTOS;
    @JsonProperty("IntegratorSalesAssociateID")
    private String integratorSalesAssociateID;

    @JsonProperty("IsAgentHidden")
    private String isAgentHidden;

    @JsonProperty("IsAgentDisabled")
    private String isAgentDisabled;

    @JsonProperty("IsOfficeDisabled")
    private String isOfficeDisabled;

    @JsonProperty("SecondaryAgent")
    private String secondaryAgent;

    @JsonProperty("RegionID")
    private RegionIDDTO regionIDDTO;

    @JsonProperty("CommercialResidential")
    private String commercialResidential;

    @JsonProperty("StreetNumber")
    private String streetNumber;

    @JsonProperty("StreetName")
    private String streetName;

    @JsonProperty("ApartmentNumber")
    private String apartmentNumber;

    @JsonProperty("AddressLine2")
    private String addressLine2;

    @JsonProperty("PostalCode")
    private String postalCode;

    @JsonProperty("CityID")
    private String cityID;

    @JsonProperty("City")
    private String city;

    @JsonProperty("Country")
    private String country;

    @JsonProperty("LocalZone")
    private String localZone;

    @JsonProperty("RegionalZone")
    private String regionalZone;

    @JsonProperty("District")
    private String district;

    @JsonProperty("FloorLevel")
    private FloorLevelDTO floorLevelDTO;

    @JsonProperty("Longitude")
    private String longitude;

    @JsonProperty("Latitude")
    private String latitude;

    @JsonProperty("CurrentListingPrice")
    private String currentListingPrice;

    @JsonProperty("CurrentListingCurrency")
    private CurrentListingCurrencyDTO currentListingCurrencyDTO;

    @JsonProperty("PriceType")
    private PriceTypeDTO priceTypeDTO;

    @JsonProperty("RentalPriceGranularity")
    private RentalPriceGranularityDTO rentalPriceGranularityDTO;

    @JsonProperty("PrivatelyOwned")
    private PrivatelyOwnedDTO privatelyOwnedDTO;

    @JsonProperty("ShowAddress")
    private String showAddress;

    @JsonProperty("HideListingFromPublic")
    private HideListingFromPublicDTO hideListingFromPublicDTO;

    @JsonProperty("PropertyCategory")
    private PropertyCategoryDTO propertyCategoryDTO;

    @JsonProperty("MarketStatus")
    private MarketStatusDTO marketStatusDTO;

    @JsonProperty("GroundRent")
    private GroundRentDTO groundRentDTO;

    @JsonProperty("GroundRentPrice")
    private String groundRentPrice;

    @JsonProperty("GroundRentNoYears")
    private String groundRentNoYears;

    @JsonProperty("BoardSign")
    private String boardSign;

    @JsonProperty("KeyNumber")
    private String keyNumber;

    @JsonProperty("SoldPrice")
    private String soldPrice;

    @JsonProperty("SoldPriceCurrency")
    private String soldPriceCurrency;

    @JsonProperty("SoldDate")
    private String soldDate;

    @JsonProperty("TransactionType")
    private TransactionTypeDTO transactionTypeDTO;

    @JsonProperty("ContractType")
    private ContractTypeDTO contractTypeDTO;

    @JsonProperty("PropertyStatus")
    private PropertyStatusDTO propertyStatusDTO;

    @JsonProperty("PropertyType")
    private PropertyTypeDTO propertyTypeDTO;

    @JsonProperty("ListingStatus")
    private ListingStatusDTO listingStatusDTO;

    @JsonProperty("CancellationReason")
    private CancellationReasonDTO cancellationReasonDTO;

    @JsonProperty("PendingStatus")
    private String pendingStatus;

    @JsonProperty("TotalArea")
    private String totalArea;

    @JsonProperty("LivingArea")
    private String livingArea;

    @JsonProperty("CubicVolume")
    private String cubicVolume;

    @JsonProperty("LotSize")
    private String lotSize;

    @JsonProperty("LotSizeDimensions")
    private String lotSizeDimensions;

    @JsonProperty("BuiltArea")
    private String builtArea;

    @JsonProperty("ParkingSpaces")
    private String parkingSpaces;

    @JsonProperty("MarketValue")
    private String marketValue;

    @JsonProperty("MortgageValue")
    private String mortgageValue;

    @JsonProperty("PriceFlexibilityID")
    private PriceFlexibilityIDDTO priceFlexibilityIDDTO;

    @JsonProperty("OwnerUrgencyID")
    private OwnerUrgencyIDDTO ownerUrgencyIDDTO;

    @JsonProperty("OwnerMotivationID")
    private OwnerMotivationIDDTO ownerMotivationIDDTO;

    @JsonProperty("Development")
    private DevelopmentDTO developmentDTO;

    @JsonProperty("PdfBrochure")
    private String pdfBrochure;

    @JsonProperty("RepresentingAgentID")
    private String representingAgentID;

    @JsonProperty("FloorPlan")
    private String floorPlan;

    @JsonProperty("SecurityDeposit")
    private String securityDeposit;

    @JsonProperty("Utilities")
    private UtilitiesDTO utilitiesDTO;

    @JsonProperty("Heating")
    private HeatingDTO heatingDTO;

    @JsonProperty("Parking")
    private ParkingDTO parkingDTO;

    @JsonProperty("Maintenance")
    private MaintenanceDTO maintenanceDTO;

    @JsonProperty("TotalNumOfRooms")
    private String totalNumOfRooms;

    @JsonProperty("NumberOfBathrooms")
    private String numberOfBathrooms;

    @JsonProperty("Disabled")
    private String disabled;
    @JsonProperty("NumberOfBedrooms")
    private String numberOfBedrooms;
    @JsonProperty("NumberOfToiletRooms")
    private String numberOfToiletRooms;
    @JsonProperty("NumberOfFloors")
    private String numberOfFloors;
    @JsonProperty("NumberOfApartmentsInBuilding")
    private String numberOfApartmentsInBuilding;
    @JsonProperty("Rooms")
    private List<RoomDTO> roomDTOS;
    @JsonProperty("YearBuild")
    private String yearBuild;
    @JsonProperty("PossessionDate")
    private String possessionDate;
    @JsonProperty("OrigListingDate")
    private String origListingDate;
    @JsonProperty("ExpiryDate")
    private String expiryDate;
    @JsonProperty("LastModifiedDate")
    private String lastModifiedDate;
    @JsonProperty("AlternateURL")
    private String alternateURL;
    @JsonProperty("VirtualTour")
    private String virtualTour;
    @JsonProperty("PropertyDescriptions")
    private List<PropertyDescriptionDTO> propertyDescriptionDTOS;
    @JsonProperty("Notes")
    private String notes;
    @JsonProperty("CoopCommision")
    private String coopCommision;
    @JsonProperty("CoopProperty")
    private String coopProperty;
    @JsonProperty("ComTotalPct")
    private String comTotalPct;
    @JsonProperty("ComTotalFix")
    private String comTotalFix;
    @JsonProperty("ComBuyAgentPctTot")
    private String comBuyAgentPctTot;
    @JsonProperty("ComBuyAgentPct")
    private String comBuyAgentPct;
    @JsonProperty("ComBuyAgentFix")
    private String comBuyAgentFix;
    @JsonProperty("ComReferralPct")
    private String comReferralPct;
    @JsonProperty("ComReferralFixed")
    private String comReferralFixed;
    @JsonProperty("ComRefSource")
    private String comRefSource;
    @JsonProperty("TaxYear")
    private String taxYear;
    @JsonProperty("TaxAmount")
    private String taxAmount;
    @JsonProperty("TaxPeriod")
    private String taxPeriod;
    @JsonProperty("CommissionValue")
    private String commissionValue;
    @JsonProperty("CommissionPercent")
    private String commissionPercent;
    @JsonProperty("CommissionFixed")
    private String commissionFixed;
    @JsonProperty("OwnerId")
    private String ownerId;
    @JsonProperty("FinancialNotes")
    private FinancialNotesDTO financialNotesDTO;

    @JsonProperty("Registration")
    private RegistrationDTO registrationDTO;

    @JsonProperty("Commercial")
    private CommercialDTO commercialDTO;

    @JsonProperty("Images")
    private List<ImageDTO> imageDTOS;

    @JsonProperty("TransactionCost")
    private TransactionCostDTO transactionCostDTO;

    @JsonProperty("HidePricePublic")
    private HidePricePublicDTO hidePricePublicDTO;

    @JsonProperty("LocalZoneID")
    private String localZoneID;

    @JsonProperty("RentalCommissionMonths")
    private String rentalCommissionMonths;

    @JsonProperty("EnergyEfficiencyRating")
    private EnergyEfficiencyRatingDTO energyEfficiencyRatingDTO;

    @JsonProperty("ListingStatistics")
    private ListingStatisticsDTO listingStatisticsDTO;

}
