package tp2_gp3_labIV;

public class Principal
{
    
    public static void main(String[] args)
    {
        // Lectura de archivo, path relativo
        Archivo file = new Archivo();
        file.setPath("files/PersonasEmpresas.txt");
        
        // Si no existe el archivo lo creamos
        if( !file.fileExists() )
        {
            file.fileCreate();
        }
        
    }
}
