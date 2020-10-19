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
@Table(name = "TransactionCost")
public class TransactionCost {

    /**
     * If Region is Netherlands and TransactionType is For Sale,
     * differentiates this listing of being 1=Kosten Koper (K.K.) 2=Vrij Op Naam (V.O.N.) in nature
     */

    @Id
    @Column(name = "Code")
    private Integer code;

    @Column(name = "Description")
    private String description;
}
