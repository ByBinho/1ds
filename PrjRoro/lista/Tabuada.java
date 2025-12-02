package lista;
import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {

	Scanner ler = new Scanner(System.in);
	
	int i, num, resultado=0;
	
	num = ler.nextInt();
	
	for(i=0; i<11; i++) {
		resultado = i * num;
		System.out.println(i + "x" + num + "=" + resultado);
	}
	
	ler.close();
}

}
