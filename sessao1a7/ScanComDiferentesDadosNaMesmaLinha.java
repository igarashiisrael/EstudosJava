package sessao1a7;

import java.util.Scanner;

public class ScanComDiferentesDadosNaMesmaLinha {

	public static void main(String[] args) {
		
		System.out.printf("Digite uma sting, um número inteiro e um decimal, divididos por espaço: ");
		Scanner sc = new Scanner(System.in);
		String x;
		int y;
		double z;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}

}
