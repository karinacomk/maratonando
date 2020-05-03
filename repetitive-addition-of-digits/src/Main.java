import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		sc.nextLine();
		
		while (sc.hasNext()) {
			int numero = sc.nextInt();
			
			int soma = somaDig(numero);
			System.out.println(soma);
		}
	}

	private static int somaDig(int n) {
		int soma = 0;		
		
		while (n > 0) {
			soma += n % 10;
			n = n/10;
		}
		
		return soma;
	}

}
