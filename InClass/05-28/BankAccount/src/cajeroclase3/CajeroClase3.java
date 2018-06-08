
package cajeroclase3;

import java.util.Scanner;

public class CajeroClase3 {

    public static void main(String[] args) {
      int cuenta = 0;
      String decision;
      Scanner scanner = new Scanner(System.in);
      System.out.println("Introduzca la accion");
      decision = scanner.next ();
      while (decision.compareTo("s") != 0) {
          
          if (decision.compareTo ("d") == 0) {
              System.out.print("Introduzca el Monto a debitar: ");
              int monto = scanner.nextInt();
              int remanente = cuenta - monto;
              
              if (remanente >= 0) {
               cuenta = cuenta - monto;
               System.out.println("Debito Listo! Quedan: $" + cuenta);   
              } else {
                  System.out.println("No tiene fondos suficientes. Solo tiene $" + cuenta);
              }
              
          } else if (decision.compareTo("c") == 0) {
            System.out.println("Introduzca el monto a acreditar: ");
            int monto = scanner.nextInt();
            cuenta = cuenta + monto;
            System.out.println("Credito Listo! Quedan : $" + cuenta);
          }
        System.out.println("Introduzca la accion");
        decision = scanner.next();
    }
    System.out.println("Al final quedaron: $" + cuenta);
    }
    
}
