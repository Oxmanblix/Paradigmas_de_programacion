/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Ejemplo1A24 {

    public static void main(String[] args) {
        Persona p1=new Persona("AGF");
        //p1.nombre="AGF";
        p1.setNombre("Anita");
        p1.setNacionalidad("Francesa");
        p1.setOcupacion("Pintora");
        p1.setEdad(32);
        p1.setTelefono("3789432181");
        p1.setPeso(58);
        p1.setEstatura(1.63);
        System.out.println("Nombre: "+p1.getNombre()+"\nNacionalidad: "+p1.getNacionalidad());
        System.out.println("Ocupación: "+p1.getOcupacion()+"\nEdad: "+p1.getEdad()+"\nTeléfono: "+p1.getTelefono());
        System.out.println("Peso: "+p1.getPeso()+" Kg"+"\nEstatura: "+p1.getEstatura()+" m");
        
    }
}
