package app;

public class Ingrediente {
	private int codigo;
	private String nombre;
	private String descripcion;
	private float precioUnitario;
	
	public Ingrediente(int codigo, String nombre, String descripcion, float precioUnitario) {
		setCodigo(codigo);
		setNombre(nombre);
		setDescripcion(descripcion);
		setPrecioUnitario(precioUnitario);
	}
	
	@Override
	public String toString() {
		return "Ingrediente: El codigo es " + codigo + ", Nombre:" + nombre + ", especificamente" + descripcion
				+ ", y su valor por unidad es $" + precioUnitario + ".";
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(float precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	
}
