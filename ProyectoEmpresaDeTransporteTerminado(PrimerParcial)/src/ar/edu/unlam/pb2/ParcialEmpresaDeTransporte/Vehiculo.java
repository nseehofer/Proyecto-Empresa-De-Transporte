package ar.edu.unlam.pb2.ParcialEmpresaDeTransporte;

public abstract class Vehiculo {
	private Chofer chofer;
	private Double kmRecorridos;

	protected abstract Boolean agregarPasajero(Pasajero pasajero);

	protected void recorreKilometros(Double km) {
		this.kmRecorridos = +km;
	}

	protected Double kmRecorridos() {
		return this.kmRecorridos;
	}

	protected abstract Boolean cambiarDeChofer(Chofer chofer);

	protected Boolean agregarChofer(Chofer chofer) {
		if (this.chofer == null) {
			this.chofer = chofer;
			return true;
		}
		return false;
	}
}
