package ar.edu.unlam.pb2.ParcialEmpresaDeTransporte;

import java.util.ArrayList;
import java.util.List;

public class Automovil extends Vehiculo {

	private List<Pasajero> listaDePasajero = new ArrayList<Pasajero>();
	private Chofer chofer;
	private Double kmRecorridos;
	
	@Override
	public Boolean agregarPasajero(Pasajero pasajero) {

		if (this.listaDePasajero.size() <= 2) {
			this.listaDePasajero.add(pasajero);
			return true;
		}
		return false;
	}

	
	@Override
	public Boolean cambiarDeChofer(Chofer chofer) {
		if (this.chofer != null && this.listaDePasajero == null) {
			this.chofer = chofer;
			return true;
		}
		return false;
	}

}
