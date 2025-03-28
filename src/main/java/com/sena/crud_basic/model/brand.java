package com.sena.crud_basic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "brand")
public class brand  {
 
    @Id
    
    @Column(name = "id", length = 11, nullable = false)
    private int id;
    @Column(name = "name", length = 100, nullable = false)
    private String name;
    
}
