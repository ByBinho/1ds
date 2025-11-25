package lista1;

import java.util.Scanner;
import java.util.Locale;

public class Inss {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Digite o valor da sua hora aula: ");
		int valorHora = ler.nextInt();
		
		System.out.print("Digite o numero de aulas dadas no mês: ");
		int aulasMes = ler.nextInt();
		
		System.out.print("Digite o percentual de desconto do Inss: ");
		double percentualInss = ler.nextDouble();
		
		double salarioBruto = valorHora * aulasMes;
		double desconto = salarioBruto (percentualInss / 100);
		double salarioLiquido = salarioBruto - desconto;
		
		System.out.print("O seu Salário Líquido é de R$" + salarioLiquido);
		
		

		ler.close();
		
		
		
	}

	private static double salarioBruto(double d) {
		// TODO Auto-generated method stub
		return 0;
	}

}
