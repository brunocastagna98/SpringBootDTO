package com.example.practicadto.service;

import com.example.practicadto.dto.ReservaRequestDTO;
import com.example.practicadto.dto.ReservaResponseDTO;

public interface ReservaService {

    ReservaResponseDTO crearReserva(ReservaRequestDTO dto);


}
