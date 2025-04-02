package ru.albert.clientapi.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @NotEmpty
    @Column(name = "name")
    private String name;
    @NotEmpty
    @Column(name = "surname")
    private String surname;
    @Column(name = "age")
    private int age;
    @Email
    @Column(name = "email")
    private String email;
}
