package tp2_gp3_labIV;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Lector {
	int index, contador, dni;
	String nombre = "";
	String apellido = "";

	public Set<Persona> Leer(String ruta) throws Exception, invalidDNIex {
		try {
			List<Persona> persona = new ArrayList<>();
			String linea = "";
			new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ruta, true), "UTF8"));

			BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(ruta), "utf-8"));
			try {
				while ((linea = in.readLine()) != null) {
					index = 0;
					contador = 0;
					while (contador < 3) {
						index = linea.indexOf("-");
						if (index != -1) {
							switch (contador) {
							case 0:
								nombre = linea.substring(0, index);
								linea = linea.substring(index + 1, linea.length());
								break;
							case 1:
								apellido = linea.substring(0, index);
								linea = linea.substring(index + 1, linea.length());
								break;
							}
						} else if (contador == 2) {
							dni = Integer.parseInt(linea);
						}
						contador++;
					}
					
					try
                    {
					    Persona p = new Persona(dni, nombre, apellido);
					    persona.add(p);
	                    p = null;
                    }
					catch (invalidDNIex dniEX)
		            {
		                
		            }
				}
			} 
			catch (Exception e) 
			{
				throw new Exception(e.getMessage());
			} 
			finally 
			{
				in.close();
			}

			Set<Persona> x = new TreeSet<Persona>(persona);
			return x;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
}
