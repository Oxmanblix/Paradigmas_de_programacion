package figures;
/**
 * @author Miranda Pérez Fernando Antonio
 */
public class Circulo {
    private double radio;
    private String Color;
    
    public Circulo(){
        this.radio=0;
        this.Color="";
    }
    
    public Circulo(double radio, String Color){
        this.radio=radio;
        this.Color=Color;
    }

    public double getRadio(){
        return radio;
    }

    public String getColor(){
        return this.Color;
    }

    public double getArea(){
        return calcularArea();    
    }
    
    private double calcularArea(){        
        return Math.PI * Math.pow(radio, 2); //Radio al cuadrado
    }

    public double getPerimetro(){
        return calcularPerimetro();        
    }
    
    private double calcularPerimetro(){        
        return Math.PI * (2 * radio);
    }
    
    public void setRadio(double radio){
        this.radio=radio;
    }

    public void setColor(String Color){
        this.Color=Color;
    }

    public void Info() {
    System.out.println("Radio=" + radio + ", Color: " + Color);
    }
}
