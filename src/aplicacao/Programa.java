package aplicacao;

import java.util.LinkedHashSet;
import java.util.Set;

public class Programa {

	public static void main(String[] args) {
		/*
		 * HashSet é a implementação mais rápida só que não garante a ordem
		 * Portante se não importar a ordem utilize HashSet
		 * Declaração abaixo
		 */
		//Set<String> set = new HashSet<>();
		
		/*
		 * TreeSet garante a ordem crescente, porém não é o mais rápido
		 * Declaração abaixo
		 */
		//Set<String> set = new TreeSet<>();
		
		/*
		 * LinkedHashSet mantém a ordem em que os elementos são inseridos
		 */
		Set<String> set = new LinkedHashSet<>();
				
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		
		//removeIf remove de acordo com o critério
		//set.removeIf(x -> x.length() >= 3); //remove x tal que seja maior que 3
		
		//remove x tal que a primeira letra seja T
		set.removeIf(x -> x.charAt(0) == 'T'); //remove todos que começam com 'T'
		
		System.out.println(set.contains("TV")+"\n");
		
		for(String item : set) {
			System.out.println(item);
		}
		

	}

}
