package aplicacao;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

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
		
		/*ComentadoParaTeste do relacaoDeConjuntos
		 
		System.out.println(set.contains("TV")+"\n");
		
		for(String item : set) {
			System.out.println(item);
		}
		
		*/
		
		relacaoDeConjuntos();

	}
	
	
	public static void relacaoDeConjuntos() {
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(1,3,5,6,7,8,9,10));
		
		System.out.println(" Conjunto A");
		for(Integer i : a) {
			System.out.print(" "+i);
		}
		
		System.out.println("\n Conjunto B");
		for(Integer i : b) {
			System.out.print(" "+i);
		}
		
		System.out.println("\n----------------------------------------------");

		//union - cria um c que será cópia do a
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.print(" Union: "+c);


		//intersection - será os valores que são em comuns em ambos os conjuntos
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.print("\n Intersection: "+d);

		//difference - será os valores que são diferentes
		Set<Integer> e = new TreeSet<>(a);
		c.removeAll(b);
		System.out.print("\n Difference: "+e);

		
		
		
		
	}

}
