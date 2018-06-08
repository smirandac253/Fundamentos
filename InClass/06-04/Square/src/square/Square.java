package square;

import java.util.Scanner;



public class Square {
    public static void PrintCompleteLine(int size){
        for (int i = 0; i < size; i++){
        System.out.print("*"); 
        }
    }
    public static void PrintEmptyLine(int lado) {
        System.out.print("*");
        for (int j = 0; j < lado -2; j++){
            System.out.print(" ");
        }
        System.out.print("*");
    }
  
    public static void main(String[] args) {
      Scanner scan = new Scanner (System.in);
        System.out.print("Ingrese un numero ");
        int size = scan.nextInt();
        for (int i = 0; i < size; i++){
            if (i == 0 || i == size - 1) {
                PrintCompleteLine (size);

            }else{
                PrintEmptyLine (size);
            }
            System.out.println("\n");
        }
        
    }
}    
