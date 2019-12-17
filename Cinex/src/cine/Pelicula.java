package cine;



/*
 * Esta clase es una clase padre o super clase, de ella heredaran algunas otras.
 * Se definen los datos generales de la pelicula, asi como una descripcion de la misma.
 */

public class Pelicula 
{
																			// Estas variables son accesibles solo desde las clases hijas
																			// Por eso el modificador 'protected'
	protected int opcion;											        // No tiene un uso actualmente, a futuro quizá

	protected String titulo;										        // Titulo de la pelicula.
	protected String director;												// Nombre del director.
	protected int duracion;													// Duracion de la pelicula
	protected int 	 costo;													// Precio del boleto.
		
	/*
	 * Constructor de la clase, con los parametros referentes a las variables usadas.
	 */
	public Pelicula(String titulo, String director, int duracion, int costo)
	{	
		// asignamos los valores recividos, a las variables locales.
		this.titulo = titulo;
		this.director = director;
		this.duracion = duracion;
		this.costo = costo;
	}
		
	
	/*
	 * Descripcion de la clase, Pelicula este metodo nos retorna una cadena(String) con la descripcion,
	 *  es este caso de la pelicula. 
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	@Override	
	public String toString()
	{
		return "La pelicula "+ titulo + " dirigida por, " + director + "\nes una hobra maestra, de "+duracion+ " minutos!\n"; 
	}
}
