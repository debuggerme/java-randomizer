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
@ToString
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "Feature")
public class Feature {
    /**
     * Are elements that further describe the property.
     * Those elements are being displayed on the screen under 6 sub- categories,
     * which are the following:
     * (NB: matching needs to happen to element value not to subcategory)
     */
    @Id
    @Column(name = "Code")
    private Integer code;

    @Column(name = "Category")
    private String category;

    @Column(name = "Description")
    private String description;
}
