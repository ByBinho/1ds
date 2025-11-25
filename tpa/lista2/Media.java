package lista2;
import java.util.Scanner;
import java.util.Locale;

public class Media {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite a primeira nota: ");
        double n1 = ler.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2 = ler.nextDouble();

        double media = (n1 + n2) / 2;

        System.out.printf("Média: %.2f%n", media);

        if (media < 3) {
            System.out.println("ALUNO REPROVADO.");

        } else if (media >= 6) {
            System.out.println("ALUNO APROVADO.");

        } else { 
            
            System.out.println("ALUNO EM EXAME.");

            System.out.print("Digite a nota do exame: ");
            double exame = ler.nextDouble();

            double novaMedia = (media + exame) / 2;

            System.out.printf("Nova média: %.2f%n", novaMedia);

            if (novaMedia >= 6) {
                System.out.println("ALUNO APROVADO APÓS EXAME.");
            } else {
                System.out.println("ALUNO REPROVADO APÓS EXAME.");
            }
        }

        ler.close();
    }
}
