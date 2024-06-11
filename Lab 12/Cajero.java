/**
 *
 * @author FER
 */
import java.util.Scanner;

class FondosInsuficientes extends Exception{
    private double monto;
    
    public FondosInsuficientes(double monto){
        super("Fondos insuficientes, intente de nuevo con una cantidad "
                + "menor a: $"+monto);
        this.monto=monto;
    }
    
    public double getMonto(){
        return monto;
    }
}

class SaldoEfectivoInsuficiente extends Exception {
    public SaldoEfectivoInsuficiente(double monto) {
        super("El cajero no tiene suficiente efectivo para completar el retiro.\nFondos del cajero: $"+monto);
    }
}

class CuentaInexistente extends Exception{
    public CuentaInexistente(){
        super("El nombre del titular o la contrasenia es incorrecto.");
    }
}


class Cuentahabiente{
    private double saldo;
    private String titular;
    private String password;
    
    public Cuentahabiente(double saldoinicial,String titular,String password){
        this.saldo=saldoinicial;
        this.titular=titular;
        this.password=password;
    }
    
    double getSaldo(){
        return saldo;
    }
    
    String getTitular(){
        return titular;
    }
    
    String getPassword(){
        return password;
    }
    
    public void retiro(double monto) throws FondosInsuficientes{
        if (monto > saldo){
            throw new FondosInsuficientes(monto);
        }
        saldo-=monto;
    }
    
    public void depositopropio (double  monto){
        saldo+=monto;
    }
    
    public void depositoEnOtraCuenta(Cuentahabiente cuenta, double monto) {
        cuenta.depositopropio(monto);
    }
    
    public void transferencia(Cuentahabiente Cuenta,double monto) throws 
            FondosInsuficientes{
        if (saldo<monto){
            throw new FondosInsuficientes(monto);
        }
        saldo-=monto;
        Cuenta.depositopropio(monto);
    }
}

public class Cajero {
    
    private double efectivo;
    private Cuentahabiente[] Cuentas;
    private int numCuentas;
    
    public Cajero(double efectivo,Cuentahabiente Cuentas[]){
        this.Cuentas= Cuentas;
        this.efectivo=efectivo;
        this.numCuentas=Cuentas.length;
    }
    
    public Cuentahabiente autenticar(String nombreCuenta,String password) throws CuentaInexistente {
        for (Cuentahabiente cuenta : Cuentas) {
            if (cuenta.getTitular().equals(nombreCuenta) && cuenta.getPassword().equals(password)) {
                return cuenta;
            }
        }
        throw new CuentaInexistente();
    }
    
    public void depositarEfectivo(double monto) {
        efectivo += monto;
    }
    
    //@Override
    public Cuentahabiente autenticar(String nombreCuenta) throws CuentaInexistente {
        for (Cuentahabiente cuenta : Cuentas) {
            if (cuenta.getTitular().equals(nombreCuenta)) {
                return cuenta;
            }
        }
        throw new CuentaInexistente();
    }
    
     public void retirarEfectivo(Cuentahabiente cuenta, double monto) throws SaldoEfectivoInsuficiente, FondosInsuficientes {
        if (monto > efectivo) {
            throw new SaldoEfectivoInsuficiente(efectivo);
        }
        cuenta.retiro(monto);
        efectivo -= monto;
    }
    

    public static void main(String[] args) {
        String nombre;
        String password;
        int menu,otra;
        double deposito;
        double monto;
        String nombreDestino;
        
        Cuentahabiente cuenta1 = new Cuentahabiente(5000, "Juan Perez", "password123");
        Cuentahabiente cuenta2 = new Cuentahabiente(3000, "Maria Lopez", "password456");
        Cuentahabiente cuenta3 = new Cuentahabiente(170000, "Carlos Ruiz", "password789");

        Cuentahabiente[] cuentas = {cuenta1, cuenta2, cuenta3};
        Cajero cajero = new Cajero(100000, cuentas);
        
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        do{            
            System.out.print("Ingrese el nombre del titular de la cuenta: ");
            nombre=sc1.nextLine();
            System.out.print("Ingrese la contrasenia: ");
            password=sc2.nextLine();
            try {
                //Autenticación
                Cuentahabiente cuenta = cajero.autenticar(nombre,password);

                do {                
                    System.out.println("\nMenu de cajero:\n");
                    System.out.println("1. Checar saldo\n2. Deposito\n3. Retiro\n4. Transferencia\n5. Deposito a otra cuenta\n6. Salir");
                    menu = sc1.nextInt();
                    
                    switch(menu){
                        case 1:
                            System.out.println("Su saldo actual es de : $" + cuenta.getSaldo());
                            break;
                            
                        case 2:
                            System.out.print("Ingrese el monto a depositar: ");
                            deposito = sc1.nextDouble();
                            cuenta.depositopropio(deposito);
                            cajero.depositarEfectivo(deposito);
                            System.out.println("Deposito exitoso. Saldo actual: $" + cuenta.getSaldo());
                            break;
                            
                        case 3:
                            System.out.print("Ingrese el monto a retirar: ");
                            double retiro = sc1.nextDouble();
                            try {
                                cajero.retirarEfectivo(cuenta, retiro);
                                System.out.println("Retiro exitoso. Saldo actual: $" + cuenta.getSaldo());
                            } catch (SaldoEfectivoInsuficiente | FondosInsuficientes e) {
                                System.out.println(e.getMessage());
                            }
                            break;

                        case 4:
                            System.out.print("Ingrese el nombre de la cuenta de destino: ");
                            sc1.nextLine();                 // Limpiar el buffer
                            nombreDestino = sc1.nextLine();
                            System.out.print("Ingrese el monto a transferir: ");
                            monto = sc2.nextDouble();

                            try {
                                Cuentahabiente cuentaDestino = cajero.autenticar(nombreDestino);
                                cuenta.transferencia(cuentaDestino, monto);
                                System.out.println("Transferencia exitosa. Saldo actual es de : $" + cuenta.getSaldo());

                            } catch (CuentaInexistente | FondosInsuficientes e) {
                                System.out.println(e.getMessage());
                            }
                            break;

                        case 5:                            
                            System.out.print("Ingrese el nombre de la cuenta de destino: ");
                            sc1.nextLine();
                            nombreDestino=sc1.nextLine();
                            System.out.print("Ingrese el monto a depositar: ");
                            monto=sc2.nextDouble();
                            try {
                                Cuentahabiente cuentaDestino = cajero.autenticar(nombreDestino);
                                cuenta.depositoEnOtraCuenta(cuentaDestino, monto);
                                cajero.depositarEfectivo(monto);
                                System.out.println("Deposito exitoso.");
                            } catch (CuentaInexistente e) {
                                System.out.println(e.getMessage());
                            }                            
                            break;
                            
                        case 6:
                            System.out.println("\nGracias por usar el cajero.");
                            break;

                        default:
                            System.out.println("Ingrese una opcion valida.\n");

                    }                
                }while (menu!=6);
            } catch (CuentaInexistente e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Desea utilizar otra cuenta? 0=No, 1=Si ");
            otra=sc2.nextInt();
            sc1.nextLine();
            sc2.nextLine();
        }while(otra!=0); 

    }

}
