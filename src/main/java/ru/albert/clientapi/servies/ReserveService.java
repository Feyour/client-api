package ru.albert.clientapi.servies;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.albert.clientapi.model.Reserve;
import ru.albert.clientapi.repositories.ReserveRepository;


import java.util.List;

@Service
@RequiredArgsConstructor

public class ReserveService {
    private final ReserveRepository reserveRepository;


    public List<Reserve> findAll() {
        return reserveRepository.findAll();
    }

}
