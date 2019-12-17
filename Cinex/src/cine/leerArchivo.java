package cine;

import java.io.*;

class leerFichero
{
	public String leerF(String nombre)
	{
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		String l = null;
		try
		{
			archivo = new File(nombre);
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			
			String linea;
			while((linea=br.readLine())!= null)
				l = linea;
			return l;
		}
		catch(Exception e)
		{
			e.printStackTrace();		
		}
		finally
		{
			try
			{
				if (null != fr) 
				{
					fr.close();					
				}				
			}
			catch (Exception e2)
			{
				e2.printStackTrace();				
			}
		}
		return null;
		
		
	}
}