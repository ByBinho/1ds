package lista;
import java.util.Scanner;

public class VetorParImpar {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        final int TAM = 20;
        int A[], B[];
        int i, j;
        int qtdPares = 0;

        A = new int[TAM];
        B = new int[TAM];

       
        for(i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i+1) + "º valor do vetor A:");
            A[i] = in.nextInt();
        }

        
        for(i = 0; i < TAM; i++) {
            if(A[i] % 2 == 0) {
                qtdPares++;
            }
        }

        
        j = 0;
        for(i = 0; i < TAM; i++) {
            if(A[i] % 2 == 0) {
                B[j] = A[i];
                j++;
            }
        }

        
        j = qtdPares;
        for(i = 0; i < TAM; i++) {
            if(A[i] % 2 != 0) {
                B[j] = A[i];
                j++;
            }
        }

        
        System.out.print("\nVetor B = ");
        for(i = 0; i < TAM; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
