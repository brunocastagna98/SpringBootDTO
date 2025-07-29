package com.example.practicadto.service;

import com.example.practicadto.dto.ReservaRequestDTO;
import com.example.practicadto.dto.ReservaResponseDTO;
import com.example.practicadto.model.Reserva;
import com.example.practicadto.repository.ReservaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
@Service
public class ReservaServiceImpl implements ReservaService {

    private final ReservaRepository reservaRepo;

    public ReservaServiceImpl(ReservaRepository reservaRepo) {
        this.reservaRepo = reservaRepo;
    }

    @Override
    public ReservaResponseDTO crearReserva(ReservaRequestDTO dto) {

        Reserva reserva = new Reserva();
        reserva.setIdPasajero(dto.getIdPasajero()); // si
        reserva.setIdVuelo(dto.getIdVuelo()); // si
        reserva.setAsiento(dto.getAsientoPreferido()); // si
        reserva.setEquipajeExtra(dto.getEquipajeExtra()); // si
        reserva.setPrecioTotal(150000.0); // nosotros
        reserva.setFechaCreacion(LocalDateTime.now()); // nosotros

        Reserva guardada = reservaRepo.save(reserva);
        return  new ReservaResponseDTO(
                guardada.getId(),guardada.getAsiento(),
                guardada.getPrecioTotal(),guardada.getFechaCreacion()
        );
    }
}
