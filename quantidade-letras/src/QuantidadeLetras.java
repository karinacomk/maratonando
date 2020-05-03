import java.util.LinkedHashMap;
import java.util.Map;

public class QuantidadeLetras {
	public static void main(String[] args) {
		quantidadeLetras("jAcaa"); 
	}
	
	public static void quantidadeLetras(String palavra) {
		Map<String, Integer> letras = new LinkedHashMap<String, Integer>();

		for (int i = 0; i < palavra.length(); i++) {
			
			if (!letras.containsKey(String.valueOf(palavra.charAt(i)))) {
				letras.put(String.valueOf(palavra.charAt(i)), new Integer(1));				
			} else {
				letras.put(String.valueOf(palavra.charAt(i)), new Integer(1) + 1);	
			}
		}
		
		for (String key : letras.keySet()) {
			System.out.println("Letra = " + key + " , " + "Quantidade = " + letras.get(key) );
		}
	}
	
	
	
	

}
