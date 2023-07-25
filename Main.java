package media_ponderada;
import java.util.Scanner;
import java.util.Locale;


public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Qual a quantidade de casos que serão analisados?");
		int N = sc.nextInt();
		
		Double numeroUmCaseUm, numeroDoisCaseUm, numeroTresCaseUm;
		Double numeroUmCaseDois, numeroDoisCaseDois, numeroTresCaseDois;
		Double numeroUmCaseTres, numeroDoisCaseTres, numeroTresCaseTres;
		Double mediaPonderadaUm = null, mediaPonderadaDois = null, mediaPonderadaTres = null;
		int pesoUm = 2;
		int pesoDois = 3;
		int pesoTres = 5;
		
		for (int i = 0; i<N; i++) {
			
			
			if (i == 1) {
			numeroUmCaseUm = sc.nextDouble() * pesoUm;
			numeroDoisCaseUm = sc.nextDouble() * pesoDois;
			numeroTresCaseUm = sc.nextDouble() * pesoTres;
			mediaPonderadaUm = (numeroUmCaseUm + numeroDoisCaseUm + numeroTresCaseUm) / (pesoUm + pesoDois + pesoTres);
			}else if (i == 2) {
				numeroUmCaseUm = sc.nextDouble() * pesoUm;
				numeroDoisCaseUm = sc.nextDouble() * pesoDois;
				numeroTresCaseUm = sc.nextDouble() * pesoTres;
				mediaPonderadaDois = (numeroUmCaseUm + numeroDoisCaseUm + numeroTresCaseUm) / (pesoUm + pesoDois + pesoTres);
			}else{
				numeroUmCaseUm = sc.nextDouble() * pesoUm;
				numeroDoisCaseUm = sc.nextDouble() * pesoDois;
				numeroTresCaseUm = sc.nextDouble() * pesoTres;
				mediaPonderadaTres = (numeroUmCaseUm + numeroDoisCaseUm + numeroTresCaseUm) / (pesoUm + pesoDois + pesoTres);
			}
		}
		
	
		System.out.printf("%.1f%n", mediaPonderadaUm);
		System.out.printf("%.1f%n", mediaPonderadaDois);	
		System.out.printf("%.1f%n", mediaPonderadaTres);
	}

}
