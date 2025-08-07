package com.example.demo.controller;

import com.example.demo.model.Item;
import com.example.demo.service.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")


public class ItemController {
    private final ItemService service;

    public ItemController(ItemService service) {
        this.service = service;
    }

    @GetMapping

    public List<Item> getAllItems() {
        return service.getAllItems();
    }

    @GetMapping("/{id}")

    public Item getItemById(@PathVariable String id) {
        return service.getItemById(id);
    }
    
    @PostMapping

    public Item createItem(@RequestBody Item item) {
        return service.createItem(item);
    }

    @PutMapping("/{id}")
    
    public Item updateItem(@PathVariable String id, @RequestBody Item newItem) {
        return service.updateItem(id, newItem);
    }

    @DeleteMapping("/{id}")

    public void deleteItem(@PathVariable String id) {
        service.deleteItem(id);
    }
}
