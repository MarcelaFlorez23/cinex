package cine;

import java.util.ArrayList;



public class boleto extends Pelicula
{
	
	private String ticket = "No ";
	
	public boleto(String titulo, String director, int duracion, int costo) 
	{
		super(titulo, director, duracion, costo);
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * Metodo para generar el ticket de una pelicula.
	 * Recibe como parametros un arrayList 
	 */
	public void boletoPelicula()
	{
		
		for(int x=0; x<=10; x++)
		{
			System.out.println("*******************************");
		}
		System.out.println("\n Su ticket se está generanodo\n Espere un momento!\n");
		System.out.println("*******************************");
		System.out.println("* Titulo: "+ titulo);
		System.out.println("* Duración:"+ director);
		System.out.println("* Costo: " + costo);
		System.out.println("* Disfrute de su pelicula!");
		System.out.println("*******************************");
		
	}
	public void boletoGolosina(ArrayList<String> compra)
	{
		int len = compra.size()-1;
		int aux = 0;
		String producto;
		String precio;
		System.out.println("**************************");
		for(int i =1; i<len; i++)
		{
			producto = compra.get(aux);
			precio = compra.get(aux+1);
			aux += i;
			
			System.out.println("\n Producto: "+ producto +"\n"+"Precio: "+ precio+"\n");
		}
		System.out.println("**************************");
				
	}
	
	@Override
	public String toString()
	{
		return "\n Generando boleto: " + ticket + ", disfrute su pelicula";
		
	}
}
