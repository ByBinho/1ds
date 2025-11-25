package lista;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int TAM = 5;

        int A[], i, j;

        A = new int[TAM];

        for(i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i+1) + " valor do vetor A:");
            A[i] = in.nextInt();
        }

        for(i = 0; i < TAM; i++) {
            System.out.println("\nTabuada do " + A[i] + ":");
            for(j = 1; j <= 10; j++) {
                System.out.println(A[i] + " x " + j + " = " + (A[i] * j));
            }
        }
    }
}
