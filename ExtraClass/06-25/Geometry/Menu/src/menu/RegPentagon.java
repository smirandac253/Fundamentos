
package menu;

import java.util.Scanner;

public class RegPentagon {
    private double side;
    private double apotem;
    private double result;
    
    public void askSide (){
        System.out.println("Digite la medida de un lado de la figura:");
        Scanner scanner = new Scanner(System.in);
        side = scanner.nextInt();
    }
    public double getSide(){
        return side;
    }
    public void askApotem (){
        System.out.println("Digite la medida de la apotema de la figura:");
        Scanner scanner = new Scanner(System.in);
        apotem = scanner.nextInt();
    }
    public double getApotem(){
        return apotem;
    }
    public double calcPerimeter(){
        return result = 5 * side;
    }
    
    public double calcArea(){
        return result = ((5 * side * apotem) / 2);
    }
    public double getResult(){
        return result;
    }
}
