package com.example.demo.service;

import com.example.demo.model.Item;
import com.example.demo.repository.ItemRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ItemService {
    private final ItemRepository repo;
    
    public ItemService(ItemRepository repo) {
        this.repo = repo;
    }

    public List<Item> getAllItems() {
        return repo.findAll();
    }
    
    public Item getItemById(String id) {
        return repo.findById(id).orElse(null);
    }

    public Item createItem(Item item) {
        return repo.save(item);
    }

    public Item updateItem(String id, Item newItem) {
        if (repo.existsById(id)) {
            newItem.setId(id);
            return repo.save(newItem);
        }
        return null;
    }

    public void deleteItem(String id) {
        repo.deleteById(id);
    }
    
}
