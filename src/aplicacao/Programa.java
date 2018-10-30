package aplicacao;

import java.util.LinkedHashSet;
import java.util.Set;

public class Programa {

	public static void main(String[] args) {
		/*
		 * HashSet � a implementa��o mais r�pida s� que n�o garante a ordem
		 * Portante se n�o importar a ordem utilize HashSet
		 * Declara��o abaixo
		 */
		//Set<String> set = new HashSet<>();
		
		/*
		 * TreeSet garante a ordem crescente, por�m n�o � o mais r�pido
		 * Declara��o abaixo
		 */
		//Set<String> set = new TreeSet<>();
		
		/*
		 * LinkedHashSet mant�m a ordem em que os elementos s�o inseridos
		 */
		Set<String> set = new LinkedHashSet<>();
				
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		
		//removeIf remove de acordo com o crit�rio
		//set.removeIf(x -> x.length() >= 3); //remove x tal que seja maior que 3
		
		//remove x tal que a primeira letra seja T
		set.removeIf(x -> x.charAt(0) == 'T'); //remove todos que come�am com 'T'
		
		System.out.println(set.contains("TV")+"\n");
		
		for(String item : set) {
			System.out.println(item);
		}
		

	}

}
