package com.maralbadev.coffeear.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="users_table")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
