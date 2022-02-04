package com.bcp.reto.ribbon.service;

import com.bcp.reto.ribbon.models.GuardarTipoCambioRequest;
import com.bcp.reto.ribbon.models.Item;
import com.bcp.reto.ribbon.models.TipoCambioRequestDto;

public interface ItemService {

	Item calcularTipoCambio(TipoCambioRequestDto tipoCambioRequestDto);
	Item guardar(GuardarTipoCambioRequest oGuardarTipoCambioRequest);

}
