package com.jose.Desktop.model;

import jakarta.persistence.*;

@Entity
@Table(name = "item_table")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String dateCreation;
    private Integer itemType;

    public Item() {
    }

    public Item(Long id, String name, String dateCreation, Integer itemType) {
        this.id = id;
        this.name = name;
        this.dateCreation = dateCreation;
        this.itemType = itemType;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public Integer getItemType() {
        return itemType;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setItemType(Integer itemType) {
        this.itemType = itemType;
    }

}