package ar.edu.unlam.pb2.ParcialEmpresaDeTransporte;

import static org.junit.Assert.*;

import org.junit.Test;

public class MotocicletaTest {

	// 1 )Los vehículos deben conocer la cantidad de kilómetros recorridos, asignar
	// y cambiar
	// chofer.

	// 2) NO PUEDE AGREGAR ACOMPAÑANTE SI YA TIENE UNO
	
	// 3) NO CAMBIA CHOFER  SI TIENE ACOMPAÑANTE

	@Test
	public void seCreaMotocicletaSeCreayAgregaUnPasajeroYUnChofer() {
		Motocicleta moto = new Motocicleta();
		Chofer chofer = new Chofer();
		Pasajero pasajero = new Pasajero(23);
		assertTrue(moto.agregarPasajero(pasajero));
		assertTrue(moto.agregarChofer(chofer));

	}

	@Test
	public void queNoAgreguePasajeroSiYaTieneUno() {
		Motocicleta moto = new Motocicleta();
		Chofer chofer = new Chofer();
		Pasajero pasajero = new Pasajero(19);
		moto.agregarChofer(chofer);
		moto.agregarPasajero(pasajero);
		Boolean resultadoEsperado = false;
		Boolean resultadoObtenido = moto.agregarPasajero(pasajero);
		assertEquals(resultadoEsperado, resultadoObtenido);

	}

	@Test
	public void quelaMotocicletaRecoraKilometrosConSuPasajero() {
		Motocicleta moto = new Motocicleta();
		Chofer chofer = new Chofer();
		Pasajero pasajero = new Pasajero(18);
		moto.agregarChofer(chofer);
		moto.agregarPasajero(pasajero);
		moto.recorreKilometros(10.5);
		Double resultadoEsperado = 10.5;
		Double resultadoObtenido = moto.kmRecorridos();
		assertEquals(resultadoEsperado, resultadoObtenido);

	}
	
	@Test
	public void quelaMotocicletaCambieDeChoferSinAcompañante() {
		Motocicleta moto = new Motocicleta();
		Pasajero pasajero = new Pasajero(18);
		Chofer chofer = new Chofer();
		moto.agregarChofer(chofer);
		assertTrue(moto.cambiarDeChofer(chofer));
		moto.agregarPasajero(pasajero);
		assertFalse(moto.cambiarDeChofer(chofer));
		
		

	}

}
