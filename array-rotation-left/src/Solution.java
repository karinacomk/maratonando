public class Solution {

	static int[] rotLeft(int[] a, int d) {
		int size = a.length;
		
		int[] aCopy = new int[size]; 
		
		//System.arraycopy(src, srcPos, dest, destPos, length);
		System.arraycopy(a, d, aCopy, 0, size - d);
		System.arraycopy(a, 0, aCopy, size - d, d);
		
		return aCopy;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int d = 4;
		
		int result[] = rotLeft(a, d);
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);			
		}
	}
}
