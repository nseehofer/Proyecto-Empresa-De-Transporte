package ar.edu.unlam.pb2.ParcialEmpresaDeTransporte;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Autobus extends Vehiculo {

	private Double kmRecorridos;
	private Chofer chofer;
	private List<Pasajero> listaDePasajero = new ArrayList<Pasajero>();

		

	// REVISAR LOS METODOS ENCERRADOS AQUI EN SUS CLASES TEST PORQUE LOS CAMBIE DE
	// VOID A BOOLEAN
	
	@Override
	public Boolean agregarPasajero(Pasajero pasajero) {

		if (this.listaDePasajero.size() < 20) {
			this.listaDePasajero.add(pasajero);
			return true;
		}
		return false;
	}

	//

	public List<Pasajero> getListaDePasajero() {
		return this.listaDePasajero;
	}
	
	@Override
	public Boolean cambiarDeChofer(Chofer chofer) {
		if (this.chofer != null && this.listaDePasajero == null) {
			this.chofer = chofer;
			return true;
		}
		return false;
	}

	public List<Pasajero> pasajerosSentadosDeMayorAMenor() {
		List<Pasajero> pasajerosSentadosPorOrdenDeEdadDeMayorAMenor = new ArrayList<Pasajero>(this.listaDePasajero);
		Collections.sort(pasajerosSentadosPorOrdenDeEdadDeMayorAMenor);
		return pasajerosSentadosPorOrdenDeEdadDeMayorAMenor;
	}

}
