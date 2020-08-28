package tp2_gp3_labIV;

import java.util.Set;

public class Principal
{
    
    public static void main(String[] args)
    {
		try 
		{
		    // Abrimos archivo
			String ruta = "files/PersonasEmpresa.txt";

			// Cargamos el archivo en una lista, ordenado de Z a A, sin duplicados
			Lector lector = new Lector();
			Set<Persona> personas = lector.Leer(ruta);
			
			for (Persona persona : personas)
            {
                System.out.println(persona);
            }
			System.out.println("Ejecuci�n Correcta");
		}
		catch (Exception e) 
		{
		    System.out.println("Se produjo la siguiente excepci�n: ");
			System.out.println(e.getMessage());
		}
    }
}
