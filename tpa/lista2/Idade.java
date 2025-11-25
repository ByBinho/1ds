package lista2;
import java.util.Scanner;
import java.util.Locale;

public class Idade {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Digite o ano atual: ");
		int anoAtual = ler.nextInt();
		
		System.out.print("Digite o ano de seu nascimento: ");
		int anoNasc = ler.nextInt();
		
		int idade = (anoAtual-anoNasc);
		
		if(idade < 10) {
			System.out.print("Você tem "+idade+" anos, e é uma criança!");
		}else if(idade >= 10 && idade < 18) {
			System.out.print("Você tem "+idade+" anos, e é uma adolescente!");
		}else if(idade >= 18 && idade < 60) {
			System.out.print("Você tem "+idade+" anos, e é um adulto!");
		}else {
			System.out.print("Você tem "+idade+" anos, e é um idoso!");
		}
		
		ler.close();
		
	}
	
}
