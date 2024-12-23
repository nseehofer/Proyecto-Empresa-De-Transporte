package ar.edu.unlam.pb2.ParcialEmpresaDeTransporte;

public class Pasajero implements Comparable<Pasajero> {

	private Integer edad;

	public Pasajero(Integer edad) {
		this.edad = edad;
	}

	@Override
	public int compareTo(Pasajero o) {
		// ORDEN INVERTIDO
		return o.edad.compareTo(this.edad);
	}

}
