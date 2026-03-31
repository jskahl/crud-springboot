package com.jose.Desktop.controller;

import com.jose.Desktop.model.Item;
import com.jose.Desktop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping
    public List<Item> getAllItems() {
        return ItemService.getAll();
    }

    @PostMapping
    public Item create(@RequestBody Item item) {
        return itemService.save(item);
    }
}