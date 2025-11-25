package listaswitchcase;
import java.util.Scanner;

public class Rodizio {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o último número da placa (0 a 9): ");
        int digito = ler.nextInt();

        switch (digito) {
            case 1:
            case 2:
                System.out.println("Não pode circular na SEGUNDA-FEIRA.");
                break;

            case 3:
            case 4:
                System.out.println("Não pode circular na TERÇA-FEIRA.");
                break;

            case 5:
            case 6:
                System.out.println("Não pode circular na QUARTA-FEIRA.");
                break;

            case 7:
            case 8:
                System.out.println("Não pode circular na QUINTA-FEIRA.");
                break;

            case 9:
            case 0:
                System.out.println("Não pode circular na SEXTA-FEIRA.");
                break;

            default:
                System.out.println("Dígito inválido!");
        }

        ler.close();
    }
}
