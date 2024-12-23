package ar.edu.unlam.pb2.ParcialEmpresaDeTransporte;

public class Motocicleta extends Vehiculo {

	private Pasajero pasajero;
	private Double kmRecorridos;
	private Chofer chofer;
	
	@Override
	public Boolean agregarPasajero(Pasajero pasajero) {

		if (this.pasajero == null) {
			this.pasajero = pasajero;
			return true;
		}
		return false;
	}

	
	
	@Override
	public Boolean cambiarDeChofer(Chofer chofer) {
		if (this.pasajero == null) {
			this.chofer = chofer;
			return true;
		}
		return false;
	}

	

}
