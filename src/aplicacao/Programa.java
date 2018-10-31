package aplicacao;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

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

		//union - cria um c que ser� c�pia do a
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.print(" Union: "+c);


		//intersection - ser� os valores que s�o em comuns em ambos os conjuntos
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.print("\n Intersection: "+d);

		//difference - ser� os valores que s�o diferentes
		Set<Integer> e = new TreeSet<>(a);
		c.removeAll(b);
		System.out.print("\n Difference: "+e);

		
		
		
		
	}

}
