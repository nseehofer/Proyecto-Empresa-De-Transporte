package ar.edu.unlam.pb2.ParcialEmpresaDeTransporte;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmpresaDeTransporteTest {

	@Test
	public void queSeCreeEmpresaDeTransporteConSuFlotaDeVehiculos() {
		EmpresaDeTransporte empresaDeTransporte = new EmpresaDeTransporte();
		Vehiculo automovil1 = new Automovil();
		Vehiculo automovil2 = new Automovil();
		Vehiculo motocicleta1 = new Motocicleta();
		Vehiculo autobus1 = new Autobus();
		Vehiculo autobus2 = new Autobus();

		assertTrue(empresaDeTransporte.agregarVehiculoALaFlota(automovil1));
		assertTrue(empresaDeTransporte.agregarVehiculoALaFlota(automovil2));
		assertTrue(empresaDeTransporte.agregarVehiculoALaFlota(motocicleta1));
		assertTrue(empresaDeTransporte.agregarVehiculoALaFlota(autobus1));
		assertTrue(empresaDeTransporte.agregarVehiculoALaFlota(autobus2));

	}

}
