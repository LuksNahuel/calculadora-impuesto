package com.impuestos;


import org.springframework.stereotype.Service;

@Service
public class ImpuestoService {
	
	public void calcularIVA(Precio monto) {
		monto.setMontoEnIva(monto.getMonto() * 1.21);
	}
}