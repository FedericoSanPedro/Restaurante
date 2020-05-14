package app;

public class Plato {
	private int codigo;
	private String nombre;
	private String descripcion;
	private int nivelDificultad;
	private Categoria categoria;
	private Receta receta;
	private float precioFinal;
	
	public Plato(int codigo, String nombre, String descripcion, int nivelDificultad, Categoria categoria, Receta receta, float precioFinal) {
		setCodigo(codigo);
		setNombre(nombre);
		setDescripcion(descripcion);
		setNivelDificultad(nivelDificultad);
		setCategoria(categoria);
		setReceta(receta);
		setPrecioFinal(precioFinal);
	}
	
	@Override
	public String toString() {
		return "Plato: El codigo es " + codigo + ", Nombre: " + nombre + ", se trata de " + descripcion + ", su dificultad es de "
				+ nivelDificultad + ", la categoria es " + categoria + ", su receta es " + receta + " y su precio final es " + precioFinal;
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

	public int getNivelDificultad() {
		return nivelDificultad;
	}

	public void setNivelDificultad(int nivelDificultad) {
		this.nivelDificultad = nivelDificultad;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Receta getReceta() {
		return receta;
	}

	public void setReceta(Receta receta) {
		this.receta = receta;
	}

	public float getPrecioFinal() {
		return precioFinal;
	}

	public void setPrecioFinal(float precioFinal) {
		this.precioFinal = precioFinal;
	}
	
	public void calcularPrecioFinal() {
		
	}
	
}
