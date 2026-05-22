import java.util.Scanner;

public class ModoEngenharia2 {
public static void main(String[] args) {
	double kilos = 0;
	double tempo = 0;
	Scanner ler = new Scanner (System.in);
	System.out.println("Informar a quantidade de kilos: ");
	kilos = ler.nextDouble();
	System.out.println("Informar o tempo: ");
	tempo = ler.nextDouble();
	ler.close();
	double quantidade= kilos * tempo;
	System.out.println("A quantidade consumida foi: " + quantidade + "tempo");
}
}
