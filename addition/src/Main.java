import java.util.Scanner;
 
class Main {

    public static void main(String args[]) {
        int a, b;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        System.out.println(summation(a, b));
    }

    static int summation(int a, int b) {	
        int result = a + b;
        return result;	
    }	
}