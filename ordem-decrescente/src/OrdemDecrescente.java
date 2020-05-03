import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class OrdemDecrescente {
	
	public static void main(String args[]) {
		  
        LinkedList<Integer> lista = new LinkedList<Integer>();
        lista.add(new Integer(10));
        lista.add(new Integer(20));
        lista.add(new Integer(5));
        lista.add(new Integer(3));
        lista.add(new Integer(10));
        lista.add(new Integer(-5));
        lista.add(new Integer(6));              
        lista.add(new Integer(8));
        lista.add(new Integer(-2));
        lista.add(new Integer(4));

         
        System.out.println("Lista na ordem crescente:");
        Collections.sort(lista);
        for (Integer i : lista) {
               System.out.println(i);
        }
         
        System.out.println("Lista na ordem decrescente:");
        Comparator<Integer> r = Collections.reverseOrder();
        Collections.sort(lista, r);
        for (Integer i : lista) {
               System.out.println(i);
        }
   
  }
	
	

}
