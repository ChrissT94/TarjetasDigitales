package org.cetificatic.tarjetaDigital.service;

import java.util.List;

import javax.jws.WebService;

import org.cetificatic.tarjetaDigital.model.Tarjeta;
import org.cetificatic.tarjetaDigital.repository.TarjetaRepository;
import org.cetificatic.tarjetaDigital.repository.TarjetaRepositoryImpl;

@WebService(endpointInterface = "org.cetificatic.tarjetaDigital.service.TarjetaService")
public class TarjetaServiceImpl implements TarjetaService{

	TarjetaRepository tarjetaRepository = new TarjetaRepositoryImpl();
	@Override
	public Tarjeta crearTarjeta(Tarjeta tarjeta) {
		// TODO Auto-generated method stub
		return tarjetaRepository.crearTarjeta(tarjeta);
	}

	@Override
	public List<Tarjeta> obtenerTodas() {
		// TODO Auto-generated method stub
		return tarjetaRepository.obtenerTodas();
	}

}
