
	import java.util.Scanner;

	public class SignosZodiaco {
	    public static void main(String[] args) {
	        Scanner leitor = new Scanner(System.in);

	        System.out.print("Dia do nascimento: ");
	        int dia = leitor.nextInt();
	        System.out.print("Mês do nascimento (1-12): ");
	        int mes = leitor.nextInt(); int data = mes * 100 + dia;
	        String signo = (data <= 119) ? "Capricórnio" :
	                       (data <= 218) ? "  Aquário" :
	                       (data <= 320) ? "Peixes" :
	                       (data <= 419) ? "Áries" :
	                       (data <= 520) ? "Touro" :
	                       (data <= 620) ? "Gêmeos " :
	                       (data <= 722) ? "Câncer" :
	                       (data <= 822) ? "Leão" :
	                       (data <= 922) ? "Virgem" :
	                       (data <= 1022) ? "Libra" :
	                       (data <= 1121) ? "Escorpião " :
	                       (data <= 1221) ? "Sagitário" : "Capricórnio";

	        System.out.println("---------------------------");
	        System.out.println("Seu signo é: " + signo);
	        
	        leitor.close();
	    }
	}

