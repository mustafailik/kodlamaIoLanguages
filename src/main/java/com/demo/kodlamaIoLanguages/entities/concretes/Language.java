package com.demo.kodlamaIoLanguages.entities.concretes;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Table(name = "languages")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "language" ,
            cascade = CascadeType.ALL ,
            orphanRemoval = true)
    private List<Technology> technologies;

}
