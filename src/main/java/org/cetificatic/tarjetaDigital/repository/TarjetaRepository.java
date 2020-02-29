package org.cetificatic.tarjetaDigital.repository;

import java.util.List;

import org.cetificatic.tarjetaDigital.model.Tarjeta;

public interface TarjetaRepository {
	
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
