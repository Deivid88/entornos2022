package relacionesUML;

import java.util.List;

import clases.Persona;

public class Hijo extends Persona{

	private String nombre;
	private List<Hijo> hijos;

	public Hijo(String nombre, List<Hijo> hijos) {
		super(nombre);
		this.nombre = nombre;
		this.hijos = hijos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Hijo> getHijos() {
		return hijos;
	}

	public void setHijos(List<Hijo> hijos) {
		this.hijos = hijos;
	}
}
