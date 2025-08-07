package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "java_crud_items")

public class Item {

    @Id

    private String id;

    private String name;
    private Double price;
    
}
