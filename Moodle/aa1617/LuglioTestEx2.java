import java.util.Arrays;

public class LuglioTestEx2 {
	public static void main(String[] args) {
		boolean[] a0 = null;
		boolean[] a1 = {};
		boolean[] a2 = {false};
		boolean[] a3 = {false, true};
		boolean[] a4 = {true , true, false};
		boolean[] a5 = {true , true, true , true};
		boolean[] a6 = {false, true, false, true, false};
		boolean[] b0 = null;
		boolean[] b1 = {};
		boolean[] b2 = {false};
		boolean[] b3 = {false, false};
		boolean[] b4 = {true , true , false};
		boolean[] b5 = {true , true , true , true };
		boolean[] b6 = {false, false, false, false, false};
				
		Luglio2017.ex2(a0);
		System.out.println(Arrays.equals(a0,b0)==true); // atteso true perche':
		// a0 non viene modificata, non avendo elementi.

		Luglio2017.ex2(a1);
		System.out.println(Arrays.equals(a1,b1)==true); // atteso true perche':
		// a1 non viene modificata, non avendo elementi. 
		
		Luglio2017.ex2(a2);
		System.out.println(Arrays.equals(a2,b2)==true); // atteso true perche':
		// a2 non viene modificata perche' non ha elementi in posizione dispari.
		
		Luglio2017.ex2(a3);
		System.out.println(Arrays.equals(a3,b3)==true); // atteso true perche':
		// a3 viene modificata, contenendo elementi di posizione dispari diversi dagli
		// elementi di posizione pari che li procedono.
		
		Luglio2017.ex2(a4);
		System.out.println(Arrays.equals(a4,b4)==true); // atteso true perche':
		// a4 non viene modificata, non contenendo elementi di posizione dispari diversi dagli
		// elementi di posizione pari che li procedono.
		
		Luglio2017.ex2(a5);
		System.out.println(Arrays.equals(a5,b5)==true); // atteso true perche':
		// a5 non viene modificata, non contenendo elementi di posizione dispari diversi dagli
		// elementi di posizione pari che li procedono.
		
		Luglio2017.ex2(a6);
		System.out.println(Arrays.equals(a6,b6)==true); // atteso true perche':
		// a6 viene modificata, contenendo elementi di posizione dispari diversi dagli
		// elementi di posizione pari che li procedono.
	}
}
