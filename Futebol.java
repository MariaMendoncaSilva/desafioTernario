import java.util.Scanner;

public class Futebol {
	
	public static void main(String[] args) {
		//ENTRADA
		double finalizacao = 0;
		double gols = 0;
		
		Scanner chute = new Scanner (System.in);
		
		System.out.println("Informe o total de finalização: ");
		finalizacao = chute.nextDouble();
		
		System.out.println("Informe o total de gols: ");
		gols = chute.nextDouble();
		
		chute.close();
		//PROCESSAMENTO
		double eficiencia = ((gols/finalizacao) * 100);
		
		//SAIDA
	System.out.println("O desempenho do atleta é "+ eficiencia + "%");
	}

}
