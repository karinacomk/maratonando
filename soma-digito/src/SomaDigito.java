
public class SomaDigito {
	//https://programacaopratica.com.br/2019/03/07/somar-todos-os-digitos-de-um-numero/
	public static void main(String[] args) {
		System.out.println(sum(123));
	}
	
	static int sum(int n) {
		int sum = 0;
		
		while (n > 0) {
			System.out.println("N comeco = " + n);
			sum += n % 10;// retorna o resto
			System.out.println("sum = (ja somando o anterior) " + sum);
			n /= 10;// N dividido por 10
			System.out.println("N = " + n + "\n");
		}
		
		return sum;
	}

}
