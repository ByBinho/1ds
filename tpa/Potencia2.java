package lista;

import java.util.Scanner;

public class Potencia2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int TAM = 11;

        int A[], i;

        A = new int[TAM];

        for(i = 0; i < TAM; i++) {
            A[i] = (int)Math.pow(2, i);
        }

        System.out.print("\nA = ");
        for(i = 0; i < TAM; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
