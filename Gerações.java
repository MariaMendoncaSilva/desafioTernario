import java.util.Scanner;

public class Gerações {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("--- Descubra sua Geração ---");
		System.out.println("Digite o seu ano de nascimento");
		int ano = leitor.nextInt();
		System.out.println("Resultado:");
		if (ano < 1900) {
			System.out.println("Ano inválido ou muito antigo!");
		}else if (ano >= 1946 && ano <= 1964) {
			System.out.println("Você pertence à geração: Baby Boomers ");
		}else if (ano >= 1965 && ano <= 1980) {
			System.out.println("Você pertence à Geração X");
		}else if (ano >= 1981 && ano <= 1996) {
			System.out.println("Você pertence aos Millennials (Geração Y)!");
		}else if (ano >= 1997 && ano <= 2010) {
			System.out.println("Você pertence à Geração Z");
		}else if (ano >= 2010) {
			System.out.println("Você pertence à Geração Alpha");
		}else {
			System.out.println("Você pertence a uma geração anterior aos Baby Boomers.");
		}
		leitor.close();
	}

}
