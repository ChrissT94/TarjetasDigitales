package org.cetificatic.tarjetaDigital.repository;

import java.util.ArrayList;
import java.util.List;

import org.cetificatic.tarjetaDigital.model.Tarjeta;

public class TarjetaRepositoryImpl implements TarjetaRepository {

	private static List<Tarjeta> tarjetasDigitales =
			new ArrayList<Tarjeta>();
	
	@Override
	public Tarjeta crearTarjeta(Tarjeta tarjeta) {
		System.out.println("Crear tarjeta..");
		tarjetasDigitales.add(tarjeta);
		// TODO Auto-generated method stub
		return tarjeta;
	}

	@Override
	public List<Tarjeta> obtenerTodas() {
		// TODO Auto-generated method stub
		System.out.println("Obetenr todas las tarjetas...");
		return tarjetasDigitales;
	}

}
