package cine;

import java.util.ArrayList;


public class Golosinas 
{
	// Array en que contendra los datos de lasgolosinas
	// nombre, tipo, descripcion, precio, 
	String golosinas[][] = 
			{
			{"Palomitas", "Normales","Solo palomitas normales y naturales", "20"},
			{"Gaseosa", "Chica","Gaseosa sabor Cola", "15"},
			{"Chocolate", "Chico","Chocolate amargo","12"}  
			};
	
	protected String nombre;
	protected String tipo;
	protected String descripcion;
	protected int precio;
	
	ArrayList<String> compra = new ArrayList<String>();											// Declaramos una instancia de ArrayList, u array dinámico
	
	private Eleccion elegir = new Eleccion();												// Hacemos una instancia de la clase elegir
	protected int opt;																		// Aqui se almacena la eleccion.
	
	private boleto tkt = new boleto(null, null, 0, 0);										// Instanciamos la clase boleto
	
	protected void golosina()
	{
		System.out.println("\n\nOk, esta en la sección de golosinas!\n");
		
		/*
		 * Obtenemos y listamos los datos de los productos en venta 
		 */
		for (int i = 0; i<golosinas.length; i++)
		{
			nombre = golosinas[i][0];													// Se obtiene el nombre del producto
			tipo = golosinas[i][1];														// Se optienen el tipo
			descripcion = golosinas[i][2];												// Se optiene la descripcion	
			precio = Integer.parseInt(golosinas[i][3]);									// Se obtiene el precio
			
			System.out.println("Opcion "+ i);											// Mostramos el número de la opcion
			System.out.println(toString());												// y los datos del producto.	
		}
	}
	/*
	 * En este metodo cargamos las difernets golosinas antes de fenerar el tecket de pago
	 */
	protected void cargar()
	{
		menuEntrada mE = new menuEntrada(null, null, 0, 0);		        						        // Instanciamos la clase menuEntrada
		golosina();																						// Mostramos el menú de golosinas
		
		opt = elegir.elegir();																			// Llamamos al metodo elegir de la clase Eleccion
		System.out.println("Ok, ha seleccionado: "+golosinas[opt][0]+"!\n");							// Indicamos que producto se ha seleccionado
		compra.add(golosinas[opt][0]);																	// Añadimos al arrayList el nombre del producto
		compra.add(golosinas[opt][3]);																	// Se añade el precio al arrayList 	
				
		System.out.println("¿Cargar a la cuenta?");
		
		System.out.println("Seleccione 3, para terminar de comprar!");
		
		opt = elegir.sino();																			// Llamamos al metodo sino de la case Eleccion
		
		
		/*
		 * Con la opcion uno se genera el ticket de pago, sin embargo antes de eso
		 * se pregunta si se quiere continuar cmprando, en caso de hacerlo el se
		 * llama recursivamente al metodo cargar.
		 */
		if(opt == 1)																					// Comparamos el resultado de la eleccion
		{
			System.out.println("Ok, el producto se cargara en la cuenta");
			// Cargar el total y la opción
			
			System.out.println("¿Seguir comprando?");
			opt = elegir.sino();																		// Nuevamente llamamos al metodo sino.			
			
			
			/*
			 * Opcion uno(1), continuar.
			 * Se muestra nuevamente el menú de golosinas y se mantienen los datos del arrayList
			 */
			if(opt == 1)																				// Si la eleccion es 1 o si, continuamos
			{
				cargar();																				// Se llama al metodo golosina, que despliega el menu
																										// de golosinas existentes
			}
			/*
			 * Opción 2, cancelar.
			 * Se limpia el contenido de arrayList
			 */
			
			else if(opt == 2)																			// Si la eleccion fue 'n'o o '0', regresamos al menu de golosinas
			{
				System.out.println("Regresando al menú de golosinas!");
				compra.clear();
				cargar();
			}
			/*
			 * Opcion tres(3), terminar.
			 * Sin embargo en esta opción no se limpia el arrayList, y en este caso se genera el ticket.
			 */
			else if(opt == 3)
			{
				System.out.println("Generando su ticket de pago.\n Espere!!");						
				//System.out.println(compra);
				tkt.boletoGolosina(compra);
				System.out.println("Regresando al menú principal!");				
				//mn.verMenu(); 																				// Llamamos al metodo elegir de la clase menuEntrada
				
			}
		}
		/*
		 * Opción 2, cancelar.
		 * No se continua comprando y se limpia el arrayList
		 */
		else if(opt == 2)																						
		{
			System.out.println("Regresando al menú de golosinas");
			compra.clear();
			cargar();
		}
		
		/*
		 * Opción 3, terminar.
		 * Se termina la compra de golosinas y se genera el ticket de los productos seleccionados
		 * cargados hasta este punto.
		 * Y regresamos al menú principal.
		 */
		else if(opt == 3)																						
		{
			System.out.println("Generando su ticket de pago.\n Espere!!");						
			
			tkt.boletoGolosina(compra);
			System.out.println("Regresando al menú principal!");				
			mE.verMenu(); 																					
		}
	}
		
	@Override
	public String toString()
	{
		return " Producto: "+nombre+"\n Tipo: "+tipo+"\n Precio: "+ precio+"\n";
		
	}

}
