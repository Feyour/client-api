package ru.albert.clientapi.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.albert.clientapi.model.Reserve;
import ru.albert.clientapi.repositories.ReserveRepository;
import ru.albert.clientapi.servies.ReserveService;

import java.util.List;

@RestController
@RequestMapping("/reserve")
@RequiredArgsConstructor
public class ReserveController {
    private final ReserveRepository reserveRepository;
   private final ReserveService reserveService;

    @GetMapping
    public List<Reserve> findAll() {
        return reserveRepository.findAll();
    }
}
