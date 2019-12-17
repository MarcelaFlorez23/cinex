package cine;

import java.util.Scanner;

public class Eleccion 
{
	Scanner leer = new Scanner(System.in);										// Hacemos una instancia de Scanner
	int opt;																	// Variable en la que se almacena la lectura
	
	/*
	 * Este metodo esta simplemenete pensado para leer un entero, que posteriormente se 
	 * retornara a la funcion desde la que se invoque. 
	 */
	public int elegir()
	{
		
		try																								// Intentamos hacer lalectura
		{
		System.out.println("\nSeleccione del menú:");
		opt = leer.nextInt();																			// Leemos y almacenamos un entero 
		}
		catch(Exception e)																				// Se captura y procesa cualquier excepcion que ocurra
		{
			System.out.println("Erro: "+e);																// Se indica el error y suscarateristicas.
		}
		return opt;																						// Si todo fue bien, se retorna el entero leido.
		
	}
	
	/*
	 * Metodo que se encarga de recojer una selección de tipo Si o No
	 * lo cual se maneja con un 0 si es falso, y 1 si es verdadero. 
	 * Y posteriormente se retorna el valor leido
	 */
	public int sino()
	{
		try
		{
		System.out.println("\nSeleccione:\n 1- continuar. \n 2- Cancelar. \n 3- Terminar");
		opt = leer.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Error: "+ e);
		}
		return opt;
	}
	
	
}
