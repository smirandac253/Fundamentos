
package ejercicio1c3;

import java.util.Scanner;

public class Ejercicio1C3 {

    public static void main(String[] args) {
    int suma = 0;
    int contador = 0;
    int digito;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite un numero: ");
     digito = scanner.nextInt ();
            while (digito != 0) {
                    suma = suma + digito;
                    contador = contador + 1;
                    System.out.println("Digite un numero: ");
                    digito = scanner.nextInt ();
            }
                int resultado = suma / contador;
                System.out.println("El promedio de los numeros digitados es: " + resultado);
                          
            }
    }
    

