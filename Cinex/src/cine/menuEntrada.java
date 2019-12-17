package cine;

public class menuEntrada extends Pelicula
{
	
	estreno verEstrenos = new estreno(null, null, 0, 0);									// Instanciamos  la clase estrenos.
	Golosinas golosina = new Golosinas();											// Creamos una instancia de Golosinas

	
	Eleccion leer = new Eleccion();										// Instanciamos la clase Eleccion
	int opt;
	
	
	
	public menuEntrada(String titulo, String director, int duracion, int costo) 
	{
		super(titulo, director, duracion, costo);
		// TODO Auto-generated constructor stub
		
	}

	void menuPrincipal()
	{
		System.out.println("\n\n\n");
		System.out.println("Bienvenido a Cinex.");
		System.out.println("Seleccione una de las opciones: \n");
		
		System.out.println("#############################");
		System.out.println("#       Menú                #");
		System.out.println("# 1- Ver estrenos!          #");
		System.out.println("# 2- Ver Cartelera general! #");
		System.out.println("# 3- Comprar golosinas :D!  #");
		System.out.println("#                           #");
		System.out.println("#############################");
	}
	
	/*
	 * Leemos la entrada desde el teclado de la selección que ha hecho el usuario.
	 * Esto es un metodo de servicio ) 
	 */
	public void verMenu()
	{
		menuPrincipal();
		
		System.out.println("Seleccione su opcion: \n ");
		
		opt = leer.elegir();															// Leemos la opcion del usuario, por medio del metodo elegir
																						// de la clase Eleccion
		/*
		 * Si se ha seleccionado la opcion 1 o sea, ver los estrenos 
		 * procedemos con el primer 'if' que nos mostrara la lista de 
		 * estrenos
		 */
		if (opt == 1) 
		{
			System.out.println("Ok, ahora se listaran los estrenos!\n");
			verEstrenos.selectPeli();														// Llamamos al metodo selPelis de la clase estrenos
		}
		/*
		 * Si se ha seleccionado la opcion 2 o sea, ver la cartelera general 
		 * procedemos con el primer 'else if' que muestra la cartelera general
		 */
		else if (opt == 2)
		{
			System.out.println("No implementado aun!");
			
			System.out.println("Regresando al menú principal.");							// Opcion temporal
			verMenu();
		}
		/*
		 * Si se ha seleccionado la opcion 2 o sea, ver la cartelera general 
		 * procedemos con el segundo 'else if' que muestra el menu de golosinas.
		 */
		else if (opt == 3)
		{
			System.out.println("\n");
					
			golosina.cargar();																// Metodo cargar de la clase Golosinas
		}
		/*
		 * Comprobamos que la opcion seleccionada sea valida
		 */
		else if(opt != 1 || opt != 2 || opt != 3)
		{
			System.out.println("Opcion no valida, intente nuevamente!");		
			verMenu(); 																		// Llamada recursiva a la funcion verMenu
		}
	}
	
	@Override
	public String toString()
	{
		return "Selecciona una da las opciones del menú general";
	}


}