/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

public class Cuadrado {
    private int tamano;
    
    public Cuadrado(int size){
        System.out.println("Dibujando cuadrado con tamano igual a: " + size + " ...");
        tamano = size;
    }
    
    private void PrintCompleteLine(int size){
        for (int i = 0; i < size; i++){
            System.out.print("*");
        }
    }
    private void PrintEmptyLine(int lado) {
        System.out.print("*");
        for (int j = 0; j < lado -2; j++){
            System.out.print(" ");
        }
        System.out.print("*");
    }
  
    public void print (){
        for (int i = 0; i < tamano; i++){
            if (i == 0 || i == tamano - 1) {
                PrintCompleteLine (tamano);
                
            }else{
                PrintEmptyLine (tamano);
            }
            System.out.println("\n");
        }
    }
    
}

