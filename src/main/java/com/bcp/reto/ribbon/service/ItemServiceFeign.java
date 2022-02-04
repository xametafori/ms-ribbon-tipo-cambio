package com.bcp.reto.ribbon.service;

import com.bcp.reto.ribbon.clientes.TipoCambioFeignCliente;
import com.bcp.reto.ribbon.models.GuardarTipoCambioRequest;
import com.bcp.reto.ribbon.models.Item;
import com.bcp.reto.ribbon.models.TipoCambioRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("serviceFeign")
public class ItemServiceFeign implements ItemService {
	
	@Autowired
	private TipoCambioFeignCliente clienteFeign;

	@Override
	public Item calcularTipoCambio(TipoCambioRequestDto tipoCambioRequestDto) {

		return new Item(clienteFeign.calcularTipoCambio(tipoCambioRequestDto));

	}

	@Override
	public Item guardar(GuardarTipoCambioRequest oGuardarTipoCambioRequest) {
		return new Item(clienteFeign.guardar(oGuardarTipoCambioRequest));
	}
}
