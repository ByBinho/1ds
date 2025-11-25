package lista;

import java.util.Scanner;

public class Diferenca {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int TAM = 10;
        int A[], B[], C[], i, j, k, existe;
        A = new int[TAM];
        B = new int[TAM];
        C = new int[TAM];
        k = 0;

        for(i=0; i<TAM; i++) {
            System.out.println("Digite o " + (i+1) + "º valor de A:");
            A[i] = in.nextInt();
        }

        System.out.println();

        for(i=0; i<TAM; i++) {
            System.out.println("Digite o " + (i+1) + "º valor de B:");
            B[i] = in.nextInt();
        }

        for(i=0; i<TAM; i++) {
            existe = 0;
            for(j=0; j<TAM; j++) {
                if(A[i] == B[j]) {
                    existe = 1;
                    break;
                }
            }
            if(existe == 0) {
                C[k] = A[i];
                k++;
            }
        }

        for(i=0; i<k; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
