package tp2_gp3_labIV;

public class Persona
{
    private int dni;
    private String nombre;
    private String apellido;

    public int getDni()
    {
        return dni;
    }

    public void setDni(int dni)
    {
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
    
    public Persona(int dni, String nombre, String apellido)
    {
        super();
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
    
    
}
