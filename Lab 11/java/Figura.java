/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author FER
 */
interface Figure {
    abstract String getColor();
    abstract double Perimetro();        /*  Métodos abstractos */ 
    abstract double Area();

}

class Triangulo implements Figure{ /*Se hace la implementación de la interfaz*/
    
    String Color;       //El atributo Color pasa a ser de la clase abstracta
    double base;        //Figure a un atributo propio de cada figura.
    double altura;
    
    public Triangulo(String Color,double base,double altura){
        this.Color=Color;
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

class Circulo implements Figure{   /* Nueva clase que implementa a Figures */
    
    String Color;
    double radio;
    
    public Circulo(String Color,double radio){
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

class Rectangulo implements Figure{
    
    String Color;
    float base;
    float altura;
    
    public Rectangulo(String Color,float base,float  altura){
        this.Color=Color;
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

class Hexagono implements Figure{
    
    String Color;
    double apotema;
    double lado;
    
    public Hexagono(String Color,double apotema,double lado){
        this.Color=Color;
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

