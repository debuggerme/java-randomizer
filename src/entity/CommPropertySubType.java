package com.debuggerme.remaxsouth.synccrawler.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

/**
 * @author Jamith Nimantha
 */
@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Table(name = "CommPropertySubType")
public class CommPropertySubType {

    /**
     * Subcategories of various Commercial Types
     **/
    @Id
    @Column(name = "Code")
    private Integer code;

    @Column(name = "Description")
    private String description;

    @OneToOne
    @JoinColumn(name = "CommPropertyType")
    private CommPropertyType commPropertyType;
}
