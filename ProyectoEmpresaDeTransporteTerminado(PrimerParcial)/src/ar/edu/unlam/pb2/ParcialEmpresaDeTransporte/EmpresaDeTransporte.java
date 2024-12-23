package ar.edu.unlam.pb2.ParcialEmpresaDeTransporte;

import java.util.ArrayList;
import java.util.List;

public class EmpresaDeTransporte {

	List<Vehiculo> flotaDeVehiculos = new ArrayList<Vehiculo>();

	public Boolean agregarVehiculoALaFlota(Vehiculo vehiculo) {
		this.flotaDeVehiculos.add(vehiculo);
		return true;

	}

}
