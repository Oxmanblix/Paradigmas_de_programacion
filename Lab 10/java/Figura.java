/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author FER
 */
abstract class Figure {
    String Color;
    
    public Figure(String Color){        /*  clase abstracta Figure  */
        this.Color=Color;
    }
    
    abstract String getColor();
    abstract double Perimetro();        /*  Métodos abstractos */ 
    abstract double Area();

}

class Triangulo extends Figure{    /*  Se hace la herencia de los métodos  */
    
    double base;
    double altura;
    
    public Triangulo(String Color,double base,double altura){
        super(Color);
        this.altura=altura;
        this.base=base;
    }
    
    @Override
    public String getColor(){    /* Anulación de los métodos abstractos */
        return Color;
    }
    
    @Override
    public double Perimetro(){
        return ( 2*(Math.sqrt(Math.pow(base/2,2) + Math.pow(altura, 2)))+base);
    }
    
    @Override
    public double Area(){
        return (base*altura)/2;
    }   
}

class Circulo extends Figure{   /* Nueva clase que hereda de Figures */
    
    double radio;
    
    public Circulo(String Color,double radio){
        super(Color);
        this.Color=Color;
        this.radio=radio;
    }
    
    @Override
    public String getColor(){
        return Color;
    }
    
    @Override
    public double Perimetro(){     /*anulación de métodos*/
        return Math.PI*2*radio;
    }
    
    @Override
    public double Area(){
        return Math.PI*radio*radio;
    }
}

class Rectangulo extends Figure{
    
    float base;
    float altura;
    
    public Rectangulo(String Color,float base,float  altura){
        super(Color);
        this.base=base;
        this.altura=altura;
    }
    
    @Override
    public String getColor(){
        return Color;
    }
    
    @Override
    public double Perimetro(){
        return (base*2)+(altura)*2;
    }
    
    @Override
    public double Area(){
        return base*altura;
    }  
}

class Hexagono extends Figure{
    
    double apotema;
    double lado;
    
    public Hexagono(String Color,double apotema,double lado){
        super(Color);
        this.apotema=apotema;
        this.lado=lado;
    }
    
    @Override
    public String getColor(){
        return Color;
    }
    
    @Override
    public double Perimetro(){
        return lado*6;
    }
    
    @Override
    public double Area(){
        return Perimetro()*apotema;
    }  
    
}

public class Figura{
    public static void main(String[] args) {
        
        Figure f;
        System.out.println("\n Triangulo");
        f = new Triangulo("Azul", 10, 7);
        System.out.println("Color del triangulo: "+f.getColor());
        System.out.println("Perimetro del triangulo: "+f.Perimetro());
        System.out.println("Area del triangulo: "+f.Area());
        
        System.out.println("\n Circulo");
        f = new Circulo("Rojo", 15);
        System.out.println("Color del circulo: "+f.getColor());
        System.out.println("Perimetro del circulo: "+f.Perimetro());
        System.out.println("Area del circulo: "+f.Area());
        
        System.out.println("\n Rectangulo");
        f = new Rectangulo("Verde", 7,8);
        System.out.println("Color del rectangulo: "+f.getColor());
        System.out.println("Perimetro del rectangulo: "+f.Perimetro());
        System.out.println("Area del rectangulo: "+f.Area());
        
        System.out.println("\n Hexagono");
        f = new Hexagono("Morado", 12.7,8.43);
        System.out.println("Color del hexagono: "+f.getColor());
        System.out.println("Perimetro del hexagono: "+f.Perimetro());
        System.out.println("Area del hexagono: "+f.Area());   
    }
    
}