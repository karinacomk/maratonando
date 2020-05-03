import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int tamanho = sc.nextInt();
		sc.nextLine();

		List<Integer> numeros = new ArrayList<Integer>();	
		
		for (int i = 0; i < tamanho; i++) {
			numeros.add(sc.nextInt());
		}
		
		int resultado = 0;
		
		for (int i = 0; i <= numeros.size()-3; i++) {
			if (numeros.get(i) == 1) {
				int proximo = numeros.get(i+1);
				int proximoProximo = numeros.get(i+2); 
				
				if (proximo == 0 && proximoProximo == 0) {
					resultado++;
					i+=3;
				}				
			}
		}
		
		System.out.println(resultado);
		
		
	}

}
