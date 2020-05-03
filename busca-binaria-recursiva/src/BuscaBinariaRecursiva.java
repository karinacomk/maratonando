import java.util.Arrays;

public class BuscaBinariaRecursiva {
	
	public static void main(String[] args) {
		int[] array = { 1, 8, 34, 67, 9, 6, 78, 12, 56, 41, 90 };
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		System.out.println(busca(array, 91));
		System.out.println(busca(array, 78));
		System.out.println(busca(array, 90));
	}

	private static int busca(int[] array, int chave) {
		return buscaBinariaRecursiva(array, 0, array.length - 1, chave);
	}

	private static int buscaBinariaRecursiva(int[] array, int menor, int maior,
			int chave) {
		int media = (maior + menor) / 2;
		int valorMeio = array[media];

		if (menor > maior)
			return -1;
		else if(valorMeio == chave) 
			return media;
		else if (valorMeio < chave)
			return buscaBinariaRecursiva(array, media+1, maior, chave);
		else
			return buscaBinariaRecursiva(array, menor, media-1, chave);
	}
}
