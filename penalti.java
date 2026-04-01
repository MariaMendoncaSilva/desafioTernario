import java.util.Random;
import java.util.Scanner;

public class penalti {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Random gerador = new Random();
		System.out.println("Batedor de pênaltis");
		System.out.println("Escolha onde quer chutar");
		System.out.println("1 = esquerda");
		System.out.println("2 = meio");
		System.out.println("3 = direita");
		
		System.out.println("Sua escolha :");
		int chuteJogador = leitor.nextInt();
		int escolhaGoleiro = gerador.nextInt(3) + 1;
		System.out.println("\n---------------------------");
		
		if ( chuteJogador < 1 || chuteJogador > 3) {
			System.out.println("Você chutou para fora do estádio! Escolha 1, 2 ou 3");
		}else {
			if (escolhaGoleiro == 1) System.out.println("O goleiro pulou na esquerda!");
			else if (escolhaGoleiro == 2) System.out.println("O goleiro pulou no meio!");
			else System.out.println("O goleiro pulou na direita!");
			
			if (chuteJogador != escolhaGoleiro) {
				System.out.println("goooooool!");
			}else {
				System.out.println("Defendeuu!");
			}
		}
		System.out.println("---------------------------");
		leitor.close();
	}

}
