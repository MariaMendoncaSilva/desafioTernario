package DoWhile;

import java.util.Scanner;

public class lanchonete {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
	    int opcao;
	    int itens = 0;
	    double total = 0;
	    do {
	        System.out.println("MENU ");
	        System.out.println("1  Hambúrguer -> R$20");
	        System.out.println("2  Refrigerante -> R$8");
	        System.out.println("3 Batata Frita -> R$15");
	        System.out.println("4 Finalizar pedido");
	        System.out.print("Escolha uma opção: ");
	        opcao = ler.nextInt();
	        switch (opcao) {
	            case 1:
	                total += 20;
	                itens++;
	                System.out.println("Hambúrguer adicionado");
	                break;
	            case 2:
	                total += 8;
	                itens++;
	                System.out.println("Refrigerante adicionado");
	                break;
	            case 3:
	                total += 15;
	                itens++;
	                System.out.println("Batata Frita adicionada");
	                break;
	            case 4:
	                System.out.println("Finalizando pedido");
	                break;
	            default:
	                System.out.println("Opção inválida");
	        }
	        System.out.println();
	    } while (opcao != 4);
	    if (total > 100) {
	        total = total - (total * 0.10);
	    }
	    System.out.println("Quantidade de itens: " + itens);
	    System.out.println("Valor final: R$" + total);

	    ler.close();
	}
}

