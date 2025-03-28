package com.sena.crud_basic.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "employee")
public class employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 11, nullable = false)
    private int id;

    @Column(name = "name", length = 255, nullable = false)
    private String name;

    @Column(name = "position", length = 100)
    private String position;

    @Column(name = "salary", precision = 10, scale = 2)
    private double salary;

    @Column(name = "hire_date", nullable = false)
    private LocalDateTime hire_date;
}