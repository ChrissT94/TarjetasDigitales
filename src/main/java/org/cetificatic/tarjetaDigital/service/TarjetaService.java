package org.cetificatic.tarjetaDigital.service;

import java.util.List;

import javax.jws.WebService;

import org.cetificatic.tarjetaDigital.model.Tarjeta;

@WebService
public interface TarjetaService {
	
	/***
	 * Método para crear una tarjeta
	 * @param tarjeta
	 * @return
	 */
	Tarjeta crearTarjeta(Tarjeta tarjeta);
	
	/***
	 * Método par obtener todas las tarjetas
	 * @return
	 */
	List<Tarjeta> obtenerTodas();

}
