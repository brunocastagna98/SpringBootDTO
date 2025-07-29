package com.example.practicadto.dto;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data

//Objeto que representa a lo que se le muestra al cliente
public class ReservaResponseDTO {
    private Long id;
    private String asientoAsignado;
    private Double precioTotal;
    private LocalDateTime fechaCreacion;
}
