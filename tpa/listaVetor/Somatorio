package lista;

import java.util.Scanner;

public class Somatorio {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int TAM = 10;
        int A[], B[], i, j, s;
        A = new int[TAM];
        B = new int[TAM];

        for(i=0; i<TAM; i++) {
            System.out.println("Digite o " + (i+1) + "º valor:");
            A[i] = in.nextInt();
        }

        for(i=0; i<TAM; i++) {
            s = 0;
            for(j=i; j<TAM; j++) {
                s = s + A[j];
            }
            B[i] = s;
        }

        for(i=0; i<TAM; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
