
package menu;

import java.util.Scanner;

public class Circle {
    private double radio;
    private double result;
    static final double P = Math.PI;
    
    public void askRadio (){
        System.out.println("Digite la medida del radio de la figura:");
        Scanner scanner = new Scanner(System.in);
        radio = scanner.nextInt();
    }
    public double getRadio(){
        return radio;
    }
   
    public double calcPerimeter(){
        return result = 2 * P * radio;
    }
    
    public double calcArea(){
        return result = P * radio * radio;
    }
    public double getResult(){
        return result;
    }
}
