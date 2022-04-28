package examen1;

import java.util.List;

import hospital.Hospital;
import pruebaCovid.PruebaCovid19;

public abstract class OMS {
	private List<Paciente> pacientes;
	private List<PruebaCovid19> resultadoList;
	private PruebaCovid19 pruebaCovid19;
	
	protected abstract boolean isGamHospital();
	public abstract Hospital getNombreHospital(); 

	
	public OMS(List<Paciente> pacientes) {
	this.pacientes = pacientes;
	}
	

	private void diagnosticar() {
		
	}
	
	public void imprimirReporte() {
		
	}
}
