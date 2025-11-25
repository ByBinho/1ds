package lista1;
import java.util.Scanner;
import java.util.Locale;

public class Coelhos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in).useLocale(Locale.US);
		
		
		
		System.out.print("Digite a quantidade de coelhos: ");
		int coelho = ler.nextInt();
		
		double custo = (coelho * 0.70) / 18+10;
		
		System.out.printf("O custo da criação de coelhos é de "+custo+".");
		
		ler.close();
	}

}
