package lista2;
import java.util.Scanner;
import java.util.Locale;

public class Bhaskara {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o valor de A: ");
        double A = ler.nextDouble();

        System.out.print("Digite o valor de B: ");
        double B = ler.nextDouble();

        System.out.print("Digite o valor de C: ");
        double C = ler.nextDouble();

        double delta = (B * B) - (4 * A * C);

        System.out.println("Delta = " + delta);

        if (delta < 0) {
            System.out.println("Não existem raízes reais.");
        } else if (delta == 0) {
            double x = (-B) / (2 * A);
            System.out.println("Existe apenas uma raiz real: X = " + x);
        } else {
            double x1 = (-B + Math.sqrt(delta)) / (2 * A);
            double x2 = (-B - Math.sqrt(delta)) / (2 * A);

            System.out.println("Existem duas raízes reais:");
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        }

        ler.close();
    }
}
