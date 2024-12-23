package ar.edu.unlam.pb2.ParcialEmpresaDeTransporte;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class AutobusTest {

	// 1) Los autobuses, que llevan un chofer y varios pasajeros.
	// 2) En caso del Autobús, no puede cambiar de chofer si hubiera pasajeros.
	/*
	 * 3) Cada autobús cuenta con veinte asientos para pasajeros y sus pasajeros
	 * deben sentarse ordenados por edad (los adultos mayores más cerca a la puerta
	 * de ingreso por problemas de movilidad).
	 */

	@Test
	public void queLosPasajerosEstenSentadosOrdenadosPorEdadDeMayorAMenor() {
		Autobus autobus = new Autobus();
		Chofer chofer = new Chofer();
		Pasajero pasajero1 = new Pasajero(18); // 6TO PASAJERO
		Pasajero pasajero2 = new Pasajero(23); // 5TO PASAJERO
		Pasajero pasajero3 = new Pasajero(79); // 1ER PASAJERO
		Pasajero pasajero4 = new Pasajero(64); // 4TO PASAJERO
		Pasajero pasajero5 = new Pasajero(65); // 3ER PASAJERO
		Pasajero pasajero6 = new Pasajero(78); // 2DO PASAJERO

		autobus.agregarChofer(chofer);
		autobus.agregarPasajero(pasajero1);
		autobus.agregarPasajero(pasajero2);
		autobus.agregarPasajero(pasajero3);
		autobus.agregarPasajero(pasajero4);
		autobus.agregarPasajero(pasajero5);
		autobus.agregarPasajero(pasajero6);

		List<Pasajero> testListaDePasajerosSentadosDeMayorAMenor = new ArrayList<Pasajero>();
		testListaDePasajerosSentadosDeMayorAMenor.add(pasajero3);
		testListaDePasajerosSentadosDeMayorAMenor.add(pasajero6);
		testListaDePasajerosSentadosDeMayorAMenor.add(pasajero5);
		testListaDePasajerosSentadosDeMayorAMenor.add(pasajero4);
		testListaDePasajerosSentadosDeMayorAMenor.add(pasajero2);
		testListaDePasajerosSentadosDeMayorAMenor.add(pasajero1);

		List<Pasajero> resultadoEsperado = testListaDePasajerosSentadosDeMayorAMenor;
		List<Pasajero> resultadoObtenido = autobus.pasajerosSentadosDeMayorAMenor();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	@Test
	public void queNoExcedaLaCapacidadDePasajeros() {
		Autobus autobus = new Autobus();
		Chofer chofer = new Chofer();
		Pasajero pasajero1 = new Pasajero(18);
		Pasajero pasajero2 = new Pasajero(23);
		Pasajero pasajero3 = new Pasajero(25);
		Pasajero pasajero4 = new Pasajero(30);
		Pasajero pasajero5 = new Pasajero(35);
		Pasajero pasajero6 = new Pasajero(60);
		Pasajero pasajero7 = new Pasajero(68);
		Pasajero pasajero8 = new Pasajero(70);
		Pasajero pasajero9 = new Pasajero(20);
		Pasajero pasajero10 = new Pasajero(78);
		Pasajero pasajero11 = new Pasajero(72);
		Pasajero pasajero12 = new Pasajero(63);
		Pasajero pasajero13 = new Pasajero(19);
		Pasajero pasajero14 = new Pasajero(24);
		Pasajero pasajero15 = new Pasajero(22);
		Pasajero pasajero16 = new Pasajero(21);
		Pasajero pasajero17 = new Pasajero(79);
		Pasajero pasajero18 = new Pasajero(74);
		Pasajero pasajero19 = new Pasajero(69);
		Pasajero pasajero20 = new Pasajero(55);
		Pasajero pasajero21 = new Pasajero(62);

		autobus.agregarChofer(chofer);
		autobus.agregarPasajero(pasajero1);
		autobus.agregarPasajero(pasajero2);
		autobus.agregarPasajero(pasajero3);
		autobus.agregarPasajero(pasajero4);
		autobus.agregarPasajero(pasajero5);
		autobus.agregarPasajero(pasajero6);
		autobus.agregarPasajero(pasajero7);
		autobus.agregarPasajero(pasajero8);
		autobus.agregarPasajero(pasajero9);
		autobus.agregarPasajero(pasajero10);
		autobus.agregarPasajero(pasajero11);
		autobus.agregarPasajero(pasajero12);
		autobus.agregarPasajero(pasajero13);
		autobus.agregarPasajero(pasajero14);
		autobus.agregarPasajero(pasajero15);
		autobus.agregarPasajero(pasajero16);
		autobus.agregarPasajero(pasajero17);
		autobus.agregarPasajero(pasajero18);
		autobus.agregarPasajero(pasajero19);
		autobus.agregarPasajero(pasajero20);
		autobus.agregarPasajero(pasajero21);

		List<Pasajero> testListaDePasajero = new ArrayList<Pasajero>();
		testListaDePasajero.add(pasajero1);
		testListaDePasajero.add(pasajero2);
		testListaDePasajero.add(pasajero3);
		testListaDePasajero.add(pasajero4);
		testListaDePasajero.add(pasajero5);
		testListaDePasajero.add(pasajero6);
		testListaDePasajero.add(pasajero7);
		testListaDePasajero.add(pasajero8);
		testListaDePasajero.add(pasajero9);
		testListaDePasajero.add(pasajero10);
		testListaDePasajero.add(pasajero11);
		testListaDePasajero.add(pasajero12);
		testListaDePasajero.add(pasajero13);
		testListaDePasajero.add(pasajero14);
		testListaDePasajero.add(pasajero15);
		testListaDePasajero.add(pasajero16);
		testListaDePasajero.add(pasajero17);
		testListaDePasajero.add(pasajero18);
		testListaDePasajero.add(pasajero19);
		testListaDePasajero.add(pasajero20);

		List<Pasajero> resultadoEsperado = testListaDePasajero;
		List<Pasajero> resultadoObtenido = autobus.getListaDePasajero();
		assertEquals(resultadoEsperado, resultadoObtenido);

	}

	@Test
	public void queNoCambieDeChoferSiHayPasajeros() {
		Autobus autobus = new Autobus();
		Chofer chofer = new Chofer();
		Pasajero pasajero1 = new Pasajero(35);
		Pasajero pasajero2 = new Pasajero(21);
		autobus.agregarChofer(chofer);
		autobus.agregarPasajero(pasajero1);
		autobus.agregarPasajero(pasajero2);

		assertFalse(autobus.cambiarDeChofer(chofer));

	}

	@Test
	public void queSeCreeAutobusYAgregueChoferYPasajerosYSeCreeLaListaDePasajeros() {

		Autobus autobus = new Autobus();
		Chofer chofer = new Chofer();
		Pasajero pasajero1 = new Pasajero(19);
		Pasajero pasajero2 = new Pasajero(25);
		Pasajero pasajero3 = new Pasajero(54);
		Pasajero pasajero4 = new Pasajero(41);
		Pasajero pasajero5 = new Pasajero(30);

		autobus.agregarChofer(chofer);
		autobus.agregarPasajero(pasajero1);
		autobus.agregarPasajero(pasajero2);
		autobus.agregarPasajero(pasajero3);
		autobus.agregarPasajero(pasajero4);
		autobus.agregarPasajero(pasajero5);

		List<Pasajero> testListaDePasajero = new ArrayList<Pasajero>();
		testListaDePasajero.add(pasajero1);
		testListaDePasajero.add(pasajero2);
		testListaDePasajero.add(pasajero3);
		testListaDePasajero.add(pasajero4);
		testListaDePasajero.add(pasajero5);
		List<Pasajero> resultadoEsperado = testListaDePasajero;
		List<Pasajero> resultadoObtenido = autobus.getListaDePasajero();
		assertEquals(resultadoEsperado, resultadoObtenido);

	}

}
