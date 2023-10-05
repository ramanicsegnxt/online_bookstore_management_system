package com.onlinestore.bookstoremanagementsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="book_id")
    private long id;

    @Column(name="book_name", nullable = false)
    private String name;

    @Column(name="author_name", nullable = false)
    private String authorName;
}
