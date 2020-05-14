package app;

public class Categoria {
	private int id;
	private static int cont=1;
	private String nombre;
	private String descripcion;
	
	public Categoria( String nombre, String descripcion) {
		setId();
		setNombre(nombre);
		setDescripcion(descripcion);
	}
	
	@Override
	public String toString() {
		return "Categoria: Su id es " + id + ", la definimos como " + descripcion;
	}

	public int getId() {
		return id;
	}

	private void setId() {
		this.id = cont++;
	}

	public static int getCont() {
		return cont;
	}

	public static void setCont(int cont) {
		Categoria.cont = cont;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
