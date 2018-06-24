/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Scanner;

/**
 *
 * @author Sofi
 */
public class IsTriangle {
      private double base;
      private double height;
      private double longside;
      private double shortside;
    private double result;
       
    public void askBase (){
        System.out.println("Digite la medida de la base de la figura:");
        Scanner scanner = new Scanner(System.in);
        base = scanner.nextInt();
    }
    public double getBase(){
        return base;
    }
    
    public void askHeight (){
        System.out.println("Digite la medida de la altura de la figura:");
        Scanner scanner = new Scanner(System.in);
        height = scanner.nextInt();
    }
    public double getHeight(){
        return height;
    }
    
     public void askLongSide (){
        System.out.println("Digite la medida del lado mas largo de la figura:");
        Scanner scanner = new Scanner(System.in);
        longside = scanner.nextInt();
    }
    public double getLongSide(){
        return longside;
    }
    
    public void askShortSide (){
        System.out.println("Digite la medida del lado mas corto de la figura:");
        Scanner scanner = new Scanner(System.in);
        shortside = scanner.nextInt();
    }
    public double getShortSide(){
        return shortside;
    }
   
    public double calcPerimeter(){
        return result = 2 * (longside + shortside);
    }
    
    public double calcArea(){
        return result = base * height / 2;
    }
    public double getResult(){
        return result;
    }
}
