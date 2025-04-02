package ru.albert.clientapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.albert.clientapi.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
