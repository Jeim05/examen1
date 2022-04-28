package examen1;

import java.util.List;

import hospital.Hospital;
import pruebaCovid.PruebaCovid19;
import pruebaCovid.PruebaPCR;
import pruebaCovid.PruebaRapida;

public abstract class OMS { 
	private List<Paciente> pacientes;
	private List<PruebaCovid19> resultadoList; 
	
	protected abstract boolean isGamHospital(); 
	public abstract Hospital getNombreHospital(); 

	
	public OMS(List<Paciente> pacientes) {
	this.pacientes = pacientes;
	}
	
	private void diagnosticar() { //polimorfismo
		if(isGamHospital()) {
			for (Paciente paciente : pacientes) {
				PruebaPCR pcr = new PruebaPCR(paciente);
				this.resultadoList.add(pcr);
			}
		}
		else {
			for (Paciente paciente : pacientes) {
				PruebaRapida rapida = new PruebaRapida(paciente);
				this.resultadoList.add(rapida);
			}
		}
	}
	
	public void imprimirReporte() {
		this.diagnosticar();
		System.out.println(getNombreHospital());
		for (PruebaCovid19 prueba : resultadoList) {
			System.out.println(prueba.getNombrePaciente() +' '+ prueba.isPositiveCase());
		}
		
	}
}