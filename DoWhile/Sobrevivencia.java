package DoWhile;

import java.util.Scanner;

public class Sobrevivencia {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int vida = 100;
		do {
			System.out.print("Dano: ");
			int dano = ler.nextInt();
			vida -= dano;
			System.out.println("Vida: " + (vida < 0 ? 0 : vida));
		} while (vida > 0);
		
		System.out.println("perdeu");
		ler.close();
	}
}
