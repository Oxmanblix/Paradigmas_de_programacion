/**
 *
 * @author FER
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
        
class LecturaNumeros extends BufferedReader {
    
    public LecturaNumeros(){
        super(new InputStreamReader(System.in));
    }
    
    public LecturaNumeros(Reader r){
        super(r);
    }
    
    /*Esta línea define un constructor para la clase `LecturaNumeros` que toma un objeto `Reader` como parámetro. 
    Cuando se llama a este constructor, se utiliza la palabra clave `super` para llamar al constructor de la clase base, 
    en este caso `BufferedReader`, pasándole el objeto `Reader` proporcionado como argumento.

    En resumen, esta línea inicializa un objeto `LecturaNumeros` para que lea desde un flujo de entrada proporcionado
    por el objeto `Reader` especificado. Esto permite que la clase `LecturaNumeros` no solo lea desde la entrada estándar 
    (teclado), sino también desde cualquier otro tipo de flujo de entrada compatible con la clase `Reader`, como archivos,
    cadenas, etc.*/
    
    public int readInt() throws IOException {
        return Integer.parseInt(this.readLine());
    }
    
    public int readInt(String m)throws IOException{
        System.out.print(m);
        return this.readInt();
    }
    
    public Integer readInteger()throws IOException{
        return this.readInt();
    }
    /*
        En otras palabras, Integer es una clase que proporciona un objeto que contiene un valor entero y
        métodos para trabajar con ese valor de manera más flexible que simplemente usar un tipo primitivo int.
    */
    
    public double readDouble() throws IOException{
        return Double.parseDouble(this.readLine());
    }
    
    public double readDouble(String m)throws IOException{
        System.out.print(m);
        return this.readDouble();
    }
}

public class Numeros{
        public static void main(String[] args)throws IOException{
        //try {
            LecturaNumeros lector = new LecturaNumeros();
            System.out.println("Introduce un numero entero");
            int entero1 = lector.readInt();
            int entero2 = lector.readInt("Introduce otro numero entero: ");
            System.out.println("Introduce un tercer numero entero (Objeto Integer)");
            Integer objetoEntero = lector.readInteger();
            System.out.println("Introduce un numero decimal: ");
            double decimal1 = lector.readDouble();
            Double objetoDecimal = lector.readDouble("Introduce un numero decimal (en objeto Double): ");

            System.out.println("Los numeros ingresados son:");
            System.out.println("Entero 1: " + entero1);
            System.out.println("Entero 2: " + entero2);
            System.out.println("Objeto Entero: " + objetoEntero);
            System.out.println("Decimal 1: " + decimal1);
            System.out.println("Objeto Decimal: " + objetoDecimal);
        //} catch (IOException e) {
            //System.err.println("Error de entrada/salida: " + e.getMessage());
        //}
    }
}