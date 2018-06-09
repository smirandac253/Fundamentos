
package oddandeven;

import java.util.Scanner;

public class OddAndEven {

    public static void main(String[] args) {
        int division;
        int odd = 0;
        int even = 0;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Type a number: ");
        int number = scanner.nextInt();
        while (number != 0){
            division = number % 2;
            if (division == 0){
                even = even + 1;
                System.out.println("Type a number: ");
                number = scanner.nextInt();
            } else {
                odd = odd + 1;
                System.out.println("Type a number: ");
                number = scanner.nextInt();
            }
        }
        System.out.println("Among the numbers that you typed there are: " + even + " even and " + odd + " odd");
    }
}

