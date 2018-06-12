
package banco;

import java.util.Scanner;

public class Cuenta {
    private int cuenta = 0;
    private int monto;
    private String decision;
    
    Scanner scanner = new Scanner(System.in);
    
    public void ask (){
        System.out.println("Introduzca la accion: ");
        decision = scanner.next ();
    }
        
    private void debitar (int dolar) {
        System.out.print("Introduzca el Monto a debitar: ");
        monto = scanner.nextInt();
        int remanente = cuenta - monto;
        
        if (remanente >= 0) {
            cuenta = cuenta - monto;
            System.out.println("Debito Listo! Quedan: $" + cuenta);
        } else {
            System.out.println("No tiene fondos suficientes. Solo tiene $" + cuenta);
        }
    }
    
    private void acreditar (int dolar){
        System.out.println("Introduzca el monto a acreditar: ");
        monto = scanner.nextInt();
        cuenta = cuenta + monto;
        System.out.println("Credito Listo! Quedan : $" + cuenta);
    }
    
    public void print() {
        while (decision.compareTo("s") != 0) {
            
            if (decision.compareTo ("d") == 0) {
                debitar (monto);
            }
            else if (decision.compareTo("c") == 0) {
                acreditar (monto);
            }
            ask ();
        }
        System.out.println("Al final quedaron: $" + cuenta);
    }
}
    

