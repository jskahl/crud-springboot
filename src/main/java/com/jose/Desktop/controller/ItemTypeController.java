package com.jose.Desktop.controller;

import com.jose.Desktop.model.ItemType;
import com.jose.Desktop.service.ItemTypeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item_type")
public class ItemTypeController {
    private final ItemTypeService itemTypeService;

    public ItemTypeController(ItemTypeService itemTypeService) {
        this.itemTypeService = itemTypeService;
    }

    @GetMapping
    public List<ItemType> getAll() {
        return itemTypeService.getAll();
    }

    @PostMapping
    public ItemType create(@RequestBody ItemType itemType) {
        return itemTypeService.save(itemType);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        itemTypeService.delete(id);
    }
}
