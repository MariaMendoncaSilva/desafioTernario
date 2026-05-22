package DoWhile;

import java.util.Scanner;

public class CaixaEletronico {
		    public static void main(String[] args) {
		        Scanner ler = new Scanner (System.in);
		        double saldo = 1000;
		        int opcao;
		        do {
		            System.out.print("1-Saldo 2-Deposita 3-Sacar 4-Sair ");
		            opcao = ler.nextInt();
		            if (opcao == 1) {
		                System.out.println("Saldo: " + saldo);
		            } 
		            else if (opcao == 2) {
		                System.out.print("Valor do depósito: ");
		                saldo += ler.nextDouble();
		            } 
		            else if (opcao == 3) {
		                System.out.print("Valor do saque: ");
		                double saque = ler.nextDouble();
		                if (saque <= saldo) {
		                    saldo -= saque; 
		                } else {
		                    System.out.println("Saldo insuficiente");
		                }
		            }
		        } while (opcao != 4);
		        System.out.println("Fim!");
		        ler.close();
		    }
}


