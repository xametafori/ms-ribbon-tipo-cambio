package com.bcp.reto.ribbon.models;

import lombok.Data;

@Data
public class ResponseDto {

    private int codigo;
    private String mensaje;
    private Object data;

}
