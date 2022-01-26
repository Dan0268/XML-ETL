package io.etlexercise.xml_app.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class DataDTO {

    private Integer id;

    private Integer itemNum;

    private Integer subItemNum;

    @Size(max = 255)
    private String itemStartDate;

    @Size(max = 255)
    private String itemEndDate;

    private Integer category;

    @Size(max = 255)
    private String group;

    @Size(max = 255)
    private String subGroup;

    @Size(max = 255)
    private String subHeading;

    @Size(max = 255)
    private String itemType;

    @Size(max = 255)
    private String feeType;

    @Size(max = 255)
    private String providerType;

    @Size(max = 255)
    private String newItem;

    @Size(max = 255)
    private String itemChange;

    @Size(max = 255)
    private String anaesChange;

    @Size(max = 255)
    private String descriptorChange;

    @Size(max = 255)
    private String feeChange;

    @Size(max = 255)
    @JsonProperty("eMSNChange")
    private String eMSNChange;

    @Size(max = 255)
    @JsonProperty("eMSNCap")
    private String eMSNCap;

    @Size(max = 255)
    private String benefitType;

    @Size(max = 255)
    private String benefitStartDate;

    @Size(max = 255)
    private String feeStartDate;

    private Double scheduleFee;

    private Double benefit75;

    private Double benefit85;

    private Double benefit100;

    @Size(max = 255)
    private String basicUnits;

    @Size(max = 255)
    @JsonProperty("eMSNStartDate")
    private String eMSNStartDate;

    @Size(max = 255)
    @JsonProperty("eMSNEndDate")
    private String eMSNEndDate;

    @Size(max = 255)
    @JsonProperty("eMSNFixedCapAmount")
    private String eMSNFixedCapAmount;

    @Size(max = 255)
    @JsonProperty("eMSNMaximumCap")
    private String eMSNMaximumCap;

    @Size(max = 255)
    @JsonProperty("eMSNPercentageCap")
    private String eMSNPercentageCap;

    @Size(max = 255)
    @JsonProperty("eMSNDescription")
    private String eMSNDescription;

    @Size(max = 255)
    @JsonProperty("eMSNChangeDate")
    private String eMSNChangeDate;

    @Size(max = 255)
    private String anaes;

    @Size(max = 255)
    private String derivedFeeStartDate;

    @Size(max = 255)
    private String derivedFee;

    @Size(max = 255)
    private String descriptionStartDate;

    @Size(max = 500)
    private String description;

    @Size(max = 255)
    @JsonProperty("qFEStartDate")
    private String qFEStartDate;

    @Size(max = 255)
    @JsonProperty("qFEEndDate")
    private String qFEEndDate;

}
