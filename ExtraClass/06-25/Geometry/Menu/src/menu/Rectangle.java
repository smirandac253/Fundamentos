
package menu;

import java.util.Scanner;

public class Rectangle {
    private double length;
    private double width;
    private double result;
    
    public void askLength (){
        System.out.println("Digite la medida del largo de la figura:");
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();
    }
    public double getLength(){
        return length;
    }
    public void askWidth (){
        System.out.println("Digite la medida del ancho de la figura:");
        Scanner scanner = new Scanner(System.in);
        width = scanner.nextInt();
    }
    public double getWidth(){
        return width;
    }
    public double calcPerimeter(){
        return result = (length + length + width + width);
    }
    
    public double calcArea(){
        return result = length * width;
    }
    public double getResult(){
        return result;
    }
}
