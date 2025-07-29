package com.example.practicadto.controller;


import com.example.practicadto.dto.ReservaRequestDTO;
import com.example.practicadto.dto.ReservaResponseDTO;
import com.example.practicadto.service.ReservaServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reserva")
public class ReservaController {

    private final ReservaServiceImpl reservaServ;

    public ReservaController(ReservaServiceImpl reservaServ) {
        this.reservaServ = reservaServ;
    }

    @PostMapping("/crear")
    ReservaResponseDTO crearReserva(@RequestBody ReservaRequestDTO dto){
        return reservaServ.crearReserva(dto);
    }


}
