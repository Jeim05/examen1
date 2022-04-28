package hospital;

public enum Hospital { 
	HospitalAnexion("Hospital anexion"),HospitalMexico("Hospital Mexico"); 
	private String tipo;
	
	private Hospital(String tipo) {
	this.tipo=tipo;
	}
	
	public String getTipo() {
		return tipo;	
	}
}