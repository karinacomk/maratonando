import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int teclados = sc.nextInt();
		sc.nextLine();

		
		List<Integer> indices = new ArrayList<Integer>();	

		for (int i = 0; i < teclados; i++) {
			
			int indice = sc.nextInt();
			
			indices.add(indice);
			
			
		}
		
		Collections.sort(indices);
		int roubados = 0;
		
		for (int i = indices.get(0); i <= indices.get(indices.size() - 1); i++) {
			
			if (!indices.contains(i)) {
				roubados++;
			}
		}
		
		System.out.println(roubados);
		
		
		
	}

}
