package DoWhile;

import java.util.Scanner;

public class CofreSecreto {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String senha;
		int tentativas = 0;
		do {
			System.out.println("Digite a senha:");
			senha = ler.next();
			if (!senha.equals("1234"));
			System.out.println("Acesso negado, tente novamente");
		} while (!senha.equals("1234"));
	tentativas ++;
	System.out.println("Acesso liberado");
	ler.close();
	
	

}
} 
