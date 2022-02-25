package relacionesUML;

public class Dinero {
	private double cantidad;
	private String Moneda;

	public Dinero(double cantidad, String moneda) {
		super();
		this.cantidad = cantidad;
		Moneda = moneda;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public String getMoneda() {
		return Moneda;
	}

	public void setMoneda(String moneda) {
		Moneda = moneda;
	}
}
