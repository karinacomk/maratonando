import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (scanner.hasNext()) {
			int i = scanner.nextInt();
			int j = scanner.nextInt();
			int maiorCicloAteAgora = 1;
			
			for (int atual = Math.min(i, j); atual <= Math.max(i, j); atual++) {
				int resultado = calculaPara(atual);
				
				if (resultado > maiorCicloAteAgora) {
					maiorCicloAteAgora = resultado;
				}
			}
			
			System.out.println(i + " " + j + " " +  maiorCicloAteAgora);
			
		}
	}

	private static int calculaPara(int n) {
		int impressos = 1;
		
		while (n != 1) {
			if (n % 2 == 1) {
				n = 3 * n + 1;
			} else {
				n = n/2;
			}
			
			impressos++;
			
		}
		
		return impressos;
	}
}