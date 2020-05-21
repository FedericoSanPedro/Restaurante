package app;

public class Restaurante {
	private String nombre;
	private String direccion;
	private Carta carta;
	
	public Restaurante(String nombre, String direccion, Carta carta) {
		setNombre(nombre);
		setDireccion(direccion);
		setCarta(carta);
	}

	@Override
	public String toString() {
		return "Restaurante: Nombre: " + nombre + ", direccion en " + direccion + " y su mejor carta " + carta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Carta getCarta() {
		return carta;
	}

	public void setCarta(Carta carta) {
		this.carta = carta;
	}
	
}
