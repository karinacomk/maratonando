import java.util.Collections;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class BuscaBinaria {
	
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
        lista.add(new Integer(12));

         
        System.out.println("Lista na ordem crescente:");
        Collections.sort(lista);
        System.out.println(lista);
        //Set<Integer> ordena = new TreeSet<Integer>(lista);
         
        int valor = Integer.parseInt(JOptionPane
        .showInputDialog("Digite o valor procurado:"));
         
        int indice = Collections.binarySearch(lista, valor);
        System.out.println("O item buscado esta na posicao: " + indice);
   
  }

}
