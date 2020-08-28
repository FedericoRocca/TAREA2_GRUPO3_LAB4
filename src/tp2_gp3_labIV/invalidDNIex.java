package tp2_gp3_labIV;

public class invalidDNIex extends Exception
{

    @Override
    public String getMessage()
    {
        return "El DNI es incorrecto";
    }
}
