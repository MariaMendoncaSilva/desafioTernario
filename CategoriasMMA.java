import java.util.Scanner;

public class CategoriasMMA {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("--- Sistema de Classificação MMA ---");
		System.out.println("Informe o sexo (M para Masculino / F para Feminino): ");
		char sexo = leitor.next().toUpperCase().charAt(0);
		System.out.println("Informe o peso (kg): ");
        double peso = leitor.nextDouble();
        System.out.println("\nResultado:");
        if (sexo == 'M') {
        	if (peso <= 56.7) {
                System.out.println("Categoria: Peso Mosca");
            } else if (peso <= 61.2) {
                System.out.println("Categoria: Peso Galo");
            } else if (peso <= 65.8) {
                System.out.println("Categoria: Peso Pena");
            } else if (peso <= 70.3) {
                System.out.println("Categoria: Peso Leve");
            } else if (peso <= 77.1) {
                System.out.println("Categoria: Peso Meio-Médio");
            } else if (peso <= 83.9) {
                System.out.println("Categoria: Peso Médio");
            } else if (peso <= 93.0) {
                System.out.println("Categoria: Peso Meio-Pesado");
            } else {
                System.out.println("Categoria: Peso Pesado");
            }
        }else if (sexo == 'F') {
            if (peso <= 52.2) {
                System.out.println("Categoria: Peso Palha");
            } else if (peso <= 56.7) {
                System.out.println("Categoria: Peso Mosca");
            } else if (peso <= 61.2) {
                System.out.println("Categoria: Peso Galo");
            } else {
                System.out.println("Categoria: Peso Pena");
            }
        }else {
            System.out.println("Erro: Sexo inválido! Por favor, use M ou F.");
        }

        leitor.close();
    }
        }
	
