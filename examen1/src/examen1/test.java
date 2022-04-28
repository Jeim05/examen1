package examen1;

import java.util.ArrayList;
import java.util.List;

import hospital.HospitalMexico;
import hospital.HospitalNicoya;

public class test {

	public static void main(String[] args) {
		OMS oms;
		Paciente paciente1 = new Paciente("Jeimmy", 21, 37, false);
		Paciente paciente2 = new Paciente("Estefany", 23, 39, false);
		Paciente paciente3 = new Paciente("Juan", 62, 40, true);
		Paciente paciente4 = new Paciente("Maria", 30, 38, true);
		Paciente paciente5 = new Paciente("Allan", 60, 40, false);
		List<Paciente> pacientes = new ArrayList<Paciente>();
		pacientes.add(paciente1);
		pacientes.add(paciente2);
		pacientes.add(paciente3);
		pacientes.add(paciente4);
		pacientes.add(paciente5);
		
		oms = new HospitalMexico(pacientes); //Polimorfismo
		
		oms.imprimirReporte();
		
		oms = new HospitalNicoya(pacientes);//Polimorfismo
		oms.imprimirReporte();
		
		
	}

}
