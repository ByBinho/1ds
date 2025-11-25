package lista1;
import java.util.Scanner;
import java.util.Locale;

public class AreaSala {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite a largura da sala: ");
        double largura = ler.nextDouble();

        System.out.print("Digite o comprimento da sala: ");
        double comprimento = ler.nextDouble();

        double area = largura * comprimento;

        System.out.println("A área da sala é: " + area + " m²");

        ler.close();
    }
}

