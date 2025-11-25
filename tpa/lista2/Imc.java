package lista2;
import java.util.Scanner;
import java.util.Locale;

public class Imc {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o seu peso (kg): ");
        double peso = ler.nextDouble();

        System.out.print("Digite a sua altura (m): ");
        double altura = ler.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é %.2f. ", imc);

        if (imc < 18.5) {
            System.out.println("Excesso de Magreza.");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso Normal.");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Excesso de Peso.");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Obesidade (Grau I).");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Obesidade (Grau II).");
        } else {
            System.out.println("Obesidade (Grau III).");
        }

        ler.close();
    }
}
