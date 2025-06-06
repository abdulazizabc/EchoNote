package org.example.echonote.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String content;

    private String author;

    @ElementCollection
    private List<String> tags = new ArrayList<>();

    private Date createdAt;

    private Date updatedAt;

    private Integer views;

    private Integer likesCount;


}
