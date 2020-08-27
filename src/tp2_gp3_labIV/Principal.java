package tp2_gp3_labIV;

import java.util.Set;

public class Principal
{
    
    public static void main(String[] args)
    {
        // Lectura de archivo, path relativo
        Archivo file = new Archivo();
        file.setPath("files/PersonasEmpresa.txt");
        
        // Si no existe el archivo lo creamos
        if( !file.fileExists() )
        {
            file.fileCreate();
        }
        
        
        //Christian
		try {
			String ruta = "ruta";

			Lector lector = new Lector();
			Set<Persona> personas = lector.Leer(ruta);

			System.out.println("Ejecución Correcta");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }
}
