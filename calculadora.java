import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {
		
	double valor1, valor2;
	int operacao;
	Scanner ler = new Scanner(System.in);
	System.out.println("Informe o primeiro valor: ");
	valor1 = ler.nextDouble();
	System.out.println("Informe o segundo valor: ");
	valor2 = ler.nextDouble();
	System.out.println("1 - soma / 2 - subtração / 3 - multiplicação / 4 divisão");
	operacao = ler.nextInt();
	ler.close();
	switch ( operacao ) {
	case 1:
		System.out.println(valor1+valor2);
		break;
	case 2:
		System.out.println(valor1-valor2);
		break;
	case 3:
		System.out.println(valor1*valor2);
		break;
	case 4:
		System.out.println(valor1/valor2);
		break;
		default:
			System.out.println("operação inválida!!!");
		
	}
	}

}
