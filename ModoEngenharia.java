import java.util.Scanner;
public class ModoEngenharia {
	public static void main(String[] args) {
		int velocidade = 0;
		int tempo = 0;
		Scanner ler = new Scanner (System.in);
		System.out.println("Informe a velocidade:");
		velocidade = ler.nextInt();
		System.out.println("Informe o tempo:");
		tempo = ler.nextInt();
		ler.close();
		int altura = velocidade * tempo;
				System.out.println(" A altura que o foguete alcançou é: " + altura + " metros");
	}

}
