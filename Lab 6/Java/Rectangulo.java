package figures;
/**
 * @author Miranda Pérez Fernando Antonio
 */
public class Rectangulo {
    private float base;
    private float altura;
    private String color;
    
    public Rectangulo (){
        this.base=0;
        this.altura=0;
        this.color="";
    }
    
    public Rectangulo (float base,float altura, String color){
        this.base=base;
        this.altura=altura;
        this.color=color;
    }
    
    public float getArea(){
        return calcularArea();        
    }
    
    private float calcularArea(){        
        return base*altura;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setBase(float base){
        this.base=base;
    }
    
    public void setAltura(float altura){
        this.altura=altura;
    }
    
    public float getPerimetro(){
        return calcularPerimetro();
    }
    
    private float calcularPerimetro(){
        return ((altura*2)+(base*2));
    }
    
    public void setColor(String Color){
        this.color=Color;
    }
    
    public void Info(){
        System.out.println("Base:"+ base + " Altura:" + altura+" Color: "+color);        
    }
    
    
}
