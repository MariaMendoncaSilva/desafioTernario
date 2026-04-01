import java.util.Scanner;

public class Personagem {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o nome do personagem");
		String nome = ler.nextLine();
		System.out.println("Digite a pontuação de força (1 a 100): ");
		int forca = ler.nextInt();
		System.out.println("\n--- Resultado da Avaliação ---");
		if (forca < 1 || forca > 100) {
			System.out.println("Erro: \"\\n--- Resultado da Avaliação ---\"");
		} else if(forca<= 20) {
			System.out.println("\"O personagem \" + nome + \" é nível: Iniciante\"");
		} else if(forca<= 50) {
			System.out.println("O personagem " + nome + " é nível: Guerreiro");
		} else if(forca<= 80) {
			System.out.println("O personagem " + nome + " é nível: Elite");
		} else {
			System.out.println("O personagem " + nome + " é nível: Lendário");
			ler.close();
		}
		
		
		
		
	}

}
