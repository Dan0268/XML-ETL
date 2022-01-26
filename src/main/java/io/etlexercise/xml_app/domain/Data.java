package io.etlexercise.xml_app.domain;

import java.time.OffsetDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@XStreamAlias("Data")
public class Data {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @XStreamAlias("ItemNum")
    private Integer itemNum;

    @Column
    @XStreamAlias("SubItemNum")
    private Integer subItemNum;

    @Column
    @XStreamAlias("ItemStartDate")
    private String itemStartDate;

    @Column
    @XStreamAlias("ItemEndDate")
    private String itemEndDate;

    @Column
    @XStreamAlias("Category")
    private Integer category;

    @Column(name = "\"group\"")
    @XStreamAlias("Group")
    private String group;

    @Column
    @XStreamAlias("SubGroup")
    private String subGroup;

    @Column
    @XStreamAlias("SubHeading")
    private String subHeading;

    @Column
    @XStreamAlias("ItemType")
    private String itemType;

    @Column
    @XStreamAlias("FeeType")
    private String feeType;

    @Column
    @XStreamAlias("ProviderType")
    private String providerType;

    @Column
    @XStreamAlias("NewItem")
    private String newItem;

    @Column
    @XStreamAlias("ItemChange")
    private String itemChange;

    @Column
    @XStreamAlias("AnaesChange")
    private String anaesChange;

    @Column
    @XStreamAlias("DescriptorChange")
    private String descriptorChange;

    @Column
    @XStreamAlias("FeeChange")
    private String feeChange;

    @Column
    @XStreamAlias("EMSNChange")
    private String eMSNChange;

    @Column
    @XStreamAlias("EMSNCap")
    private String eMSNCap;

    @Column
    @XStreamAlias("BenefitType")
    private String benefitType;

    @Column
    @XStreamAlias("BenefitStartDate")
    private String benefitStartDate;

    @Column
    @XStreamAlias("FeeStartDate")
    private String feeStartDate;

    @Column
    @XStreamAlias("ScheduleFee")
    private Double scheduleFee;

    @Column
    @XStreamAlias("Benefit75")
    private Double benefit75;

    @Column
    @XStreamAlias("Benefit85")
    private Double benefit85;

    @Column
    @XStreamAlias("Benefit100")
    private Double benefit100;

    @Column
    @XStreamAlias("BasicUnits")
    private String basicUnits;

    @Column
    @XStreamAlias("EMSNStartDate")
    private String eMSNStartDate;

    @Column
    @XStreamAlias("EMSNEndDate")
    private String eMSNEndDate;

    @Column
    @XStreamAlias("EMSNFixedCapAmount")
    private String eMSNFixedCapAmount;

    @Column
    @XStreamAlias("EMSNMaximumCap")
    private String eMSNMaximumCap;

    @Column
    @XStreamAlias("EMSNPercentageCap")
    private String eMSNPercentageCap;

    @Column(columnDefinition = "TEXT")
    @XStreamAlias("EMSNDescription")
    private String eMSNDescription;

    @Column
    @XStreamAlias("EMSNChangeDate")
    private String eMSNChangeDate;

    @Column
    @XStreamAlias("Anaes")
    private String anaes;

    @Column
    @XStreamAlias("DerivedFeeStartDate")
    private String derivedFeeStartDate;

    @Column(columnDefinition = "TEXT")
    @XStreamAlias("DerivedFee")
    private String derivedFee;

    @Column
    @XStreamAlias("DescriptionStartDate")
    private String descriptionStartDate;

    @Column(name = "\"description\"", columnDefinition = "TEXT")
    @XStreamAlias("Description")
    private String description;

    @Column
    @XStreamAlias("QFEStartDate")
    private String qFEStartDate;

    @Column
    @XStreamAlias("QFEEndDate")
    private String qFEEndDate;

    @Column(nullable = false, updatable = false)
    private OffsetDateTime dateCreated;

    @Column(nullable = false)
    private OffsetDateTime lastUpdated;

    @PrePersist
    public void prePersist() {
        dateCreated = OffsetDateTime.now();
        lastUpdated = dateCreated;
    }

    @PreUpdate
    public void preUpdate() {
        lastUpdated = OffsetDateTime.now();
    }

}
