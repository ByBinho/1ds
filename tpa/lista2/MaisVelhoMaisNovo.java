package lista2;
import java.util.Scanner;
import java.util.Locale;

public class MaisVelhoMaisNovo {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        String nomeMaisVelho = "";
        int idadeMaisVelho = -1;

        String nomeMaisNovo = "";
        int idadeMaisNovo = 9999;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o nome da pessoa " + i + ": ");
            String nome = ler.next();

            System.out.print("Digite a idade de " + nome + ": ");
            int idade = ler.nextInt();
            
            
            if (idade > idadeMaisVelho) {
                idadeMaisVelho = idade;
                nomeMaisVelho = nome;
            }

            
            if (idade < idadeMaisNovo) {
                idadeMaisNovo = idade;
                nomeMaisNovo = nome;
            }

            System.out.println();
        }

        System.out.println("Pessoa mais velha: " + nomeMaisVelho + " (" + idadeMaisVelho + " anos)");
        System.out.println("Pessoa mais nova: " + nomeMaisNovo + " (" + idadeMaisNovo + " anos)");

        ler.close();
    }
}
