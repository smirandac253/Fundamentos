
package buildcar;


public class body {
    
      public void printLayer1 (int length){
        for (int i = 0 ; i < length - 2; i++){
            System.out.print("_");
        }
        System.out.print("\n");
    }
    
    public void printLayer2(int length){
        System.out.print("|");
     for (int j = 0 ; j < length -1; j++){
            System.out.print(" ");
        }
        System.out.print("[]");
        System.out.print("\\"+"\n");
    
    }

      
}
