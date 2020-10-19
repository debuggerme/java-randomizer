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
@ToString
@EqualsAndHashCode
@Table(name = "RoomType")
public class RoomType {

    /**
     * The intended primary use of a listed room or area included with the property
     */
    @Id
    @Column(name = "Code")
    private Integer code;

    @Column(name = "Description")
    private String description;
}
