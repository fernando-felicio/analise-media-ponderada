package media_ponderada;
import java.util.Scanner;
import java.util.Locale;


public class Main {

	public static void main(String[] args) {

	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Qual a quantidade de casos que serão analisados?");
	    int N = sc.nextInt();

	    int pesoUm = 2;
	    int pesoDois = 3;
	    int pesoTres = 5;
	    
	    for (int i = 0; i < N; i++) {
	        System.out.println("Digite três números para o caso " + (i + 1) + ":");
	        Double numeroUm = sc.nextDouble();
	        Double numeroDois = sc.nextDouble();
	        Double numeroTres = sc.nextDouble();
	        
	        // Cálculo da média ponderada para o caso atual
	        Double mediaPonderada = (numeroUm * pesoUm + numeroDois * pesoDois + numeroTres * pesoTres) / (pesoUm + pesoDois + pesoTres);
	        
	        System.out.printf("Média ponderada para o caso %d: %.1f%n", (i + 1), mediaPonderada);
	    }
	    
	    sc.close();
	}
}
