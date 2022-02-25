package clases;

public class Alumno extends Persona {

	String expediente;
	private String atribPrivado;
	public String atribPublico;
	protected String atribProtected;

	public String getExpediente() {
		return expediente;
	}

	public void setExpediente(String expediente) {
		this.expediente = expediente;
	}

	public Alumno(String expediente) {
		super(expediente);
		this.expediente = expediente;
	}

	public String getAtribPrivado() {
		return atribPrivado;
	}

	public void setAtribPrivado(String atribPrivado) {
		this.atribPrivado = atribPrivado;
	}
	
	protected void metodoProtected() {
		
	}
}
