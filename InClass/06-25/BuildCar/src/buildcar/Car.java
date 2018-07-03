/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildcar;

import java.util.Scanner;

public class Car {
   
    
    public Car(int length, int doors){
        
         body  bodycar1 = new body();
         Chasis chasiscar1 = new Chasis();
        bodycar1.printLayer1(length);
        bodycar1.printLayer2(doors);
        chasiscar1.printLayer3(length);
     
    }
    
}
