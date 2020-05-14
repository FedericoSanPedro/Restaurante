package app;

public class Main {

	public static void main(String[] args) {
		
		Ingrediente ing1 = new Ingrediente(101,"Carne","Vacuna",25);
		Ingrediente ing2 = new Ingrediente(102,"Carne","Cerdo",35);
		Ingrediente ing3 = new Ingrediente(103,"Queso","Cheddar",20);
		Ingrediente ing4 = new Ingrediente(104,"Vegetal","Lechuga",10);
		Ingrediente ing5 = new Ingrediente(105,"Vegetal","Tomate",15);
		
		Receta rec1 = new Receta(201,"Hamburguesa Completa");
		Receta rec2 = new Receta(202,"Super Hamburguesa con queso");
		Receta rec3 = new Receta(203,"Hamburguesa con lechuga y tomate");
		
		rec1.agregar(ing1);
		rec1.agregar(ing3);
		rec1.agregar(ing5);
		
		rec2.agregar(ing1);
		rec2.agregar(ing2);
		rec2.agregar(ing3);
		
		rec3.agregar(ing1);
		rec3.agregar(ing4);
		rec3.agregar(ing5);
		
		
		Categoria cat1 = new Categoria("Oh no","Seguro que el cliente le agarra un infarto");
		Categoria cat2 = new Categoria("Bueno","Espero que lo disfruten");
		
		Plato plat1 = new Plato(401,"Armaggedon","4 hamburguesas en un plato",5,cat1,rec1,800);
		Plato plat2 = new Plato(402,"Salvaje","3 hamburguesas con picante",2,cat2,rec3,600);
		Plato plat3 = new Plato(403,"Morir","9 hamburguesas para 2 personas",7,cat1,rec2,1700);
		
		Bebida beb1 = new Bebida(301,"Pepsi",65);
		Bebida beb2 = new Bebida(302,"Agua",60);
		
		Carta cart = new Carta();
		
		cart.agregar(beb1);
		cart.agregar(plat2);
		
		Restaurante rest = new Restaurante("Creep","Diaogonal Pueyrredon 1234",cart);
		
	}

}
