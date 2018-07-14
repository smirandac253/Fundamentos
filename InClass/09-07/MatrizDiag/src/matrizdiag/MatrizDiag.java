
package matrizdiag;


public class MatrizDiag {

  
    public static void main(String[] args) {
        int [][] matriz = {
            {2 ,2 ,3},
            {1 ,3 ,3},
            {1 ,2 ,2},
        };
        int numDiagonal = 0;
        boolean hasAssigned = false;
        boolean diagonalOk = true;
        
       for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++){
                if (i == j){
                    if (!hasAssigned){
                        hasAssigned = true;
                        numDiagonal = matriz [i][j];
                    } else if (numDiagonal != matriz [i][j]){
                    diagonalOk = false;
                    }
                }
            }      
         }
        System.out.println("Diagonal: " + (diagonalOk ? "OK"  : "mal"));
    }
}

