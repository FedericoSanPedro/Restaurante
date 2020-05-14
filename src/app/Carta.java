package app;

import java.util.ArrayList;

public class Carta {
	private ArrayList<Plato> platos;
	private ArrayList<Bebida> bebidas;
	
	public Carta() {
		this.platos = new ArrayList<>();
		this.bebidas = new ArrayList<>();
	}
	
	@Override
	public String toString() {
		return "Carta: Los platos son " + platos + ", y sus bebidas son " + bebidas;
	}

	public ArrayList<Plato> getPlatos() {
		return platos;
	}

	public void setPlatos(ArrayList<Plato> platos) {
		this.platos = platos;
	}

	public ArrayList<Bebida> getBebidas() {
		return bebidas;
	}

	public void setBebidas(ArrayList<Bebida> bebidas) {
		this.bebidas = bebidas;
	}
	
	public void agregar(Plato plat) {
		if(platos!=null) {
			  if (!plat.getNombre().isEmpty())
		        {
		            if (!existePlatoByNombre(plat.getNombre()))
		                getPlatos().add(plat);
		        }
		}
	}
	
	private boolean existePlatoByNombre(String nombre){
        boolean Esta = false;
        for (int i = 0; i < getPlatos().size() && !Esta; i++)
        {
            if(getPlatos().get(i).getNombre().equals(nombre))
                Esta = true;
        }

        return Esta;
    }

	
	public void agregar(Bebida beb) {
		if(bebidas!=null) {
			if (!beb.getNombre().isEmpty())
	        {
	            if (!existeBebidaByNombre(beb.getNombre()))
	                getBebidas().add(beb);
	        }
		}
	}
	
	private boolean existeBebidaByNombre(String nombre){
        boolean Esta = false;
        for (int i = 0; i < getBebidas().size() && !Esta; i++)
        {
            if(getBebidas().get(i).getNombre().equals(nombre))
                Esta = true;
        }

        return Esta;
    }

	
	public void quitar(int codigo) {
        for (Bebida beb : getBebidas())
        {
            if (beb.getCodigo() == codigo)
            {
                bebidas.remove(beb);
            }
        }
        
        for(Plato plat : getPlatos()) {
        	if(plat.getCodigo() == codigo) 
        	{
        		platos.remove(plat);
        	}
        }
	}
	
	public void listarBebidas() {
		 for (Bebida beb : bebidas){
	            System.out.println(beb.toString());
	        }
	}
	
	public void listarPorCategoria(String categoria) {
		for (Plato plat : platos) {
			if(plat.getCategoria().equals(categoria))
				System.out.println(plat.toString());
		}
	}
	
}
