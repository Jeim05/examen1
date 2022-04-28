package pruebaCovid;

import examen1.Paciente;

public final class PruebaPCR implements PruebaCovid19{
	Paciente paciente;
	
	public PruebaPCR(Paciente paciente) { // inyeccion de dependencias
		this.paciente = paciente;
	}

	@Override
	public boolean isPositiveCase() { //sobreescritura de metodos
		if(paciente.getTemperatura() >= 39 && paciente.getVomito()) {
			return true;
		}
		return false;
	}

	@Override
	public String getNombrePaciente() { //sobreescritura de metodos
		return this.paciente.getNombre();
	}
}
