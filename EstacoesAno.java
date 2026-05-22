import java.util.Scanner;

public class EstacoesAno {
public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	System.out.print("Nome: ");
	String nome = leitor.nextLine();

    System.out.print("Mês (1-12): ");
    int mes = leitor.nextInt();
    String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", 
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
    String nomeMes = (mes >= 1 && mes <= 12) ? meses[mes - 1] : "Inválido";
    String estacao = (mes == 12 || mes <= 2) ? "Verão" :
        (mes <= 5) ? "Outono" :
        (mes <= 8) ? "Inverno" :
        (mes <= 11) ? "Primavera" : "Mês Inválido";
    System.out.printf("%s, o mês %s corresponde ao %s.%n", nome, nomeMes, estacao);
    
    leitor.close();
}
}
