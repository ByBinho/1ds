package listafixação;
import java.util.Scanner;
import java.util.Locale;

public class Numero {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Digite o número: ");
		double num =  ler.nextDouble();
		
		if(num < 0) {
			System.out.print("O número digitado é negativo.");
		}else if(num == 0) {
			System.out.print("O número é digitado é neutro.");
		}else {
			System.out.print("O número digitado é positivo.");
		}
		
		ler.close();
		

	}

}
