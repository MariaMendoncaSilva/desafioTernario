package QuestoesProva;

import java.util.Scanner;

public class questaoQuatro {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		int opcao = ler.nextInt();
		System.out.println("Digite dois números:");
		int a = ler.nextInt();
		int b = ler.nextInt();
		ler.close();
		switch (opcao) {
		case 1:
			System.out.println(a + b);
			break;
		case 2:
			System.out.println(a - b);
			break;
			default:
				System.out.println("Opção inválida");
		}
	}

}
