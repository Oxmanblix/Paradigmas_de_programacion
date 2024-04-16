public class Persona {
    
    public String nombre;
    public String nacionalidad;
    public String ocupacion;
    public String telefono;
    public int edad;
    //public int telefono;
    public float peso;
    public double estatura;
    
    
    
    
    public Persona(String n)
    {
        nombre=n;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public void setNombre(String nom)
    {
        nombre=nom;
    }
    
    public void setNacionalidad(String nac)
    {
        nacionalidad=nac;
    }
    
     public String getNacionalidad()
    {
        return nacionalidad;
    }
    
    public void setOcupacion(String oc)
    {
        ocupacion=oc;
    }
    
    public String getOcupacion()
    {
        return ocupacion;
    }
    
    public void setEdad(int age)
    {
        edad=age;
    }
    
    public int getEdad()
    {
        return edad;
    }
    
    public void setTelefono(String fon)
    {
        telefono=fon;
    }
    
    public String getTelefono()
    {
        return telefono;
    }
    
    public void setPeso(float Kg)
    {
        peso=Kg;
    }
    
    public float getPeso()
    {
        return peso;
    }
    
    public void setEstatura(double height)
    {
        estatura=height;
    }
    
    public double getEstatura()
    {
        return estatura;
    }
    
    @Override
    public String toString()
    {
        return nombre;
    }
    
}