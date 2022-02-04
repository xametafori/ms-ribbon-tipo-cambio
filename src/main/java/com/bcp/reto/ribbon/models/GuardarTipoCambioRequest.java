package com.bcp.reto.ribbon.models;

import lombok.Data;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class GuardarTipoCambioRequest implements Serializable {

    private static final long serialVersionUID = 4467531611801172710L;

    private String monedaOrigen;

    private String monedaDestino;

    private BigDecimal tipoCambio;
}
