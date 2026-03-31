package com.jose.Desktop.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "item_type_table")
public class ItemType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long itemTypeId;

    // Aqui estarei usando as utilidades da dependencia Lombok, para evitar código em massa
    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String description;

    public ItemType() {
    }

    public ItemType(Long itemTypeId, String name, String description) {
        this.itemTypeId = itemTypeId;
        this.name = name;
        this.description = description;
    }
}