package ar.edu.unlam.pb2.ParcialEmpresaDeTransporte;

import static org.junit.Assert.*;

import org.junit.Test;

public class AutomovilTest {

	

	@Test
	public void queSeCreeAutomovilYAgregueChoferYPasajero() {
		Automovil automovil = new Automovil();
		Chofer chofer = new Chofer();
		Pasajero pasajero = new Pasajero(39);
		assertTrue(automovil.agregarPasajero(pasajero));
		assertTrue(automovil.agregarChofer(chofer));

	}

	@Test
	public void queAdemasDelConductorPuedaLLevarTresPasajeros() {
		Automovil automovil = new Automovil();
		Chofer chofer = new Chofer();
		Pasajero pasajero1 = new Pasajero(39);
		Pasajero pasajero2 = new Pasajero(26);
		Pasajero pasajero3 = new Pasajero(54);
		assertTrue(automovil.agregarChofer(chofer));
		assertTrue(automovil.agregarPasajero(pasajero1));
		assertTrue(automovil.agregarPasajero(pasajero2));
		assertTrue(automovil.agregarPasajero(pasajero3));

	}

	@Test
	public void queNoExcedaLaCantidadDePasajeros() {
		Automovil automovil = new Automovil();
		Chofer chofer = new Chofer();
		Pasajero pasajero1 = new Pasajero(39);
		Pasajero pasajero2 = new Pasajero(26);
		Pasajero pasajero3 = new Pasajero(54);
		Pasajero pasajero4 = new Pasajero(40);
		assertTrue(automovil.agregarChofer(chofer));
		assertTrue(automovil.agregarPasajero(pasajero1));
		assertTrue(automovil.agregarPasajero(pasajero2));
		assertTrue(automovil.agregarPasajero(pasajero3));
		assertFalse(automovil.agregarPasajero(pasajero4));

	}

}
