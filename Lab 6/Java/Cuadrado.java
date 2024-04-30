package figures;
/**
 * @author Miranda Pérez Fernando Antonio
 */
public class Cuadrado {

    private float lado;
    private String Color;
    
    public Cuadrado() {
        this.lado=0;
        this.Color="";
    }
    
    public Cuadrado(float lado,String Color){
        this.lado=lado;
        this.Color=Color;
    }
    
    public void setLado(float lado){
        this.lado=lado;
    }
    
    public void setColor(String Color){
        this.Color=Color;
    }
    
    public float getPerimetro(){
        return lado*4;
    }
    
    private float calcularPerimetro(){
        return getPerimetro();
    }
    
    public float getArea(){       
        return calcularArea();
    }
    
    private float calcularArea(){
        return lado*lado;
    }
    
    public void Info(){
        System.out.println("Lado:"+lado+" Color: "+Color);
    }
    
    public String getColor(){
        return this.Color;
    }
    
}
