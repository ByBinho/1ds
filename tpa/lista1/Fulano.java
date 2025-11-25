package lista1;
import java.util.Scanner;
import java.util.Locale;

public class Fulano {

		public static void main(String[] args) {
		Scanner ler = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Digite o seu nome: ");
		String nome = ler.nextLine();
		
		System.out.print("Digite o ano atual: ");
		int anoAtual = ler.nextInt();
		
		System.out.print("Digite o ano em que você nasceu: ");
		int anoNasc = ler.nextInt();
		
		int idade = (anoAtual - anoNasc);
		
		System.out.println( nome +", você tem " + idade + " anos.");
		
		ler.close();
	}
}
