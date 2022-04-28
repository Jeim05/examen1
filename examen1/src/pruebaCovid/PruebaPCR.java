package pruebaCovid;

import examen1.Paciente;

public final class PruebaPCR implements PruebaCovid19{
	Paciente paciente;
	
	public PruebaPCR(Paciente paciente) {
		this.paciente = paciente;
	}

	@Override
	public boolean isPositiveCase() {
		if(paciente.getTemperatura() >= 39 && paciente.getVomito()) {
			return true;
		}
		return false;
	}

	@Override
	public String getNombrePaciente() {
		return this.paciente.getNombre();
	}
}
