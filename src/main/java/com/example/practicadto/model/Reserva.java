package com.example.practicadto.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "reservas")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //El cliente no deberia mandar esto en un post

    private Long idPasajero;
    private Long idVuelo;
    private String asiento;
    private Boolean equipajeExtra;
    private Double precioTotal;
    private LocalDateTime fechaCreacion;
    //La fecha de creacion lo genera el servidor
}

