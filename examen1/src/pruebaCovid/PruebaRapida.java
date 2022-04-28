package pruebaCovid;

import examen1.Paciente;

public final class PruebaRapida implements PruebaCovid19{
	Paciente paciente;
	
	public PruebaRapida(Paciente paciente) { // inyeccion de dependencias
		this.paciente=paciente;
	}

	@Override
	public boolean isPositiveCase() { //sobreescritura de metodos
		if(this.paciente.getTemperatura()>= 37 && this.paciente.getEdad()>=60) {
		return true;
		}
		return false;
	}

	@Override
	public String getNombrePaciente() { //sobreescritura de metodos
		return this.getNombrePaciente();
	}
}
