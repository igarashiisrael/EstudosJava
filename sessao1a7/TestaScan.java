package sessao1a7;

import java.util.Scanner;

public class TestaScan {
	
	public static void main(String[] args) {
		
		System.out.print("Digite um n�mero decimal utilizando . (ponto): ");
		Scanner sc = new Scanner(System.in);
		
		double x;
		x = sc.nextDouble();
			System.out.printf("Voc� digitou: " + x);
		sc.close();
		
	}

}
