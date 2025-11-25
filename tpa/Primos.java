package lista;
import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        final int TAM = 10;
        int A[];
        int i, j, cont;

        A = new int[TAM];

        for(i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i+1) + "º valor do vetor A:");
            A[i] = in.nextInt();
        }

        for(i = 0; i < TAM; i++) {

            cont = 0;

            for(j = 1; j <= A[i]; j++) {
                if(A[i] % j == 0) {
                    cont++;
                }
            }

            if(cont == 2) {
                System.out.println(A[i] + " é primo");
            } else {
                System.out.println(A[i] + " não é primo");
            }
        }
    }
}
