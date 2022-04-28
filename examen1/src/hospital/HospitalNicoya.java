package hospital;

import java.util.List;

import examen1.OMS;
import examen1.Paciente;

public class HospitalNicoya extends OMS {
	private Hospital hospital; 
	
	public HospitalNicoya(List<Paciente> pacientes) {
		super(pacientes);
	}

	@Override
	protected boolean isGamHospital() {
			if(this.hospital.HospitalMexico.name()== "Hospital Mexico") {
				return true;
			}
		return false;
	}
	@Override
	public Hospital getNombreHospital() {
		return this.hospital.HospitalAnexion;
	}
	
	
}
