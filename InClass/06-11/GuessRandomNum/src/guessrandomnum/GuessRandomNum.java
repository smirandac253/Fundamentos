
package guessrandomnum;

import java.util.Random;
import java.util.Scanner;

public class GuessRandomNum {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int RandomNum = random.nextInt(100);
        int NumTyped;
        System.out.println(RandomNum);
        System.out.println("Digite un numero: ");
        NumTyped = scanner.nextInt ();
        while (NumTyped != 0){
            
            if (NumTyped == RandomNum){
                System.out.println("Lo conseguiste!! El numero aleatorio es: " + RandomNum);
                break;
            } else if (NumTyped < RandomNum) {
                System.out.println("El numero es Mayor, digite otro numero: ");
                NumTyped = scanner.nextInt ();
            } else if (NumTyped > RandomNum) {
                System.out.println("El numero es Menor, digite otro numero: ");
                NumTyped = scanner.nextInt ();
            }
        }
        
    }
}

