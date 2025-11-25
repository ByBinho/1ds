package lista2;
import java.util.Scanner;
import java.util.Locale;

public class Triangulo {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o valor de A: ");
        double A = ler.nextDouble();

        System.out.print("Digite o valor de B: ");
        double B = ler.nextDouble();

        System.out.print("Digite o valor de C: ");
        double C = ler.nextDouble();

        if (A < B + C && B < A + C && C < A + B) {

            if (A == B && B == C) {
                System.out.println("Triângulo Equilátero (três lados iguais).");

            } else if (A != B && B != C && A != C) {
                System.out.println("Triângulo Escaleno (todos os lados diferentes).");

            } else {
                System.out.println("Triângulo Isósceles (dois lados iguais).");
            }

        } else {
            System.out.println("Os valores informados NÃO formam um triângulo.");
        }

        ler.close();
    }
}
