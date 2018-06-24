
package menu;

import java.util.Scanner;


public class EqTriangle {
    private double side;
    private double result;
       
    public void askSide (){
        System.out.println("Digite la medida del lado de la figura:");
        Scanner scanner = new Scanner(System.in);
        side = scanner.nextInt();
    }
    public double getSide(){
        return side;
    }
   
    public double calcPerimeter(){
        return result = 2 * side;
    }
    
    public double calcArea(){
        return result = (Math.sqrt((3) * (side * side)) / 4);
    }
    public double getResult(){
        return result;
    }
    
}
