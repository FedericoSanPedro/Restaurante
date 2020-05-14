package app;

import java.util.ArrayList;

public class Receta {
	private int codigo;
	private String nombre;
	private ArrayList <Item> items;
	
	public Receta(int codigo, String nombre) {
		setCodigo(codigo);
		setNombre(nombre);
		setItems(items);
	}
	
	public Receta() {
		setItems(items);
	}

	@Override
	public String toString() {
		return "Receta: El codigo es " + codigo + ", Nombre:" + nombre + ", y su lista de items es: " + items;
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

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	
	public float calcularCostoReceta() {
		 float total = 0;
	        if (getItems() != null){
	            for (Item itm : getItems())
	            {
	                total = total + itm.getCantidad() * itm.getIngrediente().getPrecioUnitario();
	            }
	        }

	        return  total;
	}
	
	public void agregar(Ingrediente ing) {
		  if (!ing.getNombre().isEmpty()) {
			  if(ing!=null) {
		            items.add(ing);
			  }
		  }
	}

}