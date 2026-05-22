import java.util.Scanner;

public class CentroEsportivo {
	
	public static void main(String[] args) {
		double  investidor,
		        equipamentos, 
		        uniformes,
		        tecnologias,
		        investimento,
		        cota ;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o numero de investidores: ");
		investidor = ler.nextDouble();
		
		System.out.println("Informe o valor total de equipamentos: ");
		equipamentos = ler.nextDouble();
		
		System.out.println("Informe o valor total de uniformes: ");
		uniformes = ler.nextDouble();
		
		System.out.println("Informe o valor total de tecnologias: ");
		tecnologias = ler.nextDouble();
		ler.close();
		investimento = (equipamentos+uniformes+tecnologias);
		cota = (investimento/investidor);
		System.out.println("O investimento total é: R$" + investimento);
		System.out.println("A cota de cada investidor é: R$" + cota);
				
		
		
	}

}
