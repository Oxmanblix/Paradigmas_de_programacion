import java.util.Scanner;
/**
 * @author FER
 */
public class Punto3D {
    public double num;
    private double x,y,z;
    
    public Punto3D(){
        this.x=0;
        this.y=0;
        this.z=0;
    }
    
    public Punto3D(double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    
    public void setX(double x){
        this.x=x;
    }
    
    public void setY(double y){
        this.y=y;
    }
    
    public void setZ(double z){
        this.z=z;
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public double getZ(){
        return z;
    }
    
    public Punto3D(Punto3D punto){
        this.x=punto.getX();
        this.y=punto.getY();
        this.z=punto.getZ();        
    }
    
    public void Info(){
        System.out.println("x = "+x+"\ny = "+y+"\nz = "+z);
    }
    
    public double distancia(Punto3D punto2){
        double distx = punto2.getX()-this.x;
        double disty = punto2.getY()-this.y;
        double distz = punto2.getZ()-this.z;
        
        return Math.sqrt((distx*distx)+(disty*disty)+(distz*distz));
    }
    
    
    public static void main(String[] args) {
        double num;
        Scanner sc= new Scanner(System.in);
        Punto3D punto1=new Punto3D();
        punto1.Info();
        System.out.print("Ingrese el valor de x: ");
        punto1.setX(num=sc.nextDouble());
        System.out.print("Ingrese el valor de y: ");
        punto1.setY(num=sc.nextDouble());
        System.out.print("Ingrese el valor de z: ");
        punto1.setZ(num=sc.nextDouble());
        System.out.println("\nDatos del punto 1:");
        punto1.Info();
        
        Punto3D punto2= new Punto3D();
        System.out.print("Ingrese el valor de x: ");
        punto2.setX(num=sc.nextDouble());
        System.out.print("Ingrese el valor de y: ");
        punto2.setY(num=sc.nextDouble());
        System.out.print("Ingrese el valor de z: ");
        punto2.setZ(num=sc.nextDouble());
        System.out.println("\nDatos del punto 2:");
        punto2.Info();
        
        double resultado=punto1.distancia(punto2);
        
        System.out.println("La distancia entre el punto 1 y el punto 2 es: "+resultado);      
        
        /* IMPLEMENTACIÓN CON EL ARREGLO DE LOS 10 PUNTOS */
        System.out.println("\nArreglo de 10 puntos Punto3D\n");
        double DistMin= Double.MAX_VALUE;       //Expresando el numero mas grande soportado para un tipo double
        Punto3D[] puntos= new Punto3D[10];
        for (int i = 0; i<puntos.length; i++) {
            puntos[i]= new Punto3D(Math.random() * 10, Math.random() * 10, Math.random() * 10);
            System.out.println("Punto "+(i+1));
            puntos[i].Info();            
        }
        
        for(int i=0;i<puntos.length;i++){       /*.length es para saber el tamaño del arreglo*/
            for(int j=i+1;j<puntos.length;j++){
                resultado=puntos[i].distancia(puntos[j]);
                if (resultado<DistMin){
                    DistMin=resultado;
                    punto1=puntos[i];
                    punto2=puntos[j];
                }
            }
        }
        
        System.out.println("\nLa distancia minima es de: "+DistMin+"\n\nCuyos puntos son:");
        System.out.println("Punto 1: \nx= "+punto1.getX()+"\ny= "+punto1.getY()+"\nz= "+punto1.getZ());
        System.out.println("Punto 2: \nx= "+punto2.getX()+"\ny= "+punto2.getY()+"\nz= "+punto2.getZ());
    }
}
