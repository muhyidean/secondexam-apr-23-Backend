package edu.miu.springdata1.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int isbn;
    String title;
    double price;

    @ManyToOne(fetch = FetchType.EAGER)
    Category category;

    @ManyToMany(fetch = FetchType.EAGER)
    List<Author> authors;
}
