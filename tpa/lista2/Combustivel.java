package lista2;
import java.util.Scanner;
import java.util.Locale;

public class Combustivel {

    public static String formatar(double valor) {
        return String.format("%.2f", valor);
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite a distância percorrida em km: ");
        double distancia = ler.nextDouble();

        System.out.print("Digite a capacidade do tanque de combustível em litros: ");
        double capacidade = ler.nextDouble();

        double gastoMedio = distancia / capacidade;

        if (gastoMedio >= 10) {
            System.out.println("Seu gasto médio é de " + formatar(gastoMedio) + " km/L. O seu veículo é econômico.");
        } else {
            System.out.println("Seu gasto médio é de " + formatar(gastoMedio) + " km/L. O seu veículo não é econômico.");
        }

        ler.close();
    }
}
