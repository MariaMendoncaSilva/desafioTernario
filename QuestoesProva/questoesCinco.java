package QuestoesProva;

import java.util.Scanner;

public class questoesCinco {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o primeiro número");
		double a = ler.nextDouble();
		System.out.println("DIgite o segundo número");
		double b = ler.nextDouble();
		System.out.println("Digite a operação (1 - Soma, 2 - Subtração, 3 - Multiplicação, 4 - Divisão) :");
		int op = ler.nextInt();
		
		double resultado;
		switch (op) {
		case 1:
			resultado = a + b;
			break;
		case 2:
			resultado = a - b;
			break;
		case 3:
			resultado = a * b;
			break;
		case 4:
			if (b !=0) {
				resultado = a / b;
			}else {
				System.out.println("Divisão por zero!");
				resultado = 0;
			}
			break;
			default:
				System.out.println("Operação inválida");
				resultado = 0;
		}
		System.out.println("Resultado" + resultado);
	}

}
