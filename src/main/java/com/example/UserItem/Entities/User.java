package com.example.UserItem.Entities;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "User")
public class User {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String name;

    @Column(unique = true)
    private String email;

    @ManyToOne(cascade = CascadeType.ALL)
    List<Item> itemList = new ArrayList<>();

}
