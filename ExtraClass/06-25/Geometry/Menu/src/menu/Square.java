
package menu;

import java.util.Scanner;


public class Square {
    
    private double side;
    private double result;
    
    public double getSide (){
        return side;
    }
    
    public void askSide() {
        System.out.println("Digite la medida del lado del cuadrado: ");
        Scanner scanner = new Scanner(System.in);
        side = scanner.nextInt();
    }
    
    public double calcPerimeter(){
        return result = side * 4;
    }
    
    public double calcArea(){
        return result = side * side;
    }
    
    public double getResult(){
        return result;
    }
    
}

