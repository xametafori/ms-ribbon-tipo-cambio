package com.bcp.reto.ribbon.clientes;

import com.bcp.reto.ribbon.models.GuardarTipoCambioRequest;
import com.bcp.reto.ribbon.models.ResponseDto;
import com.bcp.reto.ribbon.models.TipoCambioRequestDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "servicio-tipocambio")
public interface TipoCambioFeignCliente {

	@PostMapping("/api/v1/tipoCambio/calcularCambio")
	public ResponseDto calcularTipoCambio(@RequestBody TipoCambioRequestDto oTipoCambioRequestDto);

	@PostMapping("/api/v1/tipoCambio/guardar")
	public ResponseDto guardar(@RequestBody GuardarTipoCambioRequest oGuardarTipoCambioRequest);
}
