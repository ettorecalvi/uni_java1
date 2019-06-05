import java.util.Arrays;

public class Giugno0TestEx2 {
	public static void main(String[] args) {
		int[] a0 = null;
		int[] a1 = {};
		int[] a2 = {1};
		int[] a3 = {1, 2};
		int[] a4 = {1, 2, 3};
		int[] a5 = {1, 2, 3, 4};
		int[] a6 = {1, 2, 3, 4, 5};
		int[] b0 = null;
		int[] b1 = {};
		int[] b2 = {1};
		int[] b3 = {2, 2};
		int[] b4 = {2, 2, 3};
		int[] b5 = {2, 2, 4, 4};
		int[] b6 = {2, 2, 4, 4, 5};
				
		Giugno0ConSoluzioni.ex2(a0);
		System.out.println(Arrays.equals(a0,b0)==true); // atteso true perche':
		// a0 e b0 non hanno elementi.

		Giugno0ConSoluzioni.ex2(a1);
		System.out.println(Arrays.equals(a1,b1)==true); // atteso true perche':
		// a1 e b1 non hanno elementi.
		
		Giugno0ConSoluzioni.ex2(a2);
		System.out.println(Arrays.equals(a2,b2)==true); // atteso true perche':
		// a ha un unico elemento.
		
		Giugno0ConSoluzioni.ex2(a3);
		System.out.println(Arrays.equals(a3,b3)==true); // atteso true perche':
		// a[0] deve essere sovrascritto da a[1].
		
		Giugno0ConSoluzioni.ex2(a4);
		System.out.println(Arrays.equals(a4,b4)==true); // atteso true perche':
		// solo a[0] e' da sovrascrivere con a[1]. Non ci sono elementi dopo a[2].
		
		Giugno0ConSoluzioni.ex2(a5);
		System.out.println(Arrays.equals(a5,b5)==true); // atteso true per
		// ragioni analoghe a quelle degli esempi precedenti.
		
		Giugno0ConSoluzioni.ex2(a6);
		System.out.println(Arrays.equals(a6,b6)==true); // atteso true per
		// ragioni analoghe a quelle degli esempi precedenti.
	}
}
