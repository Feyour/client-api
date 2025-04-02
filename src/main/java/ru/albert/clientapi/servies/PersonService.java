package ru.albert.clientapi.servies;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.albert.clientapi.feignclient.LibraryClient;
import ru.albert.clientapi.model.Person;
import ru.albert.clientapi.repositories.PersonRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;

    public List<Person> findAll() {
        return personRepository.findAll();
    }


}
