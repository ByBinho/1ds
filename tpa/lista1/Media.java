package lista1;
import java.util.Scanner;
import java.util.Locale;

public class Media {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in).useLocale(Locale.US);

		System.out.print("Digite a 1ª nota do aluno: ");
		Double n1 = ler.nextDouble();
		
		System.out.print("Digite a 2ª nota do aluno: ");
		Double n2 = ler.nextDouble();
		
		System.out.print("Digite a 3ª nota do aluno: ");
		Double n3 = ler.nextDouble();
		
		System.out.print("Digite a 4ª nota do aluno: ");
		Double n4 = ler.nextDouble();
		
		Double media = (n1 + n2 + n3 + n4) / 4;
		System.out.println(media);
		
		ler.close();
		
	}

}
