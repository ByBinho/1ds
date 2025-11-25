package lista;

import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int TAM = 10;

        int A[], i, j;

        A = new int[TAM];

        for(i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i+1) + " valor do vetor A:");
            A[i] = in.nextInt();
        }

        for(i = 0; i < TAM; i++) {
            System.out.println("\nPares de 0 até " + A[i] + ":");
            for(j = 0; j <= A[i]; j++) {
                if(j % 2 == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
