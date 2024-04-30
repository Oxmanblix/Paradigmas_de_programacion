package figures;
/**
 * @author Miranda Pérez Fernando Antonio
 */
public class Figures {
   public static void main(String[] args){
       //Circulo
       System.out.println(" Objeto Circulo:");
        Circulo circulo1 = new Circulo(8,"Azul");
        circulo1.Info();
        double Perimetro=circulo1.getPerimetro();
        double Area=circulo1.getArea();
        String Color=circulo1.getColor();
        System.out.println("Metodo getColor     Color:"+Color);
        System.out.println("Perimetro del circulo= " + Perimetro+" cm\nArea del circulo= "+Area+" cm^2");
        
        //Rectangulo
        System.out.println("\n Objeto Rectangulo");
        Rectangulo rectangulo1= new Rectangulo();
        rectangulo1.setAltura(12);
        rectangulo1.setBase(10);
        rectangulo1.setColor("Rojo");
        rectangulo1.Info();
        Perimetro=rectangulo1.getPerimetro();
        Area=rectangulo1.getArea();
        Color=rectangulo1.getColor();
        System.out.println("Metodo getColor     Color:"+Color);
        System.out.println("Perimetro del rectangulo= " + Perimetro+" cm\nArea del rectangulo= "+Area+" cm^2");
        
        //Cuadrado
        System.out.println("\n Objeto Cuadrado");
        Cuadrado cuadrado1=new Cuadrado();
        cuadrado1.setLado(8);
        cuadrado1.setColor("Rosa");
        cuadrado1.Info();
        Perimetro=cuadrado1.getPerimetro();
        Area=cuadrado1.getArea();
        Color=cuadrado1.getColor();
        System.out.println("Metodo getColor     Color:"+Color);
        System.out.println("Perimetro del cuadrado= " + Perimetro+" cm\nArea del cuadrado= "+ Area+" cm^2");
        
        //Triangulo
        System.out.println("\n Objeto Triangulo");
        Triangulo triangulo1=new Triangulo();
        triangulo1.setAltura(9.3);
        triangulo1.setBase(6.8);
        triangulo1.setColor("Verde");
        triangulo1.Info();
        Perimetro=triangulo1.getPerimetro();
        Area=triangulo1.getArea();
        Color=triangulo1.getColor();
        System.out.println("Metodo getColor     Color:"+Color);
        System.out.println("Perimetro del triangulo= "+Perimetro+" cm\nArea del triangulo= "+Area+" cm^2");
                                
   } 
}
