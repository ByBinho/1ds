package lista1;
import java.util.Scanner;
import java.util.Locale;

public class Salario {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Digite o seu salário: ");
		Double salario = ler.nextDouble();
		
		Double limite = salario * 0.30;
		System.out.println("Você pode comprometer até R$" + limite + " por mês sem ficar endividado");
		
		ler.close();
	}

}
