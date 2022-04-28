package examen1;

public final class Paciente { //inmutabilidad
	private final String nombre;
	private final int edad;
	private final int temperatura;
	private final boolean vomito;
	
	public Paciente(String nombre, int edad, int temp, boolean vomito) { //sobrecarga de metodos
		this.nombre=nombre;
		this.edad = edad;
		this.temperatura = temp;
		this.vomito = vomito;
	}
	
	//encapsulacion
	public String getNombre() {
		return nombre;
	}
	

	public int getEdad() {
		return edad;
	}


	public int getTemperatura() {
		return temperatura;
	}


	public boolean getVomito() {
		return vomito;
	}	
}
