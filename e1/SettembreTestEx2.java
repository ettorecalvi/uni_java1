import java.util.Arrays;

public class SettembreTestEx2 {
	public static void main(String[] args) {
		int[] a0 = null;
		int[] a1 = {};
		int[] a2 = {1};
		int[] a3 = {1, 2};
		int[] a4 = {1 , 2, 3};
		int[] a5 = {1 , 2, 3, 4};
		int[] b0 = null;
		int[] b1 = {};
		int[] b2 = {1};
		int[] b3 = {2, 1};
		int[] b4 = {2 , 1, 3};
		int[] b5 = {2 , 1, 4, 3};
				
		Settembre2017.ex2(a0);
		System.out.println(Arrays.equals(a0,b0)==true); // atteso true perche':
		// a0 non viene modificata, non avendo elementi.

		Settembre2017.ex2(a1);
		System.out.println(Arrays.equals(a1,b1)==true); // atteso true perche':
		// a1 non viene modificata, non avendo elementi. 
		
		Settembre2017.ex2(a2);
		System.out.println(Arrays.equals(a2,b2)==true); // atteso true perche':
		// a2 non viene modificata, avendo un singolo elemento.
		
		Settembre2017.ex2(a3);
		System.out.println(Arrays.equals(a3,b3)==true); // atteso true perche':
		// a3 viene modificata, scambiando i due elementi esistenti.
		
		Settembre2017.ex2(a4);
		System.out.println(Arrays.equals(a4,b4)==true); // atteso true perche':
		// a4 viene modificata, scambiando i soli primi due elementi. Il terzo non 
		// e' scambiabile con quello di posizione dispari successivo che non esiste.
		
		Settembre2017.ex2(a5);
		System.out.println(Arrays.equals(a5,b5)==true); // atteso true perche':
		// a5 non viene modificata, non contenendo elementi di posizione dispari diversi dagli
		// elementi di posizione pari che li procedono.
	}
}
