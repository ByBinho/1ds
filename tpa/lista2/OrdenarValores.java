package lista2;
import java.util.Scanner;
import java.util.Locale;

public class OrdenarValores {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o valor A: ");
        int A = ler.nextInt();

        System.out.print("Digite o valor B: ");
        int B = ler.nextInt();

        System.out.print("Digite o valor C: ");
        int C = ler.nextInt();

        int menor, meio, maior;

        
        if (A <= B && A <= C) {
            menor = A;
            if (B <= C) {
                meio = B;
                maior = C;
            } else {
                meio = C;
                maior = B;
            }
        } else if (B <= A && B <= C) {
            menor = B;
            if (A <= C) {
                meio = A;
                maior = C;
            } else {
                meio = C;
                maior = A;
            }
        } else {
            menor = C;
            if (A <= B) {
                meio = A;
                maior = B;
            } else {
                meio = B;
                maior = A;
            }
        }

        System.out.println("Ordem crescente: " + menor + ", " + meio + ", " + maior);

        ler.close();
    }
}
