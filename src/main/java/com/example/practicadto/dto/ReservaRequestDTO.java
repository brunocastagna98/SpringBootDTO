package com.example.practicadto.dto;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
//Fijate que no es una entidad
//es solamente un DTO
//Objeto que representa lo que envia el cliente
//Representa los datos que el cliente puede o debe enviar
public class ReservaRequestDTO {
    private Long idPasajero;
    private Long idVuelo;
    private String asientoPreferido;
    private Boolean equipajeExtra;
}
