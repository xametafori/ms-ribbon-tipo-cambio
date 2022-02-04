package com.bcp.reto.ribbon.models;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class TipoCambioRequestDto {

    private BigDecimal montoDto;
    private String monedaOrigenDto;
    private String monedadDestinoDto;

}
