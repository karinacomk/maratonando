import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int numero = sc.nextInt();
			
			if (numero == 0) {
				break;
			}
			
			System.out.println("f91(" + numero + ") = " + f91(numero));
		}
	}

	private static int f91(int numero) {
		int resultado = 0;
		
		if (numero <= 100 && numero != 0) {
			resultado = f91(f91(numero + 11));
		} else if (numero >= 101) {
			resultado = numero - 10;
		}
		
		return resultado;
	}

}
