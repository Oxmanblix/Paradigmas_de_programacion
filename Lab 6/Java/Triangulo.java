package figures;
/**
 * @author Miranda Pérez Fernando Antonio
 */
public class Triangulo {
    
    private double base;
    private double altura;
    private String Color;

    public Triangulo() {
        this.base=0;
        this.altura=0;
        this.Color="";
    }
    
    public Triangulo(double base,double altura, String Color){
        this.base=base;
        this.altura=altura;
        this.Color=Color;
    }
    
    public void setBase(double base){
        this.base=base;
    }
    
    public void setAltura(double altura){
        this.altura=altura;
    }
    
    public void setColor (String Color){
        this.Color=Color;
    }
    
    public String getColor(){
        return this.Color;
    }
    
    public double getArea(){
        return (base*altura)/2;
    }
    
    private double calcularArea(){
        return getArea();
    }
    
    public double getPerimetro(){
        return calcularPerimetro();        
    }
    
    private double calcularPerimetro(){        
        return ( 2*(Math.sqrt(Math.pow(base/2,2) + Math.pow(altura, 2)))+base);
    }
    
    public void Info(){
        System.out.println("Base: "+base+" Altura: "+altura+" Color: "+Color);
    }
    
    
}
