package array;

import java.util.Random;

public class Array {

    public static void main(String[] args) {

        Random rndNum = new Random();

        int[] A = new int[10];

        for (int i = 0; i < A.length; i++) {
            int num1 = rndNum.nextInt(10);
            A[i] = num1;
        }

        int[] B = new int[10];
        for (int j = 0; j < B.length; j++) {
            int num2 = rndNum.nextInt(10);
            B[j] = num2;
        }

        int[] C = new int[10];
        for (int h = 0; h < C.length; h++) {
            for (int i = 0; i < B.length; i++) {
                C[h] += A[h] * B[i];
            }
            
            System.out.println("[" + h + "] = " + C[h]);
        }

    }

}
