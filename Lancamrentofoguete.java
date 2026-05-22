import java.util.Scanner;

public class Lancamrentofoguete {

	public static void main(String[] args) {
	//ENTRADA
	int velocidade = 0;
	int tempo = 0;
	Scanner ler = new Scanner(System.in);
	
	System.out.println("informe a velocidade:");
	velocidade = ler.nextInt();
	
	System.out.println("Infore o tempo :");
	tempo = ler.nextInt();
	
	ler.close();
	
	//PROCESSAMENTO
	int altura = velocidade * tempo;
	//SAIDA
	
	System.out.println(" A altura do foguete é: " + altura +" metros");
}
}
