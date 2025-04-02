package ru.albert.clientapi.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.albert.clientapi.model.Person;
import ru.albert.clientapi.repositories.PersonRepository;

import java.util.List;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {
    private final PersonRepository personRepository;

    @GetMapping
    public List<Person> findAll() {
        return personRepository.findAll();
    }
}
