package com.debuggerme.remaxsouth.synccrawler.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Jamith Nimantha
 */
@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Table(name = "PropertyCategory")
public class PropertyCategory {
    /**
     * A description of Category Type for both Residential and Commercial properties
     */

    @Id
    @Column(name = "Code")
    private Integer code;

    @Column(name = "Description")
    private String description;
}
