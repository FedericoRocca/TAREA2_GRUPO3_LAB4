package tp2_gp3_labIV;

public class Persona implements Comparable<Persona>
{
    private int dni;
    private String nombre;
    private String apellido;

    public int getDni()
    {
        return dni;
    }

    public void setDni(int dni) throws invalidDNIex
    {
        if( dni < 9999999 || dni > 99999999 )
        {
            throw new invalidDNIex();
        }
        this.dni = dni;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }
    
    public Persona(int dni, String nombre, String apellido) throws invalidDNIex
    {
        super();
        if( dni < 9999999 || dni > 99999999 )
        {
            throw new invalidDNIex();
        }
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona()
    {
        super();
        dni = 11111111;
        nombre = "Sin nombre";
        apellido = "Sin apellido";
    }

    @Override
    public String toString()
    {
        return "Persona, DNI: " + dni + ", nombre: " + nombre + " " + apellido;
    }
    
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + dni;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (dni != other.dni)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public int compareTo(Persona o) {
		if(this.nombre.equals(o.nombre))
			return 0;
		if(this.nombre.compareTo(o.nombre)>0)
			return -1;
		return 1;
	}
    
}
