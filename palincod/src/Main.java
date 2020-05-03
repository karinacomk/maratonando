import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt(); // nao le caractere em branco, linha vazia
		sc.nextLine();
		
		for (int i = 1; i <= casos; i++) {
			System.out.print(i + " ");
			String palavra = sc.nextLine();
			
			if (ehPalindromo(palavra)) {
				 System.out.println("\"YES\"");
			} else {
				 System.out.println("\"NO\"");
			}					
		}
		
	}

	private static boolean ehPalindromo(String palavra) {
		palavra  = palavra.replace(" ", "");
		//System.out.println(palavra + " " + palavra.length() + " caracteres");
		
		for (int i = 0; i < palavra.length(); i++) {
			char esquerda = palavra.charAt(i);
			char direita = palavra.charAt(palavra.length() - 1 - i);
			
			//System.out.print("esquerda " + esquerda);
			//System.out.println(" direita " + direita);
			
			if (esquerda != direita) {
				return false;
			}
		}
		
		return true;
	}

}
