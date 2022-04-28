package pruebaCovid;

import examen1.Paciente;

public final class PruebaRapida implements PruebaCovid19{
	Paciente paciente;
	
	public PruebaRapida(Paciente paciente) {
		this.paciente=paciente;
	}

	@Override
	public boolean isPositiveCase() {
		if(this.paciente.getTemperatura()>= 37 && this.paciente.getEdad()>=60) {
		return true;
		}
		return false;
	}

	@Override
	public String getNombrePaciente() {
		return this.getNombrePaciente();
	}
}
