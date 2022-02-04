package com.bcp.reto.ribbon.controllers;

import com.bcp.reto.ribbon.models.GuardarTipoCambioRequest;
import com.bcp.reto.ribbon.models.Item;
import com.bcp.reto.ribbon.models.TipoCambioRequestDto;
import com.bcp.reto.ribbon.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;


@RestController
public class ItemController {
	
	private static Logger log = LoggerFactory.getLogger(ItemController.class);

	@Autowired
	@Qualifier("serviceFeign")
	private ItemService itemService;

	@PostMapping("/ribbon/calcularCambio")
	public Item calcularTipoCambio(@RequestBody TipoCambioRequestDto tipoCambioRequestDto)
	{
		return this.itemService.calcularTipoCambio(tipoCambioRequestDto);
	}

	@PostMapping("/ribbon/guardar")
	public Item guardarTipoCAmbio(@RequestBody GuardarTipoCambioRequest oGuardarTipoCambioRequest)
	{
		return this.itemService.guardar(oGuardarTipoCambioRequest);
	}
}
