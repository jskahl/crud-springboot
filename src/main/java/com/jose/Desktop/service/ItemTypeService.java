package com.jose.Desktop.service;

import com.jose.Desktop.model.ItemType;
import com.jose.Desktop.repository.ItemTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemTypeService {
    private final ItemTypeRepository itemTypeRepository;

    public ItemTypeService(ItemTypeRepository itemTypeRepository) {
        this.itemTypeRepository = itemTypeRepository;
    }

    public List<ItemType> getAll() {
        return itemTypeRepository.findAll();
    }

    public ItemType save(ItemType itemType) {
        return itemTypeRepository.save(itemType);
    }

    public void delete(Long id) {
        itemTypeRepository.deleteById(id);
    }
}
