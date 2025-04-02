package ru.albert.clientapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.albert.clientapi.model.Reserve;

@Repository
public interface ReserveRepository extends JpaRepository<Reserve, Integer> {
}
