
package menu;

import java.util.Scanner;

public class MainMenu {
       private int optionMain;
       private int optionSec;
       private int optionOther;
    
    public void main (){
        System.out.println("Digite la opcion que desea realizar: \n1.Calcular Perimetro. \n2.Calcular Area. \n3.Salir.");
        Scanner scanner = new Scanner(System.in);
        optionMain = scanner.nextInt();
    }
    public void sec(){
        System.out.println("Digite la figura que desea calcular: \n1.Cuadrado. \n2.Rectangulo. \n3.Circulo. \n4.Triangulo Equilatero. \n5.Triangulo Isosceles. \n6.Pentagono Regular \n7.Salir");
        Scanner scanner = new Scanner(System.in);
        optionSec = scanner.nextInt();
    }
    public void otherOp(){
        System.out.println("¿Desea ejecutar otra opcion? \n1.Si \n2.No");
        Scanner scanner = new Scanner(System.in);
        optionOther = scanner.nextInt();
    }
    
    public int getOptionMain(){
        return optionMain;
    }
     public int getOptionSec(){
        return optionSec;
    }
    public int getOptionOhter(){
        return optionOther;
    }
}
