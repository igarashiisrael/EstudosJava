package sessao1a7;

public class TestaValores {
	
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10;
		
		
		//quanto vale o segundo? 
		//vale 5;
		System.out.println(segundo);
		
		String saudacao = "Ol�, meu nome � ";
		String nome = "R�mulo ";
		String continuacao = "e minha idade � ";
		int idade = 100;
		System.out.println(saudacao+nome+continuacao+idade);
	}

}
