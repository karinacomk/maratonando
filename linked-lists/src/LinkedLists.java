import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedLists {

	public static void main(String[] args) {
		 Set<String> cursos = new HashSet<String>();
	        cursos.add("PHP");
	        cursos.add("Java");
	        cursos.add("PL/SQL");
	        cursos.add("Adobe");
	        cursos.add("PHP");
	        
	         
	        Set<String> ord = new TreeSet<String>(cursos);
	         
	        System.out.println("Sem ordenação: "+cursos);
	        System.out.println("Com ordenação: "+ord);



	}

}
