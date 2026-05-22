package QuestoesProva;

import java.util.Scanner;

public class questaoTres {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	System.out.println("Digite a nota: ");
			double nota = ler.nextDouble();
			ler.close();
	if (nota >= 7) {
		System.out.println("Aprovado");
	}
	else if (nota>= 5 && nota < 7)
	{
		System.out.println("Recuperação");
	}
	else {
		System.out.println("Reprovado");
	}
}
  
}
