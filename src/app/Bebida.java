package app;

public class Bebida {
	private int codigo;
	private String nombre;
	private float precio;
	
	public Bebida(int codigo, String nombre, float precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Carta: El codigo es " + codigo + ", Nombre: " + nombre + ", su precio es de " + precio;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
}
