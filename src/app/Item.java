package app;

public class Item {
	private int cantidad;
	private Ingrediente ingrediente;
	
	public Item(int cantidad, Ingrediente ingrediente) {
		indicarCantidad(cantidad);
		setIngrediente(ingrediente);
	}
	
	@Override
	public String toString() {
		return "Item: La cantidad es de " + cantidad + ", el ingrediente es " + ingrediente;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void indicarCantidad(int cant) {
		this.cantidad= cant>0 ? cant : 0;
	}
	
	public Ingrediente getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(Ingrediente ingrediente) {
		this.ingrediente = ingrediente;
	}
	
}
