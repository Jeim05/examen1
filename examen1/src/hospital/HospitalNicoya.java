package hospital;

import java.util.List;

import examen1.OMS;
import examen1.Paciente;

public class HospitalNicoya extends OMS {
	
	public HospitalNicoya(List<Paciente> pacientes) {
		super(pacientes);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean isGamHospital() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Hospital getNombreHospital() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
